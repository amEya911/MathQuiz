public class Option {
    private int option;
    private Boolean isAnswer;

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
