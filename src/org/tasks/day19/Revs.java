package org.tasks.day19;

import java.util.Arrays;

public class Revs {

	public static void main(String[] args) {
		
		
		/* String Reverse using Array Representation*/
		String a = "Hello";
		char[] words = a.toCharArray();
			int left =0;
			int right = words.length-1;
			char temp;
			while(left<right) {
				temp = words[left];
				words[left]=words[right];
				words[right]=temp;
				left++;
				right--;
			}
		
		System.out.println(Arrays.toString(words));
		String str = new String(words);
		System.out.println(str);
		
	}
}
