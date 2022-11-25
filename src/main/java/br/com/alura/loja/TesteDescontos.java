package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDesconto;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {
		Orcamento orc1 = new Orcamento(new BigDecimal(100), 6);
		CalculadoraDesconto calculadora1 = new CalculadoraDesconto();
		BigDecimal valor1 = calculadora1.calcular(orc1);
		
		System.out.println(valor1);
	}
}
