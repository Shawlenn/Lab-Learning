import java.util.Scanner;

public class LabProgram {
    public static void main (String[] args) {

        // Count input length without spaces, periods, exclamation points, or commas
        // Ex: Listen, Mr. Jones, clam down.
        // output then = 21
        // count length of something (without spaces, periods, exclamation points, or commas)


        // Variables
        Scanner scan = new Scanner(System.in);   // need a scanner
        String userEnter;
        int count = 0;          // initialize variable count to 0

        System.out.println("Enter a sentence: ");
        userEnter = scan.nextLine();    // use nextLine() so that it reads whitespace

        // simple loop
        for (int i = 0; i < userEnter.length(); i++) {

            // simple if  - just when userEnter.charAt(i) != "this..." then count++
            if (userEnter.charAt(i) != ' ' && userEnter.charAt(i) != '.' && userEnter.charAt(i) != '!' && userEnter.charAt(i) !=',') {
                count++;
            }
        }
        // come out of the if statement and the loop to print count
        System.out.println(count);

    }
}
