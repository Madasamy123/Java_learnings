
import java.util.Scanner;

class prac3{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);

        int num1=input.nextInt();
        int num2=input.nextInt();

        if(num1==num2){
            System.out.print("equal to num1 and num2");
        }

        else if(num2>num1){
            System.out.print("num2 is greater than num1");

        }
        else {
            System.out.print("num1 is greater than num2");
        }
    }
}