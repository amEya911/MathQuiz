import java.util.Random;

public class CalculateOption {

    public Option[] generateOptions(int answer) {
        Random random = new Random();
        Option[] options = new Option[3];
        int option1 = answer + random.nextInt(16) + 2;
        int option2;
        do {
            option2 = answer - random.nextInt(16) - 1;
        } while (option2 <= 0);

        options[0] = new Option(option1, false);
        options[1] = new Option(option2, false);
        options[2] = new Option(answer, true);

        return options;
    }

}
