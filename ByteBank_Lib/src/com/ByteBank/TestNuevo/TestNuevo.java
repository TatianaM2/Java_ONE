package com.ByteBank.TestNuevo;

import com.ByteBank.Modelo.Cuenta;
import com.ByteBank.Modelo.CuentaCorriente;

public class TestNuevo {

	public static void main(String[] args) {
		Cuenta cuenta = new CuentaCorriente(123,456);
		cuenta.depositar(2500);
		
		
	}

}
