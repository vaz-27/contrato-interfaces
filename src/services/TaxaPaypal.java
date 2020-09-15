package services;

public class TaxaPaypal implements Taxas {

	private static final double JUROS = 1.02;
	private static final double MES_PORCENT = 0.01;
	
	@Override
	public double taxa(double parcela, int i) {
		parcela += (parcela*MES_PORCENT* i);
		return parcela;
	}

	@Override
	public double jurosMensal(double parcela) {
		parcela *= JUROS;
		return parcela;
	}

}
