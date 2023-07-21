package com.ByteBank.Modelo;

public class CalculadoraDeImpuesto {
	private double totalImpuesto;

	public void registra(Tributacion t) {
		double valor = t.getValorImpuesto();
		this.totalImpuesto += valor;
	}

	public double getTotalImpuesto() {
		return totalImpuesto;
	}

	public void registra(SeguroDeVida seguro) {
		// TODO Auto-generated method stub

	}

}
