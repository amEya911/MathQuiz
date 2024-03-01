import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GameLogic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of 1st player: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter name of 2nd player: ");
        String name2 = scanner.nextLine();

        System.out.println("\nINSTRUCTIONS! \nA math question will be asked with 3 options i.e 1, 2 and 3, one of them being the correct one. \nPlayer 1 will type 1, 2 and 3 respectively on their keyboard to lock in their answer. \nWhile player 3 will type 7, 8 and 9 ");

        System.out.println("Press enter to begin.....");
        scanner.nextLine();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int i = 3; i > 0; i--) {
            System.out.print(i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for(int j = 0; j < 3; j++){
                System.out.print(".");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\n");
        }

        System.out.println("GO!");
        System.out.println("\n");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        Player john = new Player(name1, Color.RED);
        Player anne = new Player(name2, Color.BLUE);



        Operands operands = new Operands();
        
        int player1 = 0;
        int player2 = 0;

        while(!(player1 == 10) || !(player2 == 10)){

            int[] answer = operands.generateOperands();

            int correctAnswer = answer[0];

            Integer[] displayOptions = {answer[0], answer[1], answer[2]};


            List<Integer> optionList = Arrays.asList(displayOptions);
            Collections.shuffle(optionList);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\n");
            for (int j = 0; j < optionList.size(); j++) {
                System.out.println((j + 1) + ". " + optionList.get(j));
            }


            System.out.print("\nEnter your choice: ");
            char inputChar = scanner.nextLine().charAt(0);

            int userChoice = (int) inputChar;

            if(userChoice == 49 || userChoice == 50 || userChoice == 51){
                userChoice = userChoice - 49;
                if(optionList.get(userChoice) == correctAnswer) {
                    player1 ++;
                } else {
                    player2 ++;
                }
            } else {
                userChoice = userChoice - 55;
                if(optionList.get(userChoice) == correctAnswer) {
                    player2 ++;
                } else {
                    player1 ++;
                }
            }

            System.out.println("Score: " + john.getName() + ": " + player1);
            System.out.println("Score: " + anne.getName() + ": " + player2);


            System.out.println("\n");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}