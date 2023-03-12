package TIC_TAC_TOE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main_tic_tac_toe {
	static int player1Pos, player2Pos;

	static ArrayList<Integer> player1Positions = new ArrayList<Integer>();
	static ArrayList<Integer> player2Positions = new ArrayList<Integer>();

	public static void main(String[] args) {
		String[][] gameBoard = { { " ", "|", " ", "|", " " }, { "-", "+", "-", "+", "-" }, { " ", "|", " ", "|", " " },
				{ "-", "+", "-", "+", "-" }, { " ", "|", " ", "|", " " } };

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number 1-9");

			int player1Pos = sc.nextInt();
			while (player1Positions.contains(player1Pos) || player2Positions.contains(player2Pos)) {
				System.out.println("Position taken, player 1 enters another position");
				player1Pos = sc.nextInt();
			}
			placePiece(gameBoard, player1Pos, "player1");
			printGameBoard(gameBoard);
			String result = checkWinner();
			System.out.println(result);

			int player2Pos = sc.nextInt();
			while (player1Positions.contains(player1Pos) || player2Positions.contains(player2Pos)) {
				System.out.println("Position taken, player 2 enters another position");
				player1Pos = sc.nextInt();
			}
			placePiece(gameBoard, player2Pos, "player2");
			printGameBoard(gameBoard);
			String result2 = checkWinner();
			System.out.println(result2);
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
		String symbol = "";
		if (user.equals("player1")) {
			symbol = "X";
			player1Positions.add(pos);
		} else if (user.equals("player2")) {
			symbol = "O";
			player2Positions.add(pos);
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

	public static String checkWinner() {
		List topRow = Arrays.asList(1, 2, 3);
		List midRow = Arrays.asList(4, 5, 6);
		List botRow = Arrays.asList(7, 8, 9);
		List leftCol = Arrays.asList(1, 4, 7);
		List centerCol = Arrays.asList(2, 5, 8);
		List rightCol = Arrays.asList(3, 6, 9);
		List cross1 = Arrays.asList(1, 5, 9);
		List cross2 = Arrays.asList(3, 5, 7);

		List<List> winning = new ArrayList<List>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(leftCol);
		winning.add(centerCol);
		winning.add(rightCol);
		winning.add(cross1);
		winning.add(cross2);

		for (List list : winning) {
			if (player1Positions.containsAll(list)) {
				return "Congrat player 1 won";
			} else if (player2Positions.containsAll(list)) {
				return "Congrat player 2 won";
			} else if (player1Positions.size() + player2Positions.size() == 9) {
				return "Game board is full";
			}
		}
		return "";
	}
}