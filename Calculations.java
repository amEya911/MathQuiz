public class Calculations {

    public int doCalculations(int operator1, int operator2, int randomOperand) {
        int answer = 0;
        switch (randomOperand) {
            case 0:
                answer = (operator1 + operator2);
                break;

            case 1:
                answer = (operator1 - operator2);
                break;

            case 2:
                answer = (operator1 * operator2);
                break;

            case 3:
                answer = (operator1 / operator2);
                break;

            default:
                break;
        }
        return answer;
    }
}
