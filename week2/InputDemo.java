import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean inputRepeat = true;

        while(inputRepeat == true) {
            int score;

            System.out.println("Hey, what's the score?");
            score = in.nextInt();

            System.out.println("What's my GPA?");
            double gpa = in.nextDouble();

            System.out.println("What's your first name?");
            String fName = in.next();

            System.out.println("What's your full name?");
            String fullName = in.nextLine();
        }

        int choice = 5;

        switch(choice) {
            case 0:
                System.out.println("you chose 0");
                break;
            case 1:
                System.out.println("you chose 1");
                break;
            default:
                System.out.println("Don't know what you chose..");
                break;
        }

    }
}
