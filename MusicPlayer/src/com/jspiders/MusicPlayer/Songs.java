package com.jspiders.MusicPlayer;

public class Songs {
   private int id;
   private String songname;
   private String singername;
   private String moviename;
   private String composer;
   private String lyrics;
   private double length;
   public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSongname() {
	return songname;
}
public void setSongname(String songname) {
	this.songname = songname;
}
public String getSingername() {
	return singername;
}
public void setSingername(String singername) {
	this.singername = singername;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public String getComposer() {
	return composer;
}
public void setComposer(String composer) {
	this.composer = composer;
}
public String getLyrics() {
	return lyrics;
}
public void setLyrics(String lyrics) {
	this.lyrics = lyrics;
}
public double  getLength() {
	return length;
}
public void setLength(double  length) {
	this.length = length;
}
@Override
public String toString() {
	return "Songs [id=" + id + ", songname=" + songname + ", singername=" + singername + ", moviename=" + moviename
			+ ", composer=" + composer + ", lyrics=" + lyrics + ", length=" + length + "]";
}


}
