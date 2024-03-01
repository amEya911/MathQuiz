import java.util.Random;
public class Operators {
    public int[] generateOperators(){
        Random random = new Random();
        int randomOperator1 = random.nextInt(15) + 1;
        int randomOperator2 = random.nextInt(15) + 1;

        int randomOperator3 = randomOperator1 * randomOperator2;

        return new int[]{randomOperator3, randomOperator1};
    }
}
