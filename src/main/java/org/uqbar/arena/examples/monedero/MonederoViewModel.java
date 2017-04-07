package org.uqbar.arena.examples.monedero;

import org.uqbar.commons.model.ObservableUtils;
import org.uqbar.commons.utils.Observable;

@Observable
public class MonederoViewModel {
  
  private double monto; 
  private Monedero monedero = new Monedero();
  
  public void depositar() {
    monedero.depositar(monto);
    ObservableUtils.firePropertyChanged(this, "saldo");
  }

  public void extraer() {
    monedero.extraer(monto);
    ObservableUtils.firePropertyChanged(this, "saldo");
  }
  
  public double getMonto() {
    return monto;
  }
  
  public double getSaldo() {
    return monedero.getSaldo();
  }
  
  public void setMonto(double monto) {
    this.monto = monto;
  }

  
}
