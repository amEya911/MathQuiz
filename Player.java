package MathQuiz;

public class Player {
    
    private String name;
    private int score;
    private Color color;


    public Player(String name, Color color) {
        this.name = name;
        this.score = 0;
        this.color = color;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getScore() {
        return score;
    }


    public void setScore(int score) {
        this.score = score;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    
    
}
