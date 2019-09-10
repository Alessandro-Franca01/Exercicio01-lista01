package classes;

import java.util.Scanner;

public class MetodosEstaticos {

	// FAZER UM METODO PARA CADA COORDENADA"
		public static double coordenadaX() { 
			Scanner input = new Scanner(System.in);   // se fecha o Scanner antes do final da classes da erro!!
			double px;
			System.out.println("Coordenada x: ");
			px = input.nextDouble();
			
			return px;
		}
		public static double coordenadaY() {
			Scanner input = new Scanner(System.in);
			double py;
			System.out.println("Coordenada y: ");
			py = input.nextDouble();
			return py;
		}
		
		public static double calcDistancia(Ponto p1, Ponto p2) {
			double distancia;
			double x1, y1, x2, y2;
			double termo01, termo02;
			x1 = p1.getCoordenadax();
			y1 = p1.getCoordenadaY();
			x2 = p2.getCoordenadax();
			y2 = p2.getCoordenadaY();
			
			termo01 = Math.pow((x2 - x1), 2);
			termo02 = Math.pow((y2 - y1), 2);
			distancia = Math.sqrt(termo01 + termo02);
			return distancia;
		}
		
		public static int receberNumero(int num) {
			Scanner input = new Scanner(System.in);
			while (num <= 0) {
				System.out.println("Digite novamente o numero INTEIRO POSITIVO: ");
				num = input.nextInt();
			}
			return num;
		}
}
