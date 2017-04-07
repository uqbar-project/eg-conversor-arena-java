package org.uqbar.arena.examples.conversor;

import org.uqbar.commons.model.ObservableUtils;
import org.uqbar.commons.utils.Observable;

@Observable
public class ConversorViewModel {
  private double millas;
  private double kilometros;
  
  private Conversor conversor = new Conversor();
  
  public void convertir() {
    kilometros = conversor.convertir(millas);
    ObservableUtils.firePropertyChanged(this, "textoMillas");
    ObservableUtils.firePropertyChanged(this, "textoKilometros");
  }

  public double getMillas() {
    return millas;
  }

  public void setMillas(double millas) {
    this.millas = millas;
  }

  public String getTextoKilometros() {
    return "Kms: " + kilometros;
  }


  public String getTextoMillas() {
    return "Millas: " + millas;
  }
  
  
}
