package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraImposto {

	public BigDecimal calcular(Orcamento orc, Imposto imposto) {
		return imposto.calcular(orc);
	}
}
