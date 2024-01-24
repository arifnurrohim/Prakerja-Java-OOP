
import java.util.Scanner;
public class FirstJavaProgram {

	public static void main(String[] args) {
		
		/* Output */
		
		System.out.println("Hello Java"); 
		System.out.print("Hello Java2");
		System.out.printf("%s\n", "Hello Java3");

		/* Primitive Data Type */
		
		int number_integer = 5;
		long number_long = 7;
		float number_float = (float) 4.5;
		double number_double = 10;
		char alphabet = 'A';
		boolean bool = true;
		System.out.println("Integer Number: " + number_integer);
		System.out.println("Long Number: " + number_long);
		System.out.println("Float Number: " + number_float);
		System.out.println("Double Number: " + number_double);
		System.out.println("Alphabet: " + alphabet);
		System.out.println("Boolean: " + bool);
		
		/* Input */
		
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		float gpa;
		System.out.printf("Input Name: ");
		name = scan.nextLine();
		System.out.printf("Input Age: "); 
		age = scan.nextInt();
		System.out.printf("Input GPA: "); 
		gpa = scan.nextFloat();
		System.out.println("Name : " + name);
		System.out.println("Age  : " + age);
		System.out.println("GPA  : " + gpa);
		
		/* Arithmetic Operator */
		
		int number1 = 105;
		int number2 = 49;

		System.out.println("First Number  : " + number1);
		System.out.println("Second Number : " + number2);
		System.out.println("+ Result: " + (number1 + number2));
		System.out.println("- Result: " + (number1 - number2));
		System.out.println("* Result: " + (number1 * number2));
		System.out.println("/ Result: " + (number1 / number2));
		System.out.println("% Result: " + (number1 % number2));
		
		/* Selection */
		
		int number11 = 9;
		int number22 = 7;
		if(number11 == number22){ 
			System.out.println("The number is same");
		} else if (number11 > number22){
			System.out.println("number1 > number2");
		} else if(number11 < number22){
			System.out.println("number2 < number1");
		}
		
		/* Switch Operation */
		
		int menu = 5;
		switch (menu) {
			case 1:
				System.out.println("Menu 1");
			break;		
			case 2:
				System.out.println("Menu 2");
			break;
			case 3:
				System.out.println("Menu 3");
			break;
		default:
				System.out.println("Default Menu");
		}
		
		/* Repetition / Iteration / Looping */
		/* for */
		for (int i = 0; i < 15; i++) {
			System.out.println("Number: " + i);
		}
		for (int i = 0; i < 15; i++) {
			if(i ==5){
				break;
			}
			if(i == 3) {
				continue;
			}
			System.out.println("Number: " + i);
		}
		
		/* do while */
		
		/* Scanner scan = new Scanner(System.in); // #[ Duplicate Scanner ] Gunakan bila Scanner diatas dimatikan. */
		
		int number111;
		do {
		System.out.println("Input Number [1..10]: ");
		number111= scan.nextInt (); scan.nextLine();
		}while(number111 < 1 || number111 > 10);
		
		/* while */
			
		int number222= 10;
		while (number222 > 5) {
		System.out.println("Number 1: " + number222);
		number222--;
		}
		
		
}
}
