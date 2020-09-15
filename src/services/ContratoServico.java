package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contrato;
import entities.Parcela;

public class ContratoServico {
	
	private Taxas taxa;
	
	public ContratoServico (Taxas taxa) {
		this.taxa = taxa;
	}
	
	public void processoContrato(Contrato contract, int mes) {
		
		double quantidade = contract.getValorTotal()/mes;
		
		for (int i=1; i<=mes; i++) {
			Date dataVencimento = calculaData(contract.getDataInicio(),i);
			double q2 = taxa.taxa(quantidade, i);
			q2 = taxa.jurosMensal(q2);
			contract.addParcelas(new Parcela(dataVencimento, q2));
		}
	}

	public Date calculaData(Date dataInicio, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataInicio);
		cal.add(Calendar.MONTH, n);
		return cal.getTime(); 
	}
}
