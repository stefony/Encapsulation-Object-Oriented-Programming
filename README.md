# Encapsulation-Object-Oriented-Programming
Courses from my education Java OOP in @SoftUni

exercises: Encapsulation Object-Oriented-Programming
01.Sort by Name and Age 
Create a class Person, which should have private fields for: 
•	firstName: String 
•	lastName: String 
•	age: int 
•	toString() - override 

02.Salary Increase
Read person with their names, age, and salary. Read percent bonus to every person salary. People younger than 30 get a half bonus. Expand Person from the previous task. Add salary field and getter and setter with proper access. New fields and methods 
•	salary: double  
•	increaseSalary(double bonus) 

03.Validation Data 
Expand Person with proper validation for every field: 
•	Names must be at least 3 symbols 
•	Age must not be zero or negative 
•	Salary can't be less than 460.0  
Print proper message to end-user (look at an example for messages).  
Don't use System.out.println() in Person class. 

04.First and Reserve Team
Create a Team class. Add to this team all people you read. All people younger than 40 go on the first team, others go on the reverse team. At the end print first and reserve team sizes. 
The class should have private fields for: 
•	name: String 
•	firstTeam: List<Person> 
•	reserveTeam: List<Person> 
The class should have constructors: 
•	Team(String name) 
The class should also have private method for setName and public methods for: 
•	getName(): String 
•	addPlayer(Person person): void 
•	getFirstTeam(): List<Person> (Collections.unmodifiableList) 
•	getReserveTeam(): List<Person> (Collections.unmodifiableList) 

1.Class Box 
You are given a geometric figure Box with fields length, width, and height. Model a class Box that can be instantiated by the same three parameters. Expose to the outside world only methods for its surface area, lateral surface area, and its volume (formulas: http://www.mathwords.com/r/rectangular_parallelepiped.htm). 
On the first three lines, you will get the length, width, and height. On the next three lines print the surface area, lateral surface area, and the volume of the box. 
A box’s side should not be zero or a negative number. Add data validation for each parameter given to the constructor. Make a private setter that performs data validation internally. 
Box
-	length: double 
-	width:  double 
-	height:  double
+  Box (double length, double width, double height) 
-	setLength(double): void 
-	setWidth(double): void 
-	setHeight(double): void 
+ calculateSurfaceArea (): double 
+ calculateLateralSurfaceArea (): double 
-	+ calculateVolume (): double

2.Animal Farm 
You should be familiar with encapsulation already. For this problem, you’ll need to create a class called Chicken. Chicken should contain several fields, a constructor, and several methods. Your task is to encapsulate or hide anything that is not intended to be viewed or modified from outside the class. 
Chicken
-	name: String 
-	age: int
+ Chicken(String, int) 
-	setName(String) : void 
-	setAge (int): void 
+ productPerDay (): double 
+ toString(): Override 
-	calculateProductPerDay() : double
Chicken lives for 15 years. Chicken has a name for sure, at least 1 symbol long. Chicken producing eggs: 
•	First 6 years it produces 2 eggs per day [0 - 5]. 
•	Next 6 years it produces 1 egg per day [6 - 11]. 
•	And after that, it produces 0.75 eggs per day. 
Shopping Spree 
Create two classes: class Person and class Product. Each person should have a name, money, and a bag of products. Each product should have a name and cost. The name cannot be an empty string. Be careful about white space in the name. Money and cost cannot be a negative number. 
Person
-	name: String 
-	money:  double 
-	products:  List<Product>
+  Person (String,  double) 
-	setName (String): void 
-	setMoney (double): void 
+ buyProduct (Product): void 
+ getName(): String
Product
-	name: String 
-	cost: double
+ Product (String,  double) 
-	setCost (double): void 
-	setName (String): void 
+ getName(): String 
+ getCost (): double
Create a program in which each command corresponds to a person buying a product. If the person can afford a product add it to his bag. If a person doesn’t have enough money, print an appropriate exception message: "{Person name} can't afford {Product name}" 
In the first two lines, you are given all people and all products. After all, purchases print every person in the order of appearance and all products that he has bought also in order of appearance. If nothing is bought, print:  
"{Person name} - Nothing bought". 
Read commands till you find the line with the "END" command. In case of invalid input (negative money exception message: "Money cannot be negative") or empty name: (empty name exception message "Name cannot be empty") break the program with an appropriate message

4.Pizza Calories 
A Pizza is made of dough and different toppings. You should model a class Pizza which should have a name, dough, and toppings as fields. Every type of ingredient should have its class. 
Every ingredient has different fields: the dough can be white or wholegrain and in addition, it can be crispy, chewy, or homemade. The toppings can be of type meat, veggies, cheese, or sauce. Every ingredient should weigh grams and a method for calculating its calories according to its type. Calories per gram are calculated through modifiers. Every ingredient has 2 calories per gram as a base and a modifier that gives the exact calories
Your job is to model the classes in such a way that they are properly encapsulated and to provide a public method for every pizza that calculates its calories according to the ingredients it has. 
For example, the white dough has a modifier of 1.5, a chewy dough has a modifier of 1.1, which means that a white chewy dough weighing 100 grams will have (2 * 100) * 1.5 * 1.1 = 330.00 total calories. 
For example, meat has a modifier of 1.2, which means that meat weighing 50 grams will have (2 * 50) * 1.2 = 120.00 total calories. 

Pizza
-	name: String 
-	dought:  Dough 
-	toppings: List<Topping>  
+  Piza (String, int numberOfToppings) 
-	setToppings(int) : void 
-	setName(String) : void 
+ setDough(Dough) : void 
+ getName(): String 
+ addTopping (Topping) : void 
+ getOverallCalories () : double

Dough
-	flourType: String 
-	bakingTechnique: String 
-	weight: double
+  Dought (String, String, double) 
-	setWeight(double): void 
-	setFlourType(String): void 
-	setBakingTechnique(String): void 
+ calculateCalories (): double  
Topping
-	toppingType: String 
-	weight: double
+ Topping (String, double) 
-	setToppingType (String): void 
-	setWeight (double): void 
+ calculateCalories (): double
Dough Modifiers
•	White – 1.5; 
•	Wholegrain – 1.0; 
•	Crispy – 0.9; 
•	Chewy – 1.1; 
•	Homemade – 1.0;
Toppings Modifiers
•	Meat – 1.2; 
•	Veggies – 0.8; 
•	Cheese – 1.1; 
•	Sauce – 0.9;  

5. Football Team Generator
A football team has a variable number of players, a name, and a rating. 
A player has a name and stats which are the basis for his skill level. The stats a player has are endurance, sprint, dribble, passing, and shooting. Each stat can be in the range [0..100]. The overall skill level of a player is calculated as the average of his stats. Only the name of a player and his stats should be visible to all of the outside world. Everything else should be hidden. 
A team should expose a name, a rating (calculated by the average skill level of all players in the team), and methods for adding and removing players. 
Your task is to model the team and the players following the proper principles of Encapsulation. Expose only the fields that need to be visible and validate data appropriately. 
Input 
Your application will receive commands until the "END" command is given. The command can be one of the following: 
	• 	"Team;{TeamName}" – add a new team 
•	"Add;{TeamName};{PlayerName};{Endurance};{Sprint};{Dribble};{Passing};{Shooting}
" – add a new player to the team 
•	"Remove;{TeamName};{PlayerName}" – remove the player from the team 
•	"Rating;{TeamName}" – print the team rating, rounded to the closest integer 
Data Validation 
•	A name cannot be null, empty, or white space. If not, print: "A name should not be empty." 
•	Stats should be in the range [0..100]. If not, print: "{Stat name} should be between 0 and 100." 
•	If you receive a command to remove a missing player, print: "Player {Player name} is not in {Team name} team." 
•	If you receive a command to add a player to a missing team, print: "Team {team name} does not exist." 
•	If you receive a command to show stats for a missing team, print: "Team {team name} does not exist." 




