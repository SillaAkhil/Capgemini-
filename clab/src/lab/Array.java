package lab;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int [] {9000, 23222666, 50, 10900122, 120202, 220000, 6752221, 344566666};  
		 
		Arrays.sort(array);   
		System.out.println("Elements of array sorted in ascending order: ");  
	
		for (int i = 0; i < array.length; i++)   
		{       
		System.out.println(array[i]);   
		}   

	}

}
