import java.util.Random;

public class CalculateOperands {
    public Operand[] generateOperands(){
        Operand[] operands = new Operand[2];
        Random random = new Random();
        int randomOperator1 = random.nextInt(15) + 1;
        int randomOperator2 = random.nextInt(15) + 2;

        operands[0] = new Operand(randomOperator1 * randomOperator2);
        operands[1] = new Operand(randomOperator1);

        return operands;

    }
}
