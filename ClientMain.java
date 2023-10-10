package com.pizzabillgenerator;

import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Is the pizza vegetarian? (true/false): ");
	        boolean isVegetarian = scanner.nextBoolean();
	        Pizza pizza = new Pizza(isVegetarian);

	        System.out.print("Do you want extra cheese? (true/false): ");
	        boolean extraCheese = scanner.nextBoolean();
	        if (extraCheese) {
	            pizza.addExtraCheese();
	        }

	        System.out.print("Do you want extra toppings? (true/false): ");
	        boolean extraToppings = scanner.nextBoolean();
	        if (extraToppings) {
	            pizza.addExtraToppings();
	        }

	        System.out.print("Is it for take away? (true/false): ");
	        boolean takeAway = scanner.nextBoolean();
	        if (takeAway) {
	            pizza.takeAway();
	        }

	        pizza.getBill();

	}

}
