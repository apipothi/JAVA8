package com.apipothi.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Web		 : http://apipothi.com/
 * Play List : JAVA8
 * JAVA      : 1.8
 * TOPIC     : STREAM API
*/

public class StreamExample {

	public static void main(String[] args) {

		List<String> listOfString = new ArrayList<String>();
		listOfString.add("String Level-0");
		listOfString.add("Array Level-0");
		listOfString.add("DS SLL");
		listOfString.add("JAVA5");
		listOfString.add("Design Patterns");
		listOfString.add("JAVA9");
		listOfString.add("JAVA8");
		listOfString.add("Array Level-1");
		listOfString.add("Microservice");
		listOfString.add("Apache Kafka");
		System.out.println("List of String - " + listOfString);

		List<Integer> listOfdob = new ArrayList<Integer>();
		listOfdob.add(1990);
		listOfdob.add(1790);
		listOfdob.add(1890);
		listOfdob.add(1950);
		listOfdob.add(2940);
		listOfdob.add(1910);
		System.out.println("List Of DOB" + listOfdob);

		//
		
		System.out.println("START- Integer Stream");
		Stream<Integer>  intstream=Stream.of(1,2,3,4,5,6,7,8,9);
		intstream.forEach(abcd -> System.out.println(abcd));
		System.out.println("END- Intgeger Stream");
		

		System.out.println("START- STRING Stream");
		Stream<String>  stringstream=Stream.of("A","B","C","D","E");
		stringstream.forEach(abcd -> System.out.println(abcd));
		System.out.println("END- STRING Stream");

		System.out.println("START- Integer ARRAY Stream");
		
		Stream<Integer>  intstreamArray= Stream.of(new Integer[] {1,2,3,4,5,6,7,8});
		intstreamArray.forEach(a -> System.out.println(a));
		
		System.out.println("END- Integer ARRAY Stream");
		
		
		System.out.println("*************FILTER-START************");
		
		List<String> playlistwithfilter= listOfString
										.stream()
										.filter(l -> l.length()>2)
										.collect(Collectors.toList());
		System.out.println("List of Play list which size is more that two -"+"\n"+playlistwithfilter);
		
		//Find the list of EVEN DOB
		Set <Integer> evenDOB= listOfdob
			.stream()
			.filter(p -> p%2==0)
			.collect(Collectors.toSet());
		
		System.out.println("Even DOB- " +"\n"+evenDOB);
		
		//Get me the PLaylist name where video is more than 10
		Set<ApipothiPLaylist> playlistname=playlistInfo()
								.stream()
								.filter(p -> p.getPlaylistVideo() > 10)
								.collect(Collectors.toSet());
		
		System.out.println(playlistname);
		System.out.println("*************FILTER-END************");
		
		System.out.println("*************MAP- START*************");
	
			//i WANT ALL THE PLAYH LIST ENDING WITH "TUTORIALS"
		List<String> plylistwithtutoriaLS= listOfString.stream()
														.map(l -> l+" - TUTORIALS")
														.collect(Collectors.toList());
		System.out.println("pLASY LIST NAME ENDING WITH TUTORIALS"+"\n"+plylistwithtutoriaLS);
		
		
		//I want to increase the DOB with 1 Year
		Set<Integer> dobincrement=listOfdob.stream()
								.map( p -> p+1 )
								.collect(Collectors.toSet());
		System.out.println("increase the DOB with 1 Year"+"\n"+dobincrement);
		
		
		//Incremet all the video count by one
				List<Integer> incrementvideo=playlistInfo().stream()
						.map(p -> p.getPlaylistVideo()+1)
						.collect(Collectors.toList());
		System.out.println("Video Incremented by one - "+"\n"+incrementvideo);
		System.out.println("*************MAP- END*************");
		
		System.out.println("***************START-SORTED***************");
		
		Set<String> sortedlistOfString=listOfString.stream().sorted().collect(Collectors.toSet());
		System.out.println("Default Natural String Sorting"+"\n"+sortedlistOfString);
		
		List<Integer> sorftedlistOfdob=listOfdob.stream().sorted().collect(Collectors.toList());
		System.out.println("Default Natural Integer Sorting"+sorftedlistOfdob);
		
        Set<ApipothiPLaylist> sortedPlayhlistinfo=playlistInfo().stream().sorted().collect(Collectors.toSet());
		System.out.println(sortedPlayhlistinfo);
	  
		Set<String> customsortedlistOfString= listOfString.stream().sorted( (l1,l2) -> l1.compareTo(l2)).collect(Collectors.toSet());
		System.out.println("CUSTOM SORTING STRING - "+"\n"+customsortedlistOfString);
		
		Set<Integer> customsorftedlistOfdob=listOfdob.stream().sorted( (l1,l2) -> l1.compareTo(l2)).collect(Collectors.toSet());
		System.out.println("CUSTOM SORTING INTEGER - "+"\n"+customsorftedlistOfdob);
		
		List<ApipothiPLaylist> customplaylistnamesorting= playlistInfo().stream()
			.sorted( (l1,l2) -> l1.getPlaylistname().compareTo(l2.getPlaylistname()) )
			.collect(Collectors.toList());
		System.out.println("CUSTOM PLAY LIST SORTING"+"\n"+customplaylistnamesorting);
		
		System.out.println("***************END-SORTED***************");
		
		
		System.out.println("****************MIN-START****************");
		
		String minplayhlist= listOfString.stream().min( (l1,l2) -> l1.compareTo(l2)).get();
		System.out.println("MIN PLAYLIST "+"\n"+minplayhlist);
		
		
		ApipothiPLaylist minplaylist=playlistInfo().stream()
				 							.min( (l1,l2) -> l1.getPlaylistname().compareToIgnoreCase(l2.getPlaylistname()))
				 							.get();
		 System.out.println("MIN PLAYLIST NAME - "+" \n "+minplaylist);
		System.out.println("****************MIN-END****************");
		
		
		
		System.out.println("****************MAX-START****************");

		String maxplayhlist = listOfString.stream().max((l1, l2) -> l1.compareTo(l2)).get();
		System.out.println("MAX PLAYLIST " + "\n" + maxplayhlist);

		ApipothiPLaylist maxplaylist = playlistInfo().stream()
				.max((l1, l2) -> l1.getPlaylistname().compareToIgnoreCase(l2.getPlaylistname())).get();
		System.out.println("MAX PLAYLIST NAME - " + " \n " + maxplaylist);
		System.out.println("****************MAX-END****************");
		
		
		System.out.println("*********START-FOREACH***********");
		listOfString.stream().forEach(s-> System.out.println(s));

		playlistInfo().stream().forEach(s -> System.out.println(s));
		
		
		listOfString.stream().forEach( System.out :: println);
		playlistInfo().stream().forEach(System.out :: println);
		
		System.out.println("*********END-FOREACH***********");
		
		
		System.out.println("TOARRAY-START************");
		Object[] arrayString=listOfString.stream().toArray();
		System.out.println( Arrays.toString(arrayString));
		String[] stringarrayString=listOfString.stream().toArray( String[] :: new);
		System.out.println( Arrays.toString(stringarrayString));
		System.out.println("TOARRAY-END************");
		
		
		System.out.println("************COUNT-START************");
		System.out.println("COUNT oF PLAYLIST"+listOfString.stream().count() );
		System.out.println("COUNT oF dob"+listOfdob.stream().count() );
		System.out.println( "COUNTY OF PLAY LIST DATA "+playlistInfo().stream().count());
		
		//FILTER WITH COUNT of DOB which is grater then 1950
		long dobcount=listOfdob.stream().filter( l -> l>1950).count();
		System.out.println("DOB > 1950 - "+dobcount);
		System.out.println("************COUNT-END************");
		
		
		//HASH CODE
		
		int rawhashcode=listOfdob.hashCode();
		System.out.println("RAW DATA HASH CODE - "+rawhashcode);
		
		int streamhashcode=listOfdob.stream().hashCode();
		System.out.println("STREAM HASH CODE DATA- "+streamhashcode);
	
	}

	public static List<ApipothiPLaylist> playlistInfo() {

		List<ApipothiPLaylist> playlist = new ArrayList<ApipothiPLaylist>();

		ApipothiPLaylist c = new ApipothiPLaylist(1, 17, "String Level-0");
		ApipothiPLaylist arrayLevel0 = new ApipothiPLaylist(2, 25, "Array Level-0");
		ApipothiPLaylist dssll = new ApipothiPLaylist(3, 15, "DS SLL");
		ApipothiPLaylist java5 = new ApipothiPLaylist(4, 6, "JAVA5");
		ApipothiPLaylist dp = new ApipothiPLaylist(5, 6, "Design Patterns");
		ApipothiPLaylist java9 = new ApipothiPLaylist(6, 6, "JAVA9");
		ApipothiPLaylist java8 = new ApipothiPLaylist(7, 5, "JAVA8");
		ApipothiPLaylist arrayLevel = new ApipothiPLaylist(8, 11, "Array Level-1");
		ApipothiPLaylist microservice = new ApipothiPLaylist(9, 15, "Microservice");
		ApipothiPLaylist kafka = new ApipothiPLaylist(10, 10, "Apache Kafka");

		playlist.add(c);
		playlist.add(arrayLevel0);
		playlist.add(dssll);
		playlist.add(java5);
		playlist.add(dp);
		playlist.add(java9);
		playlist.add(java8);
		playlist.add(arrayLevel);
		playlist.add(microservice);
		playlist.add(kafka);

		return playlist;

	}

}
