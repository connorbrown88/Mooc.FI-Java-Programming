package p7_ProgrammingParadigmsAndAlgorithms;

import java.util.Scanner;

public class UIBird {

	private Scanner userInput;
	private BirdDatabase birds;
	
	public UIBird() {
		userInput = new Scanner(System.in);
		birds = new BirdDatabase();
	}
	
	public void UILoop() {
		while(true) {
			String userCommand = getUserCommand();
			if(userCommand.equals("Add")) {
				addBird();
			}else if(userCommand.equals("Observation")) {
				addObservation();
			}else if(userCommand.equals("All")) {
				printAllBirds();
			}else if(userCommand.equals("One")) {
				printOneBird();
			}else if(userCommand.equals("Quit")) {
				break;
			}
		}
	}
	
	public String getUserCommand() {
		System.out.print("? ");
		String userCommand = userInput.nextLine();
		return userCommand;
	}
	
	public void addBird() {
		String[] birdNames = getBirdNames();
		addBirdToDatabase(birdNames);
	}
	
	public String[] getBirdNames() {
		String[] birdNames = new String[2];
		System.out.print("Name: ");
		birdNames[0] = userInput.nextLine();
		System.out.print("Name in Latin: ");
		birdNames[1] = userInput.nextLine();
		return birdNames;
	}
	
	public void addBirdToDatabase(String[] birdNames) {
		birds.add(new Bird(birdNames));
	}
	
	public void addObservation() {
		String birdName = requestBirdName();
		if(birds.doesBirdExistInDatabase(birdName)) {
			birds.observation(birdName);
		}else {
			System.out.println("Not a bird!");
		}
	}
	
	public void printAllBirds() {
		birds.printAll();
	}
	
	public void printOneBird() {
		String birdName = requestBirdName();
		birds.printOne(birdName);
	}

	public String requestBirdName() {
		System.out.print("Bird? ");
		String birdName = userInput.nextLine();
		return birdName;
	}
	
}
