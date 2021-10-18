package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {
//Only one main method
	public static void main(String[] args) {
		
			String userInput= null;
			
			System.out.println("Hello! This is my food truck app!");
			System.out.println("For each truck(up to 5) please enter the 1.Name, 2. Type of food and your 3. Rating of that truck between 1-10 ");
			System.out.println("Press Enter to continue.");
			
			Scanner scan = new Scanner(System.in);
		for(int i=0; i< 5; i++) {
			userInput = scan.nextLine();
			if(userInput.equals("Quit")) {
				continue;
				//remember condition that if userInput = "quit", we have to proceed with what we have.
			}
			else {
				System.out.println("Name?:");
				String truck1Name = scan.nextLine();
				System.out.println("Type of Food?:");
				String truck1FoodType = scan.nextLine();
				System.out.println("Rating? (1-10):");
				int truck1Rating = scan.nextInt();
				FoodTruck truck1 = new FoodTruck(truck1Name,truck1FoodType, truck1Rating);
				System.out.println(truck1.toString() );
				//Testing to see... passed user inputs to truck1 object.. somehow loop this and have it create truck2 object, truck3 object.. etc.
				System.out.println("Enter 'Quit' to use input so far, hit the Enter key to continue input.");
				}
		}
			//FoodTruck truck2 = new FoodTruck("Taco Butt","Mexican fusion", 9);
			//FoodTruck truck3 = new FoodTruck("Taco Butt","Mexican fusion", 9);
			//FoodTruck truck4 = new FoodTruck("Taco Butt","Mexican fusion", 9);
			//FoodTruck truck5 = new FoodTruck("Taco Butt","Mexican fusion", 9);
			}
	
	//Need to get a main menu
		public void mainMenu(){
			System.out.println("Thank you!");
			System.out.println("Please select from the following options");
			System.out.println("1. List of trucks");
			System.out.println("2. List of truck ratings");
			System.out.println("3. Display the most popular option");
			System.out.println("4. Exit program");
			//4 options.. 1-4
			
			int userChoice;
			do {
				Scanner scan = new Scanner(System.in);
				int userInputChoice = scan.nextInt();
			switch(userInputChoice) {
			case '1':
				//List the trucks
				System.out.println();
			case '2':
				//List truck ratings
			case '3':
				//take the highest value of rating and return the object that has highest rating
			case '4':
				
			default:
				
				 System.out.println("Error please enter a value between 1-4");
			}
			userChoice = userInputChoice;
			//if 1,2, or 3 are not entered.. error message
			} while(userChoice < 4);
			
	
	
		}
		
			
	
}