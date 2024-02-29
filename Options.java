package Maths;

public class Options {
    
    public void generateOptions(int randomNumber) {

        switch (randomNumber) {
            case 1:
                System.out.println("a]2         b]1         c]3");
                break;

            case 2:
                System.out.println("a]56         b]64         c]49");
                break;

            case 3:
                System.out.println("a]5         b]15        c]25");
                break;

            case 4:
                System.out.println("a]48       b]40         c]38");
                break;

            case 5:
                System.out.println("a]20         b]10         c]16");
                break;
                
            default:
                break;
        }
    }
}
