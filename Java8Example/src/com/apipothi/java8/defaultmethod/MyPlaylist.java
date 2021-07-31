package com.apipothi.java8.defaultmethod;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA8
 * JAVA      : 1.8
 * Program   : 1. What is "Default and Static Method in Interface" in JAVA8.
*/

public interface MyPlaylist {

	public void getPlaylistInfo();

	public void getPlaylistName();

	default void getNewPlaylistName() {

		System.out.println("MyPlaylist-My New Implementation");
	}

	static void getNewPlaylistId() {

		System.out.println("MyPlaylist-getNewPlaylistId");
	}
}
