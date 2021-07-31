package com.apipothi.java8.lambdacollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA8
 * JAVA      : 1.8
 * Program   : 5.Lambda Expression uses over Collection API's in JAVA 8
*/
public class LambdaWithCollectionExample {
	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(10);
		l.add(9);
		l.add(11);
		l.add(19);
		l.add(20);
		
		System.out.println("Before Sorting" + l);
		Collections.sort(l);
		System.out.println("After Sorting" + l);
		
		
		
		List<String> countryNames = new ArrayList<String>();
	      countryNames.add("India");
	      countryNames.add("England");
	      countryNames.add("Australia");
	      countryNames.add("Newzealand");
	      countryNames.add("South Africa");

	      // Iterating country names through forEach using Lambda Expression
	      countryNames.forEach(name -> System.out.println(name));
	      
	      Set<String> playlistNames = new HashSet<String>();
	      playlistNames.add("JAVA8");
	      playlistNames.add("JAVA9");
	      playlistNames.add("Spring Boot");
	      playlistNames.add("Microservice");
	      playlistNames.add("Design Patterns");

	      // Iterating country names through forEach using Lambda Expression
	      playlistNames.forEach(name -> System.out.println(name));
	      
	      
	      Map<String, Integer> ranks = new HashMap<String, Integer>();
	      ranks.put("India", 1);
	      ranks.put("Australia", 2);
	      ranks.put("England", 3);
	      ranks.put("Newzealand", 4);
	      ranks.put("South Africa", 5);
	      // Iterating through      
	      //forEach using Lambda Expression
	      ranks.forEach((key,value) -> System.out.println("Team : " + key + ", Rank : " + value));
	   }
	
	}

