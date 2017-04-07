package org.uqbar.arena.examples.monedero;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;

public class MonederoWindow  extends MainWindow<MonederoViewModel> {

  public MonederoWindow() {
    super(new MonederoViewModel());
  }

  @Override
  public void createContents(Panel mainPanel) {
    this.setTitle("Mi monedero :D");
    mainPanel.setLayout(new VerticalLayout());

    new Label(mainPanel)
      .setText("Saldo");

    new Label(mainPanel)
      .bindValueToProperty("saldo");
    
    new Label(mainPanel)
      .setText("Monto");

    new TextBox(mainPanel)
      .bindValueToProperty("monto");

    new Button(mainPanel)
      .setCaption("Depositar")
      .onClick(() -> this.getModelObject().depositar());
    
    new Button(mainPanel)
      .setCaption("Extraer")
      .onClick(() -> this.getModelObject().extraer());
       
  }

  public static void main(String[] args) {
    new MonederoWindow().startApplication();
  }
}
