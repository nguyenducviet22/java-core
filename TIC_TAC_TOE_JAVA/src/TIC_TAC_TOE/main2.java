package TIC_TAC_TOE;

import java.util.*;

public class main2 {
	public static void main(String[] args) {
		String[][] gameBoard = { { " ", "|", " ", "|", " " }, { "-", "+", "-", "+", "-" }, { " ", "|", " ", "|", " " },
				{ "-", "+", "-", "+", "-" }, { " ", "|", " ", "|", " " } };
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter num 1-9:");
			int playerPos = sc.nextInt();

			placePiece(gameBoard, playerPos, "player");
			Random rand = new Random();
			int cpuPos = rand.nextInt(9) + 1;
			placePiece(gameBoard, cpuPos, "cpu");

			printGameBoard(gameBoard);
		}
	}

	public static void printGameBoard(String[][] gameBoard) {
		for (String[] i : gameBoard) {
			for (String j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void placePiece(String[][] gameBoard, int pos, String user) {
		String symbol = " ";
		if (user.equals("player")) {
			symbol = "X";
		} else if (user.equals("cpu")) {
			symbol = "O";
		}
		switch (pos) {
		case 1:
			gameBoard[0][0] = symbol;
			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[2][0] = symbol;
			break;
		case 5:
			gameBoard[2][2] = symbol;
			break;
		case 6:
			gameBoard[2][4] = symbol;
			break;
		case 7:
			gameBoard[4][0] = symbol;
			break;
		case 8:
			gameBoard[4][2] = symbol;
			break;
		case 9:
			gameBoard[4][4] = symbol;
			break;
		default:
			break;
		}
	}
}
