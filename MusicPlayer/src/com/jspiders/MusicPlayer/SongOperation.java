package com.jspiders.MusicPlayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SongOperation {
      ArrayList<Songs>arrayList=new ArrayList<Songs>(); 
	  Scanner sc=new Scanner(System.in);
	  Songs song;
      public void chooseSongToPlay() {
		if (arrayList.isEmpty()) {
			System.out.println("Not Avialable Any Type of Songs......");
		}
		else {
			System.out.println("Select 1 to show all Songs \n Select 2 to Play All Song \n Select 3 to Play Random Song ");
		   int select =sc.nextInt() ;
			switch (select) {
			case 1:
				showAllSongs();
				System.out.println("Enter Your Id to play any one Song ");
				int ids=sc.nextInt();
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getId()==ids) {
						System.out.println("---------------------------------------------------------------");
						System.out.println(arrayList.get(i).getSongname()+" Song Is Now Playing \n");
					}
				}
				break;

            case 2:
				playAllSongs();
				break;
            case 3:
				int max=arrayList.size();
				int min=0;
				int random=(int) (Math.random()*(max-min+1)+min);
				System.out.println(arrayList.get(random).getSongname()+"is Now Playing.....");
				break;

			default:
				System.out.println(" Enter The Valid number ");
				break;
			}
		
		}
	
	}
	
	public void showAllSongs() {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getSongname());
		}
	}
	public void playAllSongs() {
	   System.out.println("This Is Your PlayList");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getSongname()+" Songs is now Ready to Playing");
		}
		
	}
	
	public void playRandomSong() {}
	public void addSong() {
		System.out.println("Enter The How Many Songs You Have To Add...");
		int songNumber=sc.nextInt();
		

		for (int i = 0; i <songNumber ; i++) {
			song=new Songs();
			System.out.println("Enter Song Id");
			song.setId(sc.nextInt());
			System.out.println("Enter Song Name");
			song.setSongname(sc.next());
            System.out.println("Enter Singer Name");
			song.setSingername(sc.next());
		    System.out.println("Enter Movie Name");
			song.setMoviename(sc.next());
			System.out.println("Enter Composer Name");
			song.setComposer(sc.next());
			System.out.println("Enter Lyrics Name");
			song.setLyrics(sc.next());
			System.out.println("Enter Length");
			song.setLength(sc.nextDouble());
			
			arrayList.add(song);
			
		} System.out.println(songNumber+"Successfully added");
		
	}
	public void removeSong(){
		showAllSongs();
		System.out.println(" Enter Song Id ....");
		int idss=sc.nextInt();
		
		for (int i = 0; i < arrayList.size(); i++) {
			if(arrayList.get(i).getId()==idss) {
				arrayList.remove(i);
				System.out.println("Song SuccessFully Removed");
			}
		}
	}
	public void updateSong() {
		showAllSongs();
		System.out.println(" Enter same song id here Which Song have to update");
		int ids=sc.nextInt();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getId()==ids) {
				System.out.println("Enter new Id");
				arrayList.get(i).setId(sc.nextInt());
				System.out.println("Enter new Song Name");
				arrayList.get(i).setSongname(sc.next());
				System.out.println("Enter new Singer Name");
				arrayList.get(i).setSingername(sc.next());
				System.out.println("Enter new movie Name");
				arrayList.get(i).setMoviename(sc.next());
				System.out.println("Enter new composer Name");
				arrayList.get(i).setComposer(sc.next());
				System.out.println("Enter new Lyricsis Name");
				arrayList.get(i).setLyrics(sc.next());
			}
			System.out.println("Song Updated Successfully");
		}
		
	}
	public void displaySong() {
		System.out.println(" This Is Your All Songs With All Details");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}
	}
	



