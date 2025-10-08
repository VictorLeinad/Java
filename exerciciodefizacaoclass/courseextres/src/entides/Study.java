package entides;

public class Study {
	
	public String name;	
	public double a;
	public double b;
	public double c;
	
	public double nota() {
		return a + b + c;
	}
	
	public double media() {
		if (nota() < 60) {
			return 60 - nota();
		}else {
			return 0;
		}
	}
	
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", nota());
	}
	
	
}
