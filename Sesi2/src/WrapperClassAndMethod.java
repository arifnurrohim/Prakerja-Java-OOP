import java.util.Scanner;
public class WrapperClassAndMethod {

	public static void main(String[] args) {
		
		Integer number_integer = 5;
		Float number_float = (float) 10;
		Character alphabet = 'A';
		Boolean bool= true;
		/* bool is object, object can be set as null */
		bool = null;
		/* Method */
		number_integer = Integer.valueOf("170");
		System.out.println(number_integer);
		/* lower limit of Integer and Float */
		System.out.println(number_integer.MIN_VALUE);
		System.out.println(number_float.MIN_VALUE);
		/* upper limit of Integer and Float */
		System.out.println(number_integer.MAX_VALUE);
		System.out.println(number_float.MAX_VALUE);
		
		String word1="Course-Net"; 
		String word2 = new String ("Indonesia");
		System.out.println(word1 + " " + word2);
		/* first way */
		if (word1== word2) {
		System.out.println("word1 same as word2");
		}
		else {
		System.out.println("word1 not same with word2");
		}
		/*second way*/
		if(word1.equals(word2) == true) {
		System.out.println("word1 same as word2");
		}
		else {
		System.out.println("word1 not same with word2");
		}
		/*third way*/
		if(word1.compareTo(word2) == 0) {
		System.out.println("word1 same as word2");
		}
		else {
		System.out.println("word1 not same with word2");
		}
		/*length*/
		/*Return String Length*/
		System.out.println(word1.length());
		/*charAt*/
		/*get particular char index*/
		System.out.println(word1.charAt(2)); //u
		//concat
		//concatenate string
		System.out.println(word1.concat(word2));
		//substring
		//get particular range index 
		System.out.println(word1.substring(2, 6));
		//toLowerCase
		//convert String to lower case 
		System.out.println(word1.toLowerCase());
		//toUpperCase
		//convert String to upper case 
		System.out.println(word1.toUpperCase());
		//trim
		//delete right and left whitespace
		word1 = "    Course-Net      ";
		System.out.println(word1.trim()); //Course-Net
		//replace
		//replacing char with other char 
		String name="Haryanto";
		System.out.println(name.replace('a', 'o')); //Horyente
		//replaceFirst
		//replacing first found character 
		name = "Haryanto";
		System.out.println(name.replaceFirst("a", "o")); //Horyanto
		//split
		//splitting string as particular format
		String split_string = "Course#Net#Indonesia";
		String[] result = split_string.split("#");
		for (int i=0; i< result.length; i++) {
			System.out.println(result[i]);
		}
		// Math Method
		//ceil
		//upper bound (rounded)
		System.out.println(Math.ceil(4.3)); //5
		//floor
		//lower bound (rounded)
		System.out.println(Math.floor(4.7)); //4
		//round
		//round according the number 
		System.out.println(Math.round(4.7));
		
		Scanner scan = new Scanner(System.in);
		
		//Exception Handling
		int number;
		number = scan.nextInt();
		System.out.println("Finish");
		
		int number1;
		try {
		System.out.println("Input number: ");
		number1 = scan.nextInt();
		} catch (Exception e) {
		System.out.println("Input must be number");
		}
		
	}

}
