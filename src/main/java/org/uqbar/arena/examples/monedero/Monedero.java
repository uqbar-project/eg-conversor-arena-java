package org.uqbar.arena.examples.monedero;

public class Monedero {
  
  private double saldo;
  
  public void depositar(double monto) {
    saldo += monto;
  }
  
  public void extraer(double monto) {
    saldo -= monto; 
  }
  
  public double getSaldo() {
    return saldo;
  }

}
