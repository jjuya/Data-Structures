package Stacks.BalancedBrackets;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isBalanced(String s) {
        String result = null;
        
        Stack<Character> brackets = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
        	if((s.charAt(i) == '{') || (s.charAt(i) == '[') || (s.charAt(i) == '(')) {
        		brackets.push(s.charAt(i));
        	} else {
        		if(s.charAt(i) == '}') {
        			if(brackets.isEmpty() || brackets.peek() != '{') {
        				return "NO";
        			}
        			
        			brackets.pop();
        		} else if(s.charAt(i) == ']') {
        			if(brackets.isEmpty() || brackets.peek() != '[') {
        				return "NO";
        			} 
        			
        			brackets.pop();
        		} else if(s.charAt(i) == ')') {
        			if(brackets.isEmpty() || brackets.peek() != '(') {
        				return "NO";
        			} 
        			
        			brackets.pop();
        		}
        	}        	
        }
        
        if(brackets.isEmpty()) {
        	result = "YES";
        } else {
        	result = "NO";
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    } //end main
} //end class