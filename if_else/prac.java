// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class prac {
    public static void main(String[] args) {
        
        incomecheck answer= new incomecheck();
        answer.che();
       
}
}

class incomecheck{
    
    public void che(){
        
         Scanner input = new Scanner(System.in);
        System.out.println("Enter your income: ");
        int income=input.nextInt();
        
        if(income>=7000){
            System.out.print("schorlship is available");
        }
        
        else{
            System.out.print("Not available");
        }
       
    }
        
    }
