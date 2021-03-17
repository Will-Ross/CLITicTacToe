import java.util.Scanner;

/**Driver program for the Tic Tac Toe CLI game 
@author Bill Ross*/
public class App {
    public static void main(String[] args) throws Exception {
        TicTacToe game = new TicTacToe();
        Scanner sc = new Scanner(System.in);
        boolean win = false;
        int times = 0;

        while (!win && times < 9) {
            if (!win & times < 9){
            System.out.println(game.getGrid());
            System.out.println("Where do you want to insert X?");
            int index = sc.nextInt();
            game.insertX(index);
            win = game.checkWin();
            if (win) {
                System.out.println(game.getGrid());
                System.out.println("X wins");
            }
            times++;
            }
            if (!win && times < 9){
            System.out.println(game.getGrid());
            System.out.println("Where do you want to insert O?");
            int index = sc.nextInt();
            game.insertO(index);
            win = game.checkWin();
            if (win) {
                System.out.println(game.getGrid());
                System.out.println("O wins");
            }
            times++;
            }
        }

        if (times == 9 && !win) {
            System.out.println(game.getGrid());
            System.out.println("It's a tie!");
        }
    }
}
