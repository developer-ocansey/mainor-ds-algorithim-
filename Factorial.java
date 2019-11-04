import java.util.Scanner; 

class Factorial{  
    static int factorial(int num){    
     if (num == 0)    
       return 1;    
     else    
       return(num * factorial(num - 1));    
    }    
    public static void main(String args[]){  
     int fact=1;  
     Scanner keyboard = new Scanner(System.in);
     System.out.println("Enter number to calculate factorial of"); 
     int number = keyboard.nextInt();  
     fact = factorial(number);   
     keyboard.close();
     System.out.println("Factorial of "+number+" is: "+fact);    
    }  
   }  