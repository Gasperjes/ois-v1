public class Gravitacija{
	public static void main(String[] args){
		System.out.println("Ois je zakon! Predmet je se kr vredi.");
	}
	public static double izracunGravitacije(double visina){
		double c = 6.674e-11;
		double m = 5.972e24;
		double r = 6.371e6;
		return (c * m) / Math.pow(r + visina, 2.0);
	}
	public static void izpis(double visina){
		System.out.printf("Grav. pospesek na %d km nad. visine je %d m/s^2\n", visina, izracunGravitacije(visina * 1000.0));
	}
	
}
