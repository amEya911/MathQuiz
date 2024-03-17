public class Option {
    private final int option;
    private final Boolean isAnswer;

    public Option(int option, Boolean isAnswer) {
        this.option = option;
        this.isAnswer = isAnswer;
    }

    public int getOption() {
        return option;
    }

    public Boolean getAnswer() {
        return isAnswer;
    }
}
