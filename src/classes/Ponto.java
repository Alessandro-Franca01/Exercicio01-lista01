package classes;

public class Ponto {

		private double coordenadaX;
		private double coordenadaY;
		
		public Ponto() {
			
		}
		public Ponto(double x, double y) {
			this.coordenadaX = x;
			this.coordenadaY = y;
		}
		
		public double getCoordenadax() {
			return coordenadaX;
		}
		
		public void setCoordenadax(double coordenadax) {
			this.coordenadaX = coordenadax;
		}
		
		public double getCoordenadaY() {
			return coordenadaY;
		}
		
		public void setCoordenadaY(double coordenadaY) {
			this.coordenadaY = coordenadaY;
		}
		
		@Override
		public String toString() {
			return "Ponto [coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + "]";
		}
		
		
	}

