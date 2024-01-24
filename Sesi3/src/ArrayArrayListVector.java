import java.util.ArrayList;
import java.util.Vector;
public class ArrayArrayListVector {

	public static void main(String[] args) {
		// Array
		// deklarasi array
		
		// array integer
		int [] arr_int = new int[10];
		
		arr_int[4] = 15;
		
		System.out.println(arr_int[4]); // 15
		
		for(int i = 0; i < arr_int.length; i++){
			arr_int[i] = i * 5;
		}
		for(int i = 0; i < arr_int.length; i++){
			System.out.println(arr_int[i]);
		}
		
		double [] arr_double = {5.7, 7.3, 6.5};
		double total = 0;
		for(int i = 0; i < arr_double.length; i++){
			total += arr_double[i];
			// total == total + arr_double
		
		}
		System.out.println(total);
		
		//array String
		String [] arr_String = new String[5];
		
		arr_String[0] = "Course";
		arr_String[1] = "Net";
		arr_String[2] = "Indonesia";
		
		for(int i = 0; i < arr_String.length; i++){
			System.out.println(arr_String[i]);
		}
		

		// Duplicate Array
		
		int[] arraySource = {1, 3, 5, 7};
				
		int[] arrayTarget1 = new int[4];
		int[] arrayTarget2 = new int[4];
		int[] arrayTarget3 = new int[4];
				
		//1. Dengan Looping
			for(int i = 0; i < arraySource.length; i++){
				arrayTarget1[i] = arraySource[i];
			}
		//2. Dengan ArrayCopy
			System.arraycopy(arraySource, 1, arrayTarget2, 1, 3);
				
		//3. Dengan clone
			arrayTarget3 = arraySource.clone();
				
			System.out.println("Array Target 1: ");
				for(int i=0; i < arrayTarget1.length; i++){
					System.out.println(arrayTarget1[i]);
				}
				
			System.out.println("Array Target 2: ");
				for(int i = 0; i < arrayTarget2.length; i++){
					System.out.println(arrayTarget2[i]);
				}	
				
			System.out.println("Array Target 3: ");
				for(int i=0; i < arrayTarget3.length; i++){
					System.out.println(arrayTarget3[i]);
				}
				
				//2D Array
				
				int[][] array2D = new int[3][3];
				int fillArray = 0;
				
				for(int i=0; i <array2D.length; i++){
					for(int j=0; j < array2D[i].length; j++){
						System.out.println(i + " " + j);
						array2D[i][j] = fillArray++;
						fillArray++;
					}
				}
				
				for(int i=0; i < array2D.length; i++){
					for(int j=0; j<array2D[i].length; j++){
					System.out.print(array2D[i][j] + " ");
					}
					System.out.println("");
				}
		//Array List

		//Array List

		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("Algorithm & Programing");
		wordList.add("OOP");
		wordList.add("Calculus");

		wordList.set(1, "Data Structure");
			for (int i=0; i< wordList.size(); i++) {
					System.out.println(wordList.get(i));
				}
		wordList.remove(1);
		for (int i=0; i< wordList.size(); i++) {
					System.out.println(wordList.get(i));
				}
		
		Vector<Integer> numList = new Vector<Integer>();
		numList.add(89);
		numList.add(45);
		numList.add(27);

		numList.set(2, 77);
			for (int i=0; i< numList.size(); i++) {
					System.out.println(numList.get(i));
				}
		numList.remove(1);
		for (int i=0; i< numList.size(); i++) {
					System.out.println(numList.get(i));
				}	

	}

}
