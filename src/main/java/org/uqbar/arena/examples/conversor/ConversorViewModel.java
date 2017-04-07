package org.uqbar.arena.examples.conversor;

import org.uqbar.commons.utils.Dependencies;
import org.uqbar.commons.utils.Observable;

@Observable
public class ConversorViewModel {
  private double millas;
  
  private Conversor conversor = new Conversor();
  
  @Dependencies({"millas"})
  public double getKilometros() {
    return conversor.convertir(millas);
  }
  
  @Dependencies({"kilometros"})
  public String getTextoKilometros() {
    return "Kms: " + getKilometros();
  }
  
  @Dependencies({"millas"})
  public String getTextoMillas() {
    return  "Millas: " + millas;
  }

  public double getMillas() {
    return millas;
  }

  public void setMillas(double millas) {
    this.millas = millas;
  }
  
}
