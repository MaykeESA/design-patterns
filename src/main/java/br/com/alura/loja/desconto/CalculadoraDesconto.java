package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDesconto {

	public BigDecimal calcular(Orcamento orc) {
		if (orc.getQtdItens() > 5) {
			return orc.getValor().multiply(new BigDecimal(0.1));
		}
		
		if (orc.getValor().compareTo(new BigDecimal(500)) > 0) {
			return orc.getValor().multiply(new BigDecimal(0.1));
		}
		
		return BigDecimal.ZERO;
	}
}
