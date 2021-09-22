package com.src;

import java.util.ArrayList;
import java.util.LinkedList;

public class Albums {
private String name;
private String artist;
private ArrayList<Song> songs;
public Albums(String title, String artist, ArrayList<Song> songs) {
	super();
	this.name = title;
	this.artist = artist;
	this.songs = new ArrayList<Song>();
}
public boolean addSong(String name,double duration) {
	if(findSong(name)==null) {
		this.songs.add(new Song(name,duration));
		return true;
	}
	return false;
}
private Song findSong(String title2) {
	// TODO Auto-generated method stub
	for(Song song:this.songs) {
		if(song.getTitle().equals(title2)) {
			return song;
		}
	}
	return null;
}
public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
    int index = trackNumber -1;
    if((trackNumber >0) && (index <= this.songs.size())) {
        playList.add(this.songs.get(index));
        return true;
    }
    System.out.println("This album does not have a track " + trackNumber);
    return false;
}
public boolean addToPlayList(String title, LinkedList<Song> playList) {
    Song checkedSong = findSong(title);
    if(checkedSong != null) {
        playList.add(checkedSong);
        return true;
    }
    System.out.println("The song " + title + " is not in this album");
    return false;
}
private class SongList{
	
}
}
