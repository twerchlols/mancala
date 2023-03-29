import java.util.Scanner;

/*
* Aiden Aldinger
* 15 February 2023
* Purpose: code the mancala game logic and make it work
* */
public class Mancala {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        Player[] player = new Player[3];
        int playerTurn = 1, move = 1;
        System.out.println("What's player one's name ");
        player[1].name = scanner.nextLine();
        player[1].firstPit = 0;
        player[1].lastPit = 5;
        player[1].mancala = 6;
        System.out.println("What's player two's name ");
        player[2].name = scanner.nextLine();
        player[2].firstPit = 7;
        player[2].lastPit = 12;
        player[2].mancala = 13;
        while (playerTurn != 0){
            board.printBoard();
            System.out.println("It's now " + player[playerTurn] + "'s turn. Choose from pits " +
                    player[playerTurn].firstPit + " and " + + player[playerTurn].lastPit + ".");
            move = scanner.nextInt();
        }
    }
}