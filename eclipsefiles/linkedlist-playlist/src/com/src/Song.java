package com.src;

import java.util.ArrayList;

public class Song {

	private String title;
	private double duration;
	public Song(String name,double duration) {
		//super();
		this.title = name;
		this.duration = duration;
	}
	
	public String getTitle() {
		return title;
	}
	/*public double getDuration() {
	return duration;
	}*/
	@Override
	public String toString() {
		return this.title+": "+this.duration;
	}
	
}
