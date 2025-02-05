import java.util.Scanner;

class prac4{


public static void main(String args[])
{
    Scanner input=new Scanner(System.in);

    String name=input.nextLine();
    int age=input.nextInt();
     input.nextLine();
    String address=input.nextLine();

    System.out.println("name "+name);
    System.out.println("age "+age);
   
    System.out.print("address: "+address);
}
}