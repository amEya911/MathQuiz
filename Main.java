package Maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of 1st player: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter name of 2nd player: ");
        String name2 = scanner.nextLine();

        System.out.println("Press enter to begin.....");
        scanner.nextLine();

        
        Player john = new Player(name1, Color.RED);
        Player anne = new Player(name2, Color.BLUE);

        int player1 = 0;
        int player2 = 0;

        Random random = new Random();
        Questions questions = new Questions();
        Options options = new Options();
        Answer answerPlayer1 = new Answer();
        List<Integer> uniqueNumbers = new ArrayList<>();

        // top: 49, 50, 51
        // right: 55, 56, 57

        while (uniqueNumbers.size() < 3) {
            int randomNumber = random.nextInt(5) + 1;
            if (!uniqueNumbers.contains(randomNumber)) {
                uniqueNumbers.add(randomNumber);
            }
        }

        Collections.shuffle(uniqueNumbers);

        for (int i = 0; i < uniqueNumbers.size(); i++) {
            int number = uniqueNumbers.get(i);

            questions.generateQuestions(number);
            options.generateOptions(number);

            System.out.print("Enter your answer: ");
            char inputChar = scanner.nextLine().charAt(0); 
        
            int input = (int) inputChar;

            int[] newValues = answerPlayer1.checkAnswer(number, input, player1, player2);
            player1 = newValues[0];
            player2 = newValues[1];
 
            System.out.println("Score: " + john.getName() + ": " + player1);
            System.out.println("Score: " + anne.getName() + ": " + player2);

            System.out.println("\n");
        }

        if(player1 > player2){
            System.out.println("Congratulations " + john.getName() + ", you won!");
        }
        else {
            System.out.println("Congratulations " + anne.getName() + ", you won!");
        }

        scanner.close();
    }

    
}