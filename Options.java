import java.util.Random;

public class Options {

    public int[] generateOptions(int answer) {
        Random random = new Random();
        int[] closeNumbers = new int[2];
        int rangeWidth = 15;

        int randomNumber1 = answer + random.nextInt(rangeWidth + 1);
        if (randomNumber1 == answer) {
            randomNumber1++;
        }
        closeNumbers[0] = randomNumber1;
        

        int randomNumber2 = answer - random.nextInt(rangeWidth + 1);
        while (randomNumber2 <= 0 || randomNumber2 == answer || randomNumber2 == closeNumbers[0]) {
            randomNumber2++;
        }
        closeNumbers[1] = randomNumber2;
        
        return closeNumbers;
    }
}