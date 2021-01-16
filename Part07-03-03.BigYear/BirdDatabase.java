package p7_ProgrammingParadigmsAndAlgorithms;

import java.util.ArrayList;

public class BirdDatabase {

	private ArrayList<Bird> birdList;
	
	public BirdDatabase() {
		birdList = new ArrayList<>();
	}

	public void add(Bird bird) {
		birdList.add(bird);	
	}

	public boolean doesBirdExistInDatabase(String birdName) {
		for(Bird bird : birdList) {
			if(bird.getName().equals(birdName) || bird.getLatinName().equals(birdName)) {
				return true;
			}
		}
		return false;
	}
	
	public void observation(String birdName) {
		for(Bird bird : birdList) {
			if(bird.getName().equals(birdName) || bird.getLatinName().equals(birdName)) {
				bird.addObservation();
			}
		}
	}
	
	public void printOne(String birdName) {
		for(Bird bird : birdList) {
			if(bird.getName().equals(birdName) || bird.getLatinName().equals(birdName)) {
				System.out.println(bird);
			}
		}
	}
	
	public void printAll() {
		for(Bird bird : birdList) {
			System.out.println(bird);
		}
	}
	
}
