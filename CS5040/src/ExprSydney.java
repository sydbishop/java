// Class: CS 5040
// Term: Fall 2021
// Name: Sydney Bishop
// Program Number: Assignment 3 Program 3, 4 & 5
// IDE: Eclipse

import java.io.IOException;

public class ExprSydney {
	MyStackSydney<Character> theStack;
	String input;
	String output = "";
	
	public ExprSydney(String in) {
		input = in;
		int stackSize = input.length();
		theStack = new MyStackSydney<Character>();
	}
	
	public String infixToPrefix() {
	      for (int j = 0; j < input.length(); j++) {
	         char ch = input.charAt(j);
	         switch (ch) {
	            case '+': 
	            case '-':
	               gotOper(ch, 1); 
	               break; 
	            case '*': 
	            case '/':
	               gotOper(ch, 2); 
	               break; 
	            case '(': 
	               theStack.push(ch);
	               break;
	            case ')': 
	               gotParen(ch); 
	               break;
	            default: 
	               output = output + ch; 
	               break;
	         }
	      }
	      while (!theStack.isEmpty()) {
	         output = output + theStack.pop();
	      }
	      System.out.println(output);
	      return output; 
	   }
	   public void gotOper(Character opThis, int prec1) {
	      while (!theStack.isEmpty()) {
	         char opTop = theStack.pop();
	         if (opTop == '(') {
	            theStack.push(opTop);
	            break;
	         } else {
	            int prec2;
	            if (opTop == '+' || opTop == '-')
	            prec2 = 1;
	            else
	            prec2 = 2;
	            if (prec2 < prec1) { 
	               theStack.push(opTop);
	               break;
	            } 
	            else output = output + opTop;
	         }
	      }
	      theStack.push(opThis);
	   }
	   public void gotParen(Character ch) { 
	      while (!theStack.isEmpty()) {
	         Character chx = theStack.pop();
	         if (chx == '(') 
	         break; 
	         else output = output + chx; 
	      }
	   }
	   
	   //tester
	   public static void main(String[] args) throws IOException {
		      String input = "1+2*4/5-7+3/6";
		      String output;
		      ExprSydney theTrans = new ExprSydney(input);
		      output = theTrans.infixToPrefix(); 
		      System.out.println("Postfix is " + output + '\n');
	   }
}

