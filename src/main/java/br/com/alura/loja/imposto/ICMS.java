package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class ICMS implements Imposto{

	public BigDecimal calcular(Orcamento orc) {
		return orc.getValor().multiply(new BigDecimal(0.10));
	}

}
