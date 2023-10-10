

# Pizza_Bill_Generator

The "Pizza Bill Generator" project is a Java-based program that allows users to customize and generate a bill for their pizza orders. The program is structured using object-oriented programming principles and includes classes to model a pizza order, calculate costs based on user preferences, and generate a bill.

# Pizza Class  Overview


The Pizza class is the core of the project, encapsulating the pizza's properties and operations. Key properties include the base price, whether the pizza is vegetarian, and choices for extra cheese, extra toppings, and take-away. The class provides methods to add extra options and generate a detailed bill.

- **addExtraCheese()**: Adds extra cheese to the pizza and updates the total price.
- **addExtraToppings()**: Adds extra toppings to the pizza and updates the total price.
- **takeAway()**: Marks the pizza for take-away and adjusts the total price accordingly.
- **generateBill()**: Computes the final bill based on user choices and displays a breakdown of the costs.

 # ClientMain Class Overview
 
The ClientMain class contains a main method, which executes the pizza ordering process:

- **Input Collection**: The program prompts the user to provide input regarding the pizza's vegetarian status, the choice for extra cheese, extra toppings, and whether the order is for take-away. It uses the Scanner class to obtain boolean inputs.

- **Pizza Object Creation**: An instance of the Pizza class is created based on the user's input regarding the pizza's vegetarian status.

- **Customization**: If the user opted for extra cheese, extra toppings, or a take-away order, the respective methods of the Pizza class are called to customize the order.

- **Bill Generation**: The getBill method of the Pizza class is invoked to generate the bill based on the selected options and display it to the user.
