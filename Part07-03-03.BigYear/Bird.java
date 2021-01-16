package p7_ProgrammingParadigmsAndAlgorithms;

public class Bird {
	
	private String name;
	private String latinName;
	private int numberOfObservations;
	
	public Bird(String[] birdNames) {
		this.name = birdNames[0];
		this.latinName = birdNames[1];
		numberOfObservations = 0;
	}

	public String getName() {
		return name;
	}
	
	public String getLatinName() {
		return latinName;
	}
	
	public void addObservation() {
		numberOfObservations++;
	}
	
	@Override
	public String toString() {
		return name + " (" + latinName+ "): " + numberOfObservations + " observations";
	}
	
}
