package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	public Integer numero;
	private Date dataInicio;
	private Double valorTotal;
	
	public List<Parcela> parcelas = new ArrayList<>();
	
	public Contrato(Integer numero, Date dataInicio, Double valorTotal) {
		this.numero = numero;
		this.dataInicio = dataInicio;
		this.valorTotal = valorTotal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date data) {
		this.dataInicio = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void addParcelas(Parcela parcela) {
		parcelas.add(parcela);
	}
	
	public void rmParcelas(Parcela parcela) {
		parcelas.remove(parcela);
	}
}
