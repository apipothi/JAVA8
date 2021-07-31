package com.apipothi.java8.lambdaexpression;

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

	/* Method with "no arguments", "void return type", "public access modifier" */
	//public void greetings();
	
	/* Method with "one arguments", "string return type", "public access modifier" */
	public String getPlaylistName(String playlistname);

	/* Method with "two arguments", "int return type", "public access modifier" */
	//public int getPlaylistCount(String chennalName, int Count);



}
