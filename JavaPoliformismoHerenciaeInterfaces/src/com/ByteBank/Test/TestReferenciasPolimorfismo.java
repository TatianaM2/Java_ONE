package com.ByteBank.Test;

import com.ByteBank.Modelo.*;

public class TestReferenciasPolimorfismo {
	public static void main(String[] args) {

		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Tatiana Martinez");

		Gerente gerente = new Gerente();
		gerente.setNombre("Maria Martinez");

		funcionario.setSalario(2000);
		gerente.setSalario(10000);

		gerente.iniciarSesion("AluraCursos");
		System.out.println(gerente.iniciarSesion("AluraCursos"));
	}
}
