package com.project.musicplayer.song;

import java.util.ArrayList;
import java.util.Scanner;

public class SongDriver {
	Scanner sc = new Scanner(System.in);
	public ArrayList<Song> library = new ArrayList<Song>();
	public ArrayList<Song> playList = new ArrayList<Song>();
	

public void addSong() {
	try {
		System.out.println("******************* ADD SONG ************************");
		boolean loop= true;
		while(loop) {
		System.out.println("* Enter Song id ");
		int id = sc.nextInt();
		System.out.println("* Enter Song Duration ");
		Double sDuration = sc.nextDouble();
		System.out.println("* Enter Song Name");
		String sName = sc.next();
		System.out.println("* Enter Singer Name");
		String singerName = sc.next();

		
		library.add(new Song(id,sName,sDuration,singerName));
		System.out.println("Song Added \n __________________");
		
		System.out.println(" 1. Go back \n 2. Add Next Song ");
		
		int input = sc.nextInt();
		if(input == 1){
			loop = false;
			System.out.println("Going Back \n ______________________________");
		}
	}
	}catch(Exception e) {
		System.out.println("Invalid input");
	}
	}
public void getSong() {
	if(playList.isEmpty()) {
		System.out.println("Opps !! No Song is avilable... Please add song first");
	}else {
		System.out.println("********************* PLAY *********************** \n Playing");
		for(int i=0;i<=playList.size()-1;i++)
		{
			System.out.println("Id : " + playList.get(i).getSongId()+ " : " + playList.get(i).getSongName() + "\nDuration : " + playList.get(i).getSongDuration() +"\nSinger : "+playList.get(i).getSingerName());
			System.out.println("_______________________________");
		}
		System.out.println(" 1. Go back ");
		int input = sc.nextInt();
		if(input == 1) {
			
		}
	}
		
}
public void makePlayList() {
	System.out.println("**************** CREATE PLAYLIST *****************");
	try{
		System.out.println("Select Id to Add Song into Playlist");
	
	boolean loop = true;
	while(loop) {
		for(int i=0;i<=library.size()-1;i++)
			{
				System.out.println(i +". "+ library.get(i).getSongName() );
			}
		int index = sc.nextInt();
		if(library.get(index) != null ) {
				playList.add(library.get(index));
			}
		System.out.println("Song added to Playlist");
		System.out.println(" 1. Add next \n 2. Go back");
		int input = sc.nextInt();
		if(input == 2) {
					loop = false;
				}
			}
	}
	catch (Exception e) {
		System.out.println("song not added");
	}
	
	
}

}
