package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcela;
import services.ContratoServico;
import services.TaxaPaypal;


public class Aplicacao {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer numero = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date dataInicio = sdf.parse(sc.next());
		System.out.print("Contract valeu: ");
		Double valorTotal = sc.nextDouble();
		
		Contrato contract = new Contrato(numero, dataInicio, valorTotal);
		
		System.out.print("Enter number of installments: ");
		int mes = sc.nextInt();
		
		ContratoServico cs = new ContratoServico(new TaxaPaypal());
		cs.processoContrato(contract, mes);
		
		System.out.println("INSTALMMENTS");
		
		for (Parcela p : contract.parcelas) {
			System.out.println(p);
		}
		
		sc.close();
	}
}