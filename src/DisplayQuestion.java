public class DisplayQuestion {

    public void question (Operand[]operand,int randomNumber){
        switch (randomNumber) {
            case 0 -> System.out.println(operand[0].getOperand() + " + " + operand[1].getOperand());
            case 1 -> System.out.println(operand[0].getOperand() + " - " + operand[1].getOperand());
            case 2 -> System.out.println(operand[0].getOperand() + " x " + operand[1].getOperand());
            case 3 -> System.out.println(operand[0].getOperand() + " ÷ " + operand[1].getOperand());
        }

    }
}
