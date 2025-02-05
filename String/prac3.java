
import java.util.Scanner;
class prac3{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String user=input.nextLine();

        if(user.equals("dead")){
            System.out.print("Surya meets Ramya");
        }
        else{
            System.out.print("Surya weds meghana");
        }
        
    }

}