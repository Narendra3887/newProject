package com.jspiders.jdbcmusic;

public class Song {
    private int id;
    private String songname;
    private String singername;
    private String moviename;
    private String composer;
    private String lyricsis;
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
	public String getLyricsis() {
		return lyricsis;
	}
	public void setLyricsis(String lyricsis) {
		this.lyricsis = lyricsis;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", songname=" + songname + ", singername=" + singername + ", moviename=" + moviename
				+ ", composer=" + composer + ", lyricsis=" + lyricsis + ", length=" + length + ", getId()=" + getId()
				+ ", getSongname()=" + getSongname() + ", getSingername()=" + getSingername() + ", getMoviename()="
				+ getMoviename() + ", getComposer()=" + getComposer() + ", getLyricsis()=" + getLyricsis()
				+ ", getLength()=" + getLength() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
    
}
