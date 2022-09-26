import java.util.Scanner;
public class Ifelse {
    public static void main (String[] arg)
    {
        String question = "What is the largest planet in the univere?";
        String ans1 = "earth";
        String ans2 = "jupiter";
        String ans3 = "saturn";

        String correctans = ans2;

        System.out.println(question);
        System.out.println("Choose any one option from the following:\n" + ans1 + "\n" + ans2 +"\n" + ans3);
        System.out.print("Your choice is: ");
        Scanner input = new Scanner (System.in);
        String urchoice = input.next();

        if(correctans.equals(urchoice.toLowerCase()))
        {
            System.out.println("Yay! Thats's a correct answer :)");
        }
        else {
            System.out.println("Incorrect answer :(");
            System.out.println("The correct answer is " + correctans);
        }
    }
}
