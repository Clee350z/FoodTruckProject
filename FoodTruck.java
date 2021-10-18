package com.skilldistillery.foodtruck;
//truck id to be generated when instantiating 
//this class has data fields
import java.util.Scanner;

public class FoodTruck {
	private String name;
	private String foodType;
	private int numbericRating;
	private String truckID;
	Scanner scan = new Scanner(System.in);

//constructor
	public FoodTruck( String initialName, String initialFoodType, int initialNumericRating) {
		name = initialName;
		foodType =initialFoodType;
		numbericRating = initialNumericRating;
	
		
		
	}
	
	
		
	public String toString() {
		String output ="Truck Name:"+ name + ", Type of food served here:" + foodType + ", Rating :" + numbericRating ;
		return output;
	}
	public void displayFoodTruck() {
		String iD = toString();
		System.out.println(iD);
	}
	
	//Setters and getters, as above strings are private
	public String getName() {
		return name;
	}
	public void setName( String name) {
		this.name = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getNumbericRating() {
		return numbericRating;
	}
	public void setNumbericRating(int numbericRating) {
		this.numbericRating = numbericRating;
	}

	
	
		
	
	//		
	//			
	//		
	//		}
		
	
	
	
	
	// Main menu 
	public void mainMenu(){
		System.out.println("Thank you!");
		System.out.println("Please select from the following options");
		System.out.println("1. List of trucks");
		System.out.println("2. List of truck ratings");
		System.out.println("3. Display the most popular option");
		System.out.println("4. Exit program");
	
		
	}
	
	
	
}
