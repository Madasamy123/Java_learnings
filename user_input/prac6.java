import java.util.Scanner;

class prac6{

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        String name=input.nextLine();
        double score=input.nextDouble();
        input.nextLine();
        String department=input.nextLine();

        System.out.println("name :"+name);
        System.out.println("score:"+score/10);
        System.out.print("department :"+department);
    }
}