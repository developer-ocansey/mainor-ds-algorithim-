import java.util.Scanner; 

class Factorial{  
    static int factorial(int num){    
     if (num == 0)    
       return 1;    
     else    
       return(num * factorial(n-1));    
    }    
    public static void main(String args[]){  
     int i, fact=1;  
     int number = keyboard.nextInt();  
     fact = factorial(number);   
     System.out.println("Factorial of "+number+" is: "+fact);    
    }  
   }  