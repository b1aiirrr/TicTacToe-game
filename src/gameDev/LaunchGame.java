package gameDev;

import java.util.Scanner;

public class LaunchGame {

	public static void main(String[] args) {
		System.out.println("----------------------WELCOME TO MY TICTACTOE ENDEAVOUR----------------------");
		String p1Name;
		String p2Name;
		char p1Mark;
		char p2Mark;
		
		TicTacToe t = new TicTacToe();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Player's Name and preferred Mark: ");
		p1Name = scan.nextLine();
		p1Mark = scan.next().charAt(0);
		scan.nextLine();
		
		System.out.println("Enter 2nd Player's Name and preferred Mark: ");
		p2Name = scan.nextLine();
		p2Mark = scan.next().charAt(0);
		scan.nextLine();
		
		HumanPlayer p1 = new HumanPlayer(p1Name,p1Mark);
		//HumanPlayer p2 = new HumanPlayer(p2Name,p2Mark);
		AIplayer p2 = new AIplayer(p2Name,p2Mark);
		
		Player cp;
		cp = p1;
		
		while(true){
			System.out.printf("%s's turn\n",cp.name);
			cp.makeMove();
			TicTacToe.displayBoard();
			
			if(TicTacToe.checkRowWin()|| TicTacToe.checkColWin()|| TicTacToe.checkDiagonalWin()){
				System.out.printf("**********%s has Won!**********",cp.name);
				break;
			}
			else if(TicTacToe.checkForDraw()){
				System.out.println("ITS A DRAW!");
				break;
			}
			else{
				if(cp == p1){
					cp = p2;
				}
				else{
					cp = p1;
				}
			}
		
		}
		
	}

}
