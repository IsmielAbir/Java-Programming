import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
import javax.print.DocFlavor.STRING;

import java.util.Arrays;

public class ticTacToe{
    private static final char Empty_Box = ' ';
    private static final char playerOneSymbol = 'X';
    private static final char playerTwoSymbol = '0';

    private final Scanner input = new Scanner(System.in);
    private final char[][] gameBoard = new char[3][3];

    private String playerOne;
    private String playerTwo;
    private String currentPlayer;
    private String whoWonGame;

    public void startGame(){
        initialize();
        askForNames();

        while(gameIsNotOver()){
            drawBoard();
            playerTurn();
            askForMenu();
        }
        printGameOver();
    }

    private void initialize(){
        for(char[] chars : gameBoard){
            Arrays.fill(chars, Empty_Box);
        }
    }

    private void askForNames(){
        System.out.println("Welcome in the Tic Tac Toe Game!");
        System.out.print("What's your name? ");
        playerOne = input.nextLine();
        System.out.print("Who want to play with you? ");
        playerTwo = input.nextLine();
        System.out.println("Who want to play first trun. press \n1 for "+ playerOne + "\n2 for "+ playerTwo);
        int player = input.nextInt();
        currentPlayer = player==1 ? playerOne : playerTwo;
    }

    private boolean gameIsNotOver(){
        return !(boardFull() || hasAnyPlayeWon());
    }

    private void drawBoard(){
        System.out.println("|---|---|---|");
        for(char[] chars: gameBoard){
            System.out.printf("| %c | %c | %c |%n", chars[0], chars[1], chars[2]);
            System.out.println("|---|---|---|");
        }
    }
    private void playerTurn(){
        System.out.print(whoIsPlaying() + "'s trun");
    }
    private void askForMenu(){
        int row, col;
        do{
            System.out.print("Enter a row number (0, 1, or 2): ");
            row = input.nextInt();
            System.out.print("Enter a col number (0, 1, or 2): ");
            col = input.nextInt();
        }while(!validInput(row, col));

        if(whoIsPlaying().equals(playerOne)){
            gameBoard[row][col] = playerOneSymbol;
            currentPlayer = playerTwo;
        }
        else{
            gameBoard[row][col] = playerTwoSymbol;
            currentPlayer = playerOne;
        }
    }
    private void printGameOver(){
        drawBoard();
        System.out.println("Game Over!");
        if(whoWonGame!=null){
            System.out.print(whoWonGame + "Congratulations! you own the game");
        }
        else
        System.out.println("Tie");
    }
    private boolean boardFull(){
        boolean result = true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(gameBoard[i][j]==Empty_Box)
                result = false;
                break;
            }
            if(!result)
            break;
        }
        return result;
    }

    private boolean hasAnyPlayeWon(){
        char cross= ' ';
        for(int i=0;i<3;i++){
            if(gameBoard[i][0]== gameBoard[i][1] && gameBoard[i][1]== gameBoard[i][2] && gameBoard[i][0] != Empty_Box)
            cross = gameBoard[i][0];
        }
        for(int j=0;j<3;j++){
            if(gameBoard[0][j]== gameBoard[1][j] && gameBoard[1][j]== gameBoard[2][j] && gameBoard[0][j] != Empty_Box)
            cross = gameBoard[0][j];
        }
        if(gameBoard[0][0]== gameBoard[1][1] && gameBoard[1][1]== gameBoard[2][2] && gameBoard[0][0] != Empty_Box){
            cross = gameBoard[0][0];
        }
            if(gameBoard[2][0]== gameBoard[1][1] && gameBoard[1][1]== gameBoard[0][2] && gameBoard[2][0] != Empty_Box){
            cross = gameBoard[2][0];
            }

        if(cross == playerOneSymbol)
        whoWonGame = playerOne;
        else if(cross == playerTwoSymbol)
        whoWonGame = playerTwo;

        return whoWonGame !=null;
        
    }

    private String whoIsPlaying(){
        return currentPlayer;
    }

    private boolean validInput(int row, int col){
        boolean result = false;
        if(row< 0 || col<0 || row>2 || col>2)
        System.out.print("Try again");
        else if(gameBoard[row][col]!=Empty_Box)
        System.out.print("Try again");
        else
        result = true;

        return result;

    }

}