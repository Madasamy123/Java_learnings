
import java.util.Scanner;

class prac4{
    public static void main(String args[])
    {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter your marks: ");
    int marks=input.nextInt();

    if(marks>=35){
        System.out.print("pass");
    }
    else{
        System.out.print("fail");
    }


    }
}