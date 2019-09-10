package codigos_mains;
import classes.Ponto;
import classes.MetodosEstaticos;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Vamos calcular a distancia entre dois pontos");
		System.out.println("Digite as coordenadas do 1° ponto");
		double coordx, coordy, distancia;
		coordx = MetodosEstaticos.coordenadaX();
		coordy = MetodosEstaticos.coordenadaY();
		Ponto ponto01 = new Ponto(coordx, coordy);
		System.out.println(ponto01);
		
		System.out.println("Digite as coordenadas do 2° ponto");
		coordx = MetodosEstaticos.coordenadaX();
		coordy = MetodosEstaticos.coordenadaY();
		Ponto ponto02 = new Ponto(coordx, coordy);
		System.out.println(ponto02);
		distancia = MetodosEstaticos.calcDistancia(ponto01, ponto02);
		System.out.println("A distancia entre os dois pontos é: "+distancia);
	}

}
