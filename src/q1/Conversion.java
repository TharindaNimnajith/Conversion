package q1;

public class Conversion {
	public Conversion() {
		//Constructor
	}
	
	public double GramsToOunces(double weight) {
		return weight * 0.0352733686;
	}

	public double OunToGrams(double weight) {
		return weight * 28.349523125;
	}

	public double KgToStone(double weight) {
		return weight * 0.1574730444;
	}

	public double StoneToKg(double weight) {
		return weight * 6.35029318;
	}

	public double PoundsToGram(double weight) {
		return weight * 453.59237;
	}

	public double GramToPound(double weight) {
		return weight * 0.0022046226;
	}
}
