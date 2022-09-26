import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Studentname = "Tamil Iniyal";
        int Age = 19;
        Double GPA = 8.09;
        char Studentinitial = Studentname.charAt(0);
        System.out.println("Current GPA of " + Studentname + " is " + GPA );
        System.out.println("Enter the new GPA" );
        Scanner input = new Scanner(System.in);
        GPA = input.nextDouble();
        System.out.println("$$$___STUDENT DETAILS___$$$");
        System.out.println("Name   : " + Studentname );
        System.out.println("Initial: " + Studentinitial );
        System.out.println("Age    : " + Age );
        System.out.println("GPA    : " + GPA );


    }
}
