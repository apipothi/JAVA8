package com.apipothi.java8.defaultmethod;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA8
 * JAVA      : 1.8
 * Program   : 1. What is "Default and Static Method in Interface" in JAVA8.
*/

public interface Playlist {

	default void getNewPlaylistName() {

		System.out.println("Playlist-My New Implementation");
	}

	static void getNewPlaylistId() {

		System.out.println("Playlist-getNewPlaylistId");
	}

}
