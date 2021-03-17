/**Very simple and non-efficient Tic Tac Toe game
@author Bill Ross*/
public class TicTacToe {
    /**This is the grid of the tic tac toe but in a 1D array*/
    char[] grid;

    /**This constructs a new 3x3 tic tac toe with basic values inside of it*/
    public TicTacToe() {
        grid = new char[9];
        for (int i = 0; i < grid.length; i++) {
            String tmp = "" + (i + 1);
            grid[i] = tmp.charAt(0);
        }
    }

    /**This method returns a nicely formatted tic tac toe grid
    @return the tic tac toe grid*/
    public String getGrid() {
        String output = "";
        for (int i = 0; i < 3; i++) {
            output += "|";
            for (int j = 0; j < 3; j++) {
                output += grid[(i * 3) + j] + "|";
            }
            output += "\n";
        }
        return output;
    }

    /**Used to insert a X into the grid
    @param index the index where we want to insert X*/
    public void insertX(int index) {
        grid[index - 1] = 'X';
    }

    /**Used to insert a O into the grid
    @param index the index where we want to insert X*/
    public void insertO(int index) {
        grid[index - 1] = 'O';
    }

    /**This a very non-efficient method to check if there is a win on the grid
    @return a true or false value if there is a win*/
    public boolean checkWin() {
        boolean win = false;
        //Checks Xs
        if (grid[0] == 'X' && grid[4] == 'X' && grid[8] == 'X') {
            win = true;
        }
        if (grid[2] == 'X' && grid[4] == 'X' && grid[6] == 'X') {
            win = true;
        }
        if (grid[0] == 'X' && grid[1] == 'X' && grid[2] == 'X') {
            win = true;
        }
        if (grid[3] == 'X' && grid[4] == 'X' && grid[5] == 'X') {
            win = true;
        }
        if (grid[6] == 'X' && grid[7] == 'X' && grid[8] == 'X') {
            win = true;
        }
        if (grid[0] == 'X' && grid[3] == 'X' && grid[6] == 'X') {
            win = true;
        }
        if (grid[1] == 'X' && grid[4] == 'X' && grid[7] == 'X') {
            win = true;
        }
        if (grid[2] == 'X' && grid[5] == 'X' && grid[8] == 'X') {
            win = true;
        }
        //Check Os
        if (grid[0] == 'O' && grid[4] == 'O' && grid[8] == 'O') {
            win = true;
        }
        if (grid[2] == 'O' && grid[4] == 'O' && grid[6] == 'O') {
            win = true;
        }
        if (grid[0] == 'O' && grid[1] == 'O' && grid[2] == 'O') {
            win = true;
        }
        if (grid[3] == 'O' && grid[4] == 'O' && grid[5] == 'O') {
            win = true;
        }
        if (grid[6] == 'O' && grid[7] == 'O' && grid[8] == 'O') {
            win = true;
        }
        if (grid[0] == 'O' && grid[3] == 'O' && grid[6] == 'O') {
            win = true;
        }
        if (grid[1] == 'O' && grid[4] == 'O' && grid[7] == 'O') {
            win = true;
        }
        if (grid[2] == 'O' && grid[5] == 'O' && grid[8] == 'O') {
            win = true;
        }
        return win;
    }
}
