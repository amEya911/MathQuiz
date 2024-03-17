import java.util.*;

public class GameLogic {

    private static final int MAX_SCORE = 10;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of 1st player: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter name of 2nd player: ");
        String name2 = scanner.nextLine();
        System.out.println("\n");
        System.out.println("\nINSTRUCTIONS! \nA math question will be asked with 3 options i.e 1, 2 and 3, one of them being the correct one. \nPlayer 1 will type 1, 2 and 3 respectively on their keyboard to lock in their answer. \nWhile player 2 will type 7, 8 and 9 ");
        System.out.println("Press enter to begin.....");
        scanner.nextLine();

        Player john = new Player(name1, Color.RED);
        Player anne = new Player(name2, Color.BLUE);

        int player1Score = 0;
        int player2Score = 0;

        CalculateOperands calculateOperands = new CalculateOperands();
        DisplayQuestion displayQuestion = new DisplayQuestion();
        CalculateAnswer calculateAnswer = new CalculateAnswer();
        Random random = new Random();

        while(player1Score < MAX_SCORE && player2Score < MAX_SCORE) {
            Operand[] operand = calculateOperands.generateOperands();
            int randomNumber = random.nextInt(4);

            displayQuestion.question(operand, randomNumber);
            int answer = calculateAnswer.calculateAnswer(operand, randomNumber).answer();

            CalculateOption calculateOption = new CalculateOption();
            Option[] option = calculateOption.generateOptions(answer);

            List<Option> options = Arrays.asList(option);
            Collections.shuffle(options);

            System.out.println("\n1. " + option[0].getOption());
            System.out.println("2. " + option[1].getOption());
            System.out.println("3. " + option[2].getOption());

            System.out.print("\nEnter your choice: ");
            char inputChar = scanner.nextLine().charAt(0);

            int userChoice = Character.getNumericValue(inputChar);

            if (userChoice >= 1 && userChoice <= 3) {
                userChoice--;
                if (option[userChoice].getAnswer()) {
                    player1Score++;
                } else {
                    player2Score++;
                }
            } else {  //(userChoice >= 7 && userChoice <= 9)
                userChoice -= 7;
                if (option[userChoice].getAnswer()) {
                    player2Score++;
                } else {
                    player1Score++;
                }
            }

            System.out.println("Score: " + john.getName() + ": " + player1Score);
            System.out.println("Score: " + anne.getName() + ": " + player2Score);
            System.out.println("\n");

        }

        if (player1Score == 10) System.out.println("Congratulations! " + name1 + " won");
        else System.out.println("Congratulations! " + name2 + " won");
    }



}
