package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import services.Taxas;

public class Parcela {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataVencimento;
	private Double quantidade;
	
	public Contrato contrato;
	private Taxas taxa;
	
	public Parcela() {
	}
	
	public Parcela(Date dataVencimento, Double quantidade) {
		this.dataVencimento = dataVencimento;
		this.quantidade = quantidade;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public Double getQuantidade() {
		return quantidade;
	}
	
	public Taxas getTaxa() {
		return taxa;
	}
	
	public String toString() {
		return sdf.format(dataVencimento) + " - R$" + String.format("%.2f",quantidade);
	}
}
