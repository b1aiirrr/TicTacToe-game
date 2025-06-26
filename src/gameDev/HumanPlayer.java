package gameDev;

import java.util.Scanner;

public class HumanPlayer extends Player{

	public HumanPlayer(String name,char mark){
		this.name = name;
		this.mark = mark;
	}
	
	public void makeMove() {
       Scanner scan = new Scanner(System.in);
       
       int row,col;
       
       do {
    	  System.out.print("Enter your preferred row and column: ");
    	  row = scan.nextInt();
    	  col = scan.nextInt();
       }
       while(!isValidMove(row,col));
       
       TicTacToe.placeMark(row,col,mark);
		
	}

}
