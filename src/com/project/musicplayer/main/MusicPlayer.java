package com.project.musicplayer.main;

import java.util.Scanner;
import com.project.musicplayer.song.SongDriver;

public class MusicPlayer extends SongDriver {
	
	public void home() {
		Scanner s = new Scanner(System.in);
		SongDriver driver = new MusicPlayer();
		MusicPlayer musicPlayer  = (MusicPlayer) driver;
		
		boolean loop = true;
		while(loop) {
			System.out.println("************** WELCOME ***************** \n 1. Play \n 2. Library  \n 3. Exit ");
			int input = s.nextInt();
			switch(input) {
			case 1: {
				musicPlayer.getSong();
				break;
			}
			case 2:{
				boolean loop1 = true;
				while(loop1) {
					System.out.println(" ***************** LIBRARY******************  \n 1.Create Playlist \n 2. Add Song \n 3. Go Back");
				int input1 = s.nextInt();
				switch(input1) {
				    case 1: musicPlayer.makePlayList();
				    break;
				    
					case 2: musicPlayer.addSong();
					break;
					
					case 3: 
						{
							System.out.println("Thank You ##### Exiting Music Player... ");
							loop1 = false;
						}
					break;
					}
				}
				
				break;
			}
			case 3:{
				loop = false; //exit
				break;
			}
			}
		}
	}
public static void main(String[] args) {
	MusicPlayer homePage = new MusicPlayer();
		homePage.home();
		
	}
}
