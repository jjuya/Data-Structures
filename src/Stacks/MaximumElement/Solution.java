package Stacks.MaximumElement;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int type;
		
		int num;

		for(int i = 0; i < size; i++) {
			type = sc.nextInt();

			switch (type) {
			case 1:
				num = sc.nextInt();
				
				if(stack.isEmpty()) {
					stack.push(num);
				} else {
					int temp = stack.peek();
					stack.push(Math.max(num, temp));
				}

				break;
			case 2:
				if(!stack.isEmpty())
					stack.pop();
				break;
			case 3:
				System.out.println(stack.peek());
				break;

			default:
				break;
			}
		}

	} //end main
} //end class
