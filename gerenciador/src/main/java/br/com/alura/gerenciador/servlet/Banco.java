package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();

	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		Empresa empresa02 = new Empresa();
		empresa02.setNome("Caelum");
		lista.add(empresa);
		lista.add(empresa02);
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

}
