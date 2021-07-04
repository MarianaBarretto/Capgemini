package Cadastrando;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Efetuando {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Efetuando cadastro = new Efetuando();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		
		System.out.print("Nome do anúncio: ");
		String Anuncio = scanner.next();

		System.out.print("Nome do cliente: ");
		String Cliente = scanner.next();

		System.out.print("Data de ínicio: ");
		String Inicio = scanner.next();

		System.out.print("Total de dias do anúncio: ");
		int TotalDiaAnuncio = scanner.nextInt();
		
		Calendar gc = cadastro.toDate(Inicio);

		gc.add((GregorianCalendar.DAY_OF_MONTH), TotalDiaAnuncio);
		
		System.out.println("Data de Término: " + df.format(gc.getTime()));

		System.out.print("Digite o valor a ser investido: R$ ");
		double Investido = scanner.nextDouble();
		
		Linha();
		
		double TotalInvestido = Investido * TotalDiaAnuncio;
		
		double QtdeVisualizacoes = Investido * 30; 
		
		double TotalDeVisualizacoes = 0;
		for (int i = 0; i < 1; i++) {
		double AnunciosClicados = (QtdeVisualizacoes * 12) /100;
		
		double AnunciosCompartilhados = AnunciosClicados * 15;
		
		double ReCompartilhamento = AnunciosCompartilhados * 40;
		
		TotalDeVisualizacoes = ReCompartilhamento * 4;
		
		double Visu = TotalDeVisualizacoes * TotalDiaAnuncio;
		
		double Cli = AnunciosClicados * TotalDiaAnuncio;
		
		double Com = AnunciosCompartilhados * TotalDiaAnuncio;
	
		System.out.println("Quantidade máxima de visualizações por dia: " + TotalDeVisualizacoes);
		
		System.out.println("Quantidade máxima de cliques por dia: " + AnunciosClicados);
		
		System.out.println("Quantidade máxima de compartilhamentos por dia: " + AnunciosCompartilhados);
		
		Linha();
		
		System.out.println("Valor total do investimento: "+ TotalInvestido);
		
		System.out.println("Quantidade máxima de visualizações: " + Visu);
		
		System.out.println("Quantidade máxima de cliques: " + Cli);
		
		System.out.println("Quantidade máxima de compartilhamentos: " + Com);
		
		Linha();
		
		scanner.close();
		}
		
		
		}
		
	public Calendar toDate(String Inicio) {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);

		try {
			cal.setTime(sdf.parse(Inicio));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return cal;	
	
	}
		
		static void Linha() {

			System.out.println("----------------------------------------------------");	

	
	}

	
	
}
