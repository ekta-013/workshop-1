package com.bridgelabs;
import java.util.Scanner;

public class ticTacToe {
	public enum CurrentPlayer{
		PERSON, COMPUTER
	}
	static char[][]grid = new char[3][3];
	static Scanner scanner = new Scanner(System.in);
	static char personLetter;
	static char computerLetter;
	static int position;
	
	static void createGrid(char[][] grid) {		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				grid[i][j] = ' ';					

			}
		}
	}
		 static void getLetter() {
		        System.out.println("Choose the Letter(X or O)");
		        personLetter = scanner.next().toUpperCase().charAt(0);
		        computerLetter = (personLetter == 'X') ? 'O' : 'X';
		        System.out.println("Your Letter is " + personLetter);
		        System.out.println("Computer Letter " + computerLetter);
	
	}	
		 static void display(char[][] g) {
			 System.out.println(" "+g[0][0]+" | "+g[0][1]+" | "+g[0][2]);
				System.out.println("-----------");
				System.out.println(" "+g[1][0]+" | "+g[1][1]+" | "+g[1][2]);
				System.out.println("-----------");
				System.out.println(" "+g[2][0]+" | "+g[2][1]+" | "+g[2][2]);	 
		 }
		 static void makeMove(int position, char currentPersonLetter, char[][] g) {
			switch(position) {
			case 1:
				if (g[0][0] == ' ')
					g[0][0] = currentPersonLetter;
				break;
			case 2:
				if (g[0][1] == ' ')
					g[0][1] = currentPersonLetter;
				break;
			case 3:
				if (g[0][2] == ' ')
					g[0][2] = currentPersonLetter;
				break;
			case 4:
				if (g[1][0] == ' ')
					g[1][0] = currentPersonLetter;
				break;
			case 5:
				if (g[1][1] == ' ')
					g[1][1] = currentPersonLetter;
				break;
			case 6:
				if (g[1][2] == ' ')
					g[1][2] = currentPersonLetter;
				break;
			case 7:
				if (g[2][0] == ' ')
					g[2][0] = currentPersonLetter;
				break;
			case 8:
				if (g[2][1] == ' ')
					g[2][1] = currentPersonLetter;
				break;
			case 9:
				if (g[2][2] == ' ')
					g[2][2] = currentPersonLetter;
				break;
			default:
				break;
		}		
	}
	public static void main(String[] args) {
		createGrid(grid);
		getLetter();
		display(grid);
		makeMove(3, personLetter, grid);
		display(grid);
	}
}