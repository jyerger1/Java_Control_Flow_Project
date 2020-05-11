import java.util.Scanner;
import java.util.Random;

public class controlFlowProject {

    public static void main(String[] args) {

        do {

            AsciiChars.printNumbers();
            AsciiChars.printLowerCase();
            AsciiChars.printUpperCase();

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = scan.next();

            System.out.println("Hello " + name
                    + "do you wish to continue to the interactive portion? \nEnter 'yes' or 'y' to continue");

            String response = scan.next();

            switch (response) {
                case "yes":
                case "y":
                    break;

                default:
                    System.out.print("Try again later");
                    // check
                    System.exit(0);
                    // check

            }

            System.out.println("Do you have a red car? (yes or no)");
            String car = scan.next();

            System.out.println("whats the name your favorite pet?");
            String pet = scan.next().toUpperCase();

            System.out.println("Whats the age of your favorite pet?");
            int petage = scan.nextInt();

            System.out.println("What is your lucky number?");
            int luckynumber = scan.nextInt();

            System.out.println("Do you have a favorite quarterback?");
            String jerseyQuestion = scan.next();

            // CHECK POINT GOOD ABOVE

            int jerseyNum = 0;
            // saves jersey number so it stays in main scope
            switch (jerseyQuestion) {
                case "yes":
                    System.out.println("What is their jersey number?");
                    jerseyNum = scan.nextInt();
                    // gets jersey number
                    break;
                case "no":
                    break;
                default:
                    break;
            }

            System.out.println("What is the two-digit model year of your car? ");
            int modelYear = scan.nextInt();

            System.out.println("What is the first name of your favorite actor or actress?");
            String act = scan.next();

            System.out.println("Enter a random number between 1 and 50: ");
            int randomNum = scan.nextInt();

            // CHECK POINT GOOD ABOVE

            Random rand = new Random();// instance of random class

            // MAGIC BALL

            int upperboundMagicBall = 76;
            int int_randomMB = rand.nextInt(upperboundMagicBall);

            int jerseyOrLuckyNumber = 0;
            switch (jerseyQuestion) {
                case "yes":

                    jerseyOrLuckyNumber = (int_randomMB + jerseyNum);
                    break;

                default:
                    jerseyOrLuckyNumber = (int_randomMB + luckynumber);
                    break;
            }

            // System.out.println("Magic Ball Number " + jerseyOrLuckyNumber);

            // MAGIC BALL

            // FIVE RANDOM NUMBERS

            int upperbound5 = 66; // generating random values from 0-65
            int int_random1 = rand.nextInt(upperbound5);

            char petChar3 = pet.charAt(2);
            int petAscii = (int) petChar3;

            int randNum1 = Math.min(modelYear + luckynumber, 65);
            // System.out.println(randNum1);

            int randNum2 = Math.max(randomNum - int_random1, 0);
            // System.out.println(randNum2);

            int randNum3 = Math.min(petage + modelYear, 65);
            // System.out.println(randNum3);

            int randNum4 = Math.min(jerseyNum + petage + luckynumber, 65);
            // System.out.println(randNum4);

            int randNum5 = petAscii;
            // System.out.println(randNum5);

            System.out.println("Lottery numbers: " + randNum1 + ", " + randNum2 + ", " + randNum3 + ", " + randNum4
                    + ", " + randNum5 + " Magic ball: " + jerseyOrLuckyNumber);

            // FIVE RANDOM NUMBER

            // PLAY AGAIN?

            System.out.print("Do you wish to continue? yes/no: ");
            String playAgain = scan.next();

            if (playAgain.equals("no")) {
                break;
            }

        } while (true);

        // PLAY AGAIN?

        // int upperbound = 66; // generating random values from 0-65

        // int int_random1 = rand.nextInt(upperbound);
        // System.out.println(int_random1);

        // int int_random2 = rand.nextInt(upperbound);
        // System.out.println(int_random2);

        // int int_random3 = rand.nextInt(upperbound);
        // System.out.println(int_random3);

        // int int_random4 = rand.nextInt(upperbound);
        // System.out.println(int_random4);

        // int int_random5 = rand.nextInt(upperbound);
        // System.out.println(int_random5);

    }
}

// scanner.close();
