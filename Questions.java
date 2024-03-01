package MathQuiz;

public class Questions {
   
    public void generateQuestions(int randomNumber){
        switch (randomNumber) {
            case 1:
                System.out.println("15 - 12");
                break;
            
            case 2:
                System.out.println("7 x 8");
                break;

            case 3:
                System.out.println("225 ÷ 15");
                break;

            case 4:
                System.out.println("10 + 28");
                break;

            case 5:
                System.out.println("33 - 13");
                break;

            default:
                break;
        }
    }
}
