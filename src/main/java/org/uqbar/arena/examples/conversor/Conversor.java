package org.uqbar.arena.examples.conversor;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public class Conversor {
	public static double FACTOR_CONVERSION = 1.60934;
	
	private double millas;
	private double kilometros;

	// ********************************************************
	// ** Acciones
	// ********************************************************
	
	public void convertir() {
		this.kilometros = this.millas * FACTOR_CONVERSION;
	}
	
	// ********************************************************
	// ** Atributos
	// ********************************************************

	public double getMillas() {
		return this.millas;
	}

	public void setMillas(double millas) {
		this.millas = millas;
	}

	public double getKilometros() {
		return this.kilometros;
	}

	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}

}
