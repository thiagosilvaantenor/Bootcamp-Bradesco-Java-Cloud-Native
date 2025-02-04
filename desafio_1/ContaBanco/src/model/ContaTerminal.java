package model;

public class ContaTerminal {
  int numero;
  String agencia;
  String nomeCliente;
  Double Saldo;

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public Double getSaldo() {
    return Saldo;
  }

  public void setSaldo(Double saldo) {
    Saldo = saldo;
  }

}
