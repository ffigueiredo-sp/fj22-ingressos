package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public class DescontoParaBancos implements Desconto {

	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		 
		return precoOriginal.subtract(trintaPorCento(precoOriginal));
	}

	private BigDecimal trintaPorCento(BigDecimal precoOriginal) {
		
		return precoOriginal.multiply(new BigDecimal("0.3"));
	}

}
