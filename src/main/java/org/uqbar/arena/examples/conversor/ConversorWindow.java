package org.uqbar.arena.examples.conversor;

import java.awt.Color;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;

/**
 * Ejemplo de conversor de medidas con el framework Arena. Es una ventana que tiene como modelo una instancia
 * de la clase {@link Conversor}.
 * 
 * Muestra:
 * <ul>
 * <li>un textbox donde se ingresa el valor de entrada</li>
 * <li>un botón para ejecutar la conversión.</li>
 * <li>un label donde se muestra el resultado de la conversión.</li>
 * </ul>
 * 
 * @author npasserini
 */
@SuppressWarnings("serial")
public class ConversorWindow extends MainWindow<Conversor> {

	public ConversorWindow() {
		super(new Conversor());
	}

	@Override
	public void createContents(Panel mainPanel) {
		this.setTitle("Conversor de millas a kilómetros");
		mainPanel.setLayout(new VerticalLayout());

		new Label(mainPanel).setText("Ingrese la longitud en millas");

		new NumericField(mainPanel).bindValueToProperty("millas");

		new Button(mainPanel)
			.setCaption("Convertir a kilómetros")
			.onClick(()-> this.getModelObject().convertir());

		new Label(mainPanel) //
			.setBackground(Color.ORANGE)
			.bindValueToProperty("kilometros");

		new Label(mainPanel).setText(" kilómetros");
	}

	public static void main(String[] args) {
		new ConversorWindow().startApplication();
	}
}
