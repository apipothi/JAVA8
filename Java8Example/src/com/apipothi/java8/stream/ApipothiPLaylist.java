package com.apipothi.java8.stream;

public class ApipothiPLaylist implements Comparable<ApipothiPLaylist>{

	int playlistid;
	int playlistVideo;
	String playlistname;

	public ApipothiPLaylist() {
	}

	public ApipothiPLaylist(int playlistid, int playlistVideo, String playlistname) {
		super();
		this.playlistid = playlistid;
		this.playlistVideo = playlistVideo;
		this.playlistname = playlistname;
	}

	public int getPlaylistid() {
		return playlistid;
	}

	public void setPlaylistid(int playlistid) {
		this.playlistid = playlistid;
	}

	public int getPlaylistVideo() {
		return playlistVideo;
	}

	public void setPlaylistVideo(int playlistVideo) {
		this.playlistVideo = playlistVideo;
	}

	public String getPlaylistname() {
		return playlistname;
	}

	public void setPlaylistname(String playlistname) {
		this.playlistname = playlistname;
	}

	@Override
	public String toString() {
		return "ApipothiPLaylist [playlistid=" + playlistid + ", playlistVideo=" + playlistVideo + ", playlistname="
				+ playlistname + "]";
	}

	@Override
	public int compareTo(ApipothiPLaylist o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
