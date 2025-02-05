
import java.util.Scanner;
class prac2{
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        System.err.println("Enter match predict: ");
        String userInput= input.nextLine();

        if(userInput.equals("win")){
            System.out.print("Ee sala cup Namedhey");
        }

        else{
            System.out.print("cup ila");
        }
    }
}