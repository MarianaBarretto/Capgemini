import java.util.Scanner;

//Por: Mariana Gonçalves Barretto
//27/06/2021

public class Calculadora {
	

public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o valor de investimento R$: ");
		double ValorInvestido = scanner.nextDouble();
		
		double QtdeVisualizacoes = ValorInvestido * 30;
		
		double TotalDeVisualizacoes = 0;
		for (int i = 0; i < 4; i++) {
			double AnunciosClicados = (QtdeVisualizacoes *12) / 100; 
			
			double AnunciosCompartilhados = AnunciosClicados * 15;
			
			double ReCompartilhamento = (AnunciosCompartilhados * 40);			
			
			TotalDeVisualizacoes = ReCompartilhamento * 4;
		}
		
		System.out.printf("Com R$ %.2f investido, o numero aproximado de visualições será de %.0f.",ValorInvestido, TotalDeVisualizacoes);
	
		scanner.close();
	
	}

}