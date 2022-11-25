package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraImposto;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		Orcamento orc = new Orcamento(new BigDecimal(100), 1);
		CalculadoraImposto calculadora = new CalculadoraImposto();
		BigDecimal valor = calculadora.calcular(orc, new ICMS());
		
		System.out.println(valor);
	}
}
