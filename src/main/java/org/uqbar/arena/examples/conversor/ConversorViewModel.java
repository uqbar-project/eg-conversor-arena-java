package org.uqbar.arena.examples.conversor;

import org.uqbar.commons.utils.Observable;

@Observable
public class ConversorViewModel {
  private double millas;
  
  private String textoKilometros;
  private String textoMillas;
  
  private Conversor conversor = new Conversor();
  
  public void convertir() {
    textoKilometros = "Kms: " + conversor.convertir(millas);
    textoMillas = "Millas: " + millas;
  }

  public double getMillas() {
    return millas;
  }

  public void setMillas(double millas) {
    this.millas = millas;
  }

  public String getTextoKilometros() {
    return textoKilometros;
  }

  public void setTextoKilometros(String textoKilometros) {
    this.textoKilometros = textoKilometros;
  }

  public String getTextoMillas() {
    return textoMillas;
  }

  public void setTextoMillas(String textoMillas) {
    this.textoMillas = textoMillas;
  }
  
  
  
}
