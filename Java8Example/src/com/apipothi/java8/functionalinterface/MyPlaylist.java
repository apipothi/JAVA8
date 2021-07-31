package com.apipothi.java8.functionalinterface;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA8
 * JAVA      : 1.8
 * Program   : 2. What is “Functional Interface" in JAVA 8
*/

/*This is the Functional Interface*/

@FunctionalInterface
public interface MyPlaylist {

	public void getMyPlaylist();

	// public void getMynewPlaylist();

	default void getMyJavaPlaylist() {

	}

	static void getMyJava9Playlist() {

	}

}
