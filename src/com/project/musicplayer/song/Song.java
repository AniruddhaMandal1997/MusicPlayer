package com.project.musicplayer.song;

public class Song {
	private int songId;
	private String songName;
	private double songDuration;
	private String singerName;
	
	Song(int id){
		this.songId=id;
	}
	Song(int songId, String songName,double songDuration,String singerName){
		this.songId=songId;
		this.songName=songName;
		this.songDuration=songDuration;
		this.singerName=singerName;
	}
	
	//---------------
	public int getSongId() {
		return songId;
	}
	public void setSongId(int newId) {
		this.songId=newId;
	}
	//-----------------
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String newName) {
		this.songName=newName;
	}
	//-------------------
	public Double getSongDuration() {
		return songDuration;
	}
	public void setSongDuration(int newDuration) {
		this.songDuration=newDuration;
	}
	//------------------------
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String newSingerName) {
		this.singerName=newSingerName;
	}
	//--------------
	@Override
	public String toString() {
		return "SongId : " + songId+ "SongName : "+ songName + "Song Duration : " +songDuration+ "Singer name : "+singerName;
	}
	
	
}
