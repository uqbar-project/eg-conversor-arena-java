package org.uqbar.arena.examples.conversor;

import org.uqbar.commons.utils.Observable;

@Observable
public class Conversor {
	private double millas;
	private double kilometros;

	public void convertir() {
		this.kilometros = this.millas * 1.60934;
	}
	
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
