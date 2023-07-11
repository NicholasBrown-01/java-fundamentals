import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Pluralize Method

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide an animal (Ex: Dog, Cat etc):");
        String userWord = String.valueOf(scanner.nextLine());

        System.out.println("Please input number 0,1, or 2:");
        int userNumber = Integer.valueOf(scanner.nextLine());

        pluralize(userWord, userNumber);
        
    }

    static void pluralize(String userWord, int userNumber) {
    
        if (userNumber > 1 || userNumber == 0) {
            System.out.println("I own "+userNumber+" "+userWord+"s.");
            
        } else {
            System.out.println("I own "+userNumber+" "+userWord+".");
        }
    
    }
}