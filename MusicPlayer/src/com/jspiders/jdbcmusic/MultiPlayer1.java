package com.jspiders.jdbcmusic;

import java.util.Scanner;

public class MultiPlayer1 {
	static Jdbc jdbc=new Jdbc();
	 static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
    	boolean condition=true;
		while(condition) {
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" Select 1 to Show All Songs \n Select 2 to Play All songs \n Select 3 to Add songs \n Select 4 to remove songs\n Select 5 to Display All songs  \n Select 6 to Exit ");
			int choose=sc.nextInt();
			switch (choose) {
			case 1:
				jdbc.chooseSongToPlay();
				break;
			case 2:
				jdbc.playAllSongs();
				break;
				
			case 3:
				jdbc.addSong();
				break;
			case 4:
				jdbc.removeSong();
				break;
			case 5:
				jdbc.displaySong();
				break;
			
			case 6:
				System.out.println("Exiting");
				condition=false;
				break;
			default:
				System.out.println("Enter valid Number");
				break;
			}
		}
	}
}
