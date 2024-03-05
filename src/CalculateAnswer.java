public class CalculateAnswer {

    public int calculateAnswer(Operand[] operand, int randomNumber) {


        return switch (randomNumber) {
            case 0 -> operand[0].getOperand() + operand[1].getOperand();
            case 1 -> operand[0].getOperand() - operand[1].getOperand();
            case 2 -> operand[0].getOperand() * operand[1].getOperand();
            case 3 -> operand[0].getOperand() / operand[1].getOperand();
            default -> 0;
        };

    }
}
