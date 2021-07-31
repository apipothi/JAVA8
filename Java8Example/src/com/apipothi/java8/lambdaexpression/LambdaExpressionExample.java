package com.apipothi.java8.lambdaexpression;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA8
 * JAVA      : 1.8
 * Program   : 3. What is “Lambda Expression" in JAVA 8
*/
public class LambdaExpressionExample {

	public static void main(String[] args) {

		String mychennal = "API POTHI";
		String myPlaylistName = "JAVA 8 ";
		int count = 9;

		MyPlaylist myPlaylist =  playlistname -> {
			System.out.println("This is " + playlistname +"Play List from API POTHI");
			return playlistname;
		};
		
		/*MyPlaylist myPlaylist = (String playlistname) -> {
			System.out.println("This is " + playlistname +"Play List from API POTHI");
			return playlistname;
		};*/

		myPlaylist.getPlaylistName(myPlaylistName);
	}

}
