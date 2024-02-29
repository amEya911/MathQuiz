package Maths;

public class Answer {
    
    public int[] checkAnswer(int randomNumber, int input, int player1, int player2) {

        switch (randomNumber) {
            case 1:
                switch (input) {
                    case 49:
                        player2 ++;
                        break;
                
                    case 50:
                        player2 ++;
                        break;

                    case 51:
                        player1 ++;
                        break;

                     case 55:
                        player1 ++;
                        break;
                
                    case 56:
                        player1 ++;
                        break;

                    case 57:
                        player2 ++;
                        break;

                    default:
                        break;
                }
                
                break;

            case 2:
                switch (input) {
                    case 49:
                        player1 ++;
                        break;
                
                    case 50:
                        player2 ++;
                        break;

                    case 51:
                        player2 ++;
                        break;

                     case 55:
                        player2 ++;
                        break;
                
                    case 56:
                        player1 ++;
                        break;

                    case 57:
                        player1 ++;
                        break;

                    default:
                        break;
                }
                
                break;
            
            case 3:
                switch (input) {
                    case 49:
                        player2 ++;
                        break;
                
                    case 50:
                        player1 ++;
                        break;

                    case 51:
                        player2 ++;
                        break;

                     case 55:
                        player1 ++;
                        break;
                
                    case 56:
                        player2 ++;
                        break;

                    case 57:
                        player1 ++;
                        break;

                    default:
                        break;
                }
                
                break;

            case 4:
                switch (input) {
                    case 49:
                        player2 ++;
                        break;
                
                    case 50:
                        player2 ++;
                        break;

                    case 51:
                        player1 ++;
                        break;

                    case 55:
                        player1 ++;
                        break;
                
                    case 56:
                        player1 ++;
                        break;

                    case 57:
                        player2 ++;
                        break;

                    default:
                        break;
                }

                break;

            case 5:
                switch (input) {
                    case 49:
                        player1 ++;
                        break;
                
                    case 50:
                        player2 ++;
                        break;

                    case 51:
                        player2 ++;
                        break;

                    case 55:
                        player2 ++;
                        break;
                
                    case 56:
                        player1 ++;
                        break;

                    case 57:
                        player1 ++;
                        break;

                    default:
                        break;
                }
                
                break;
        
            default:
                break;
        }

        return new int[]{player1, player2};
    }
    
}
