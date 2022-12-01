package com.jspiders.MusicPlayer;

import java.util.Scanner;

public class Multiplayer {
    static SongOperation songOperation=new SongOperation();
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
		boolean condition=true;
		while(condition) {
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" Select 1 to Show All Songs \n Select 2 to Play All songs \n Select 3 to Add songs \n Select 4 to remove songs\n Select 5 to update songs \n Select 6 to show all details of songs \n Select 7 to Exit ");
			int choose=sc.nextInt();
			switch (choose) {
			case 1:
				songOperation.chooseSongToPlay();
				break;
			case 2:
				songOperation.playAllSongs();
				break;
				
			case 3:
				songOperation.addSong();
				break;
			case 4:
				songOperation.removeSong();
				break;
			case 5:
				songOperation.updateSong();
				break;
			case 6:
				songOperation.displaySong();
				break;
				
			case 7:
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
