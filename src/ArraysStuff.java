import java.util.Arrays;
import java.util.Scanner;

public class ArraysStuff {
	public static void Run() {
		System.out.println("This works!");

		double sizes[];
		double sum = 0.0, avg = 0.0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the size of your array");
		int userchoice=keyboard.nextInt();
		sizes=new double[userchoice];
		System.out.println("Enter your sizes:");
		for (int i = 0; i < sizes.length; i++) {
			sizes[i] = keyboard.nextInt();
		} // end for
		System.out.println("Display the sizes");
		for (int i = 0; i < sizes.length; i++) {
			System.out.println(sizes[i]);
		} // end for
		for (int i = 0; i < sizes.length; i++) {
			sum = sum + sizes[i];
			avg = sum / sizes.length;
		} // end for

		System.out.println("The average sizes are:" + avg);
		Arrays.sort(sizes);
		System.out.println("The minimum is "+sizes[0]);
		System.out.println("The maximum is "+sizes[sizes.length-1]);
//		int[]array = new int[userchoice];
//		int maxVal = array[0]
//;
//		for(int i = 0; 1<array.length;i++) {
//			if(maxVal < array[i]) {
//				maxVal = array[i];
//			
//		
//		int minValue = Math.min(maxVal, maxVal);
//		int[] arr = {userchoice};
//		
//		for (int i = 0; o < arr.length;  i++) {
//			if(arr[i] < minValue) {
//				minValue = arr[i];
//			}
//		    }	
//		System.out.print("The minimum size is =" + minValue);
		
//		}
//			}
		}

}
