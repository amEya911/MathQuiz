import java.util.Random;

public class Operands {
    public int[] generateOperands() {
        Operators operators = new Operators();
        Calculations calculations = new Calculations();
        Options options = new Options();
        Random random = new Random();
        int randomOperand = random.nextInt(4);
        int[] randomOperator = operators.generateOperators();
        int operator1 = randomOperator[0];
        int operator2 = randomOperator[1];
        switch (randomOperand) {
            case 0:
                System.out.println(operator1 + " + " + operator2);
                break;

            case 1:
                System.out.println(operator1 + " - " + operator2);
                break;

            case 2:
                System.out.println(operator1 + " x " + operator2);
                break;

            case 3:
                System.out.println(operator1 + " ÷ " + operator2);
                break;


            default:
                break;
        }
        int answer = calculations.doCalculations(operator1, operator2, randomOperand);
        int[] closeNumbers = options.generateOptions(answer);
        int option1 = closeNumbers[0];
        int option2 = closeNumbers[1];



        return new int[]{answer, option1, option2};

    }
}
