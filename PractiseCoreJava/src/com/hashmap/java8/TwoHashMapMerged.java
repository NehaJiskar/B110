package com.hashmap.java8;

import java.util.HashMap;

public class TwoHashMapMerged {
public static void main(String[] args) {
	HashMap<String,Integer> map1=new HashMap<>();
	map1.put("Maths", 52);
	map1.put("Science", 60);
	map1.put("History", 45);
	
	HashMap<String,Integer> map2=new HashMap<>();
	map2.put("Geography", 56);
	map2.put("Economics", 70);
	map2.put("Maths", 40);
	
	HashMap<String, Integer> map3=new HashMap<>(map1);
	map2.forEach((key,value) -> map3.merge(key,value,(v1,v2) -> v1+v2));
	System.out.println("Map1:"+map1);
	System.out.println("Map2:"+map2);
	System.out.println("Map3:"+map3);
	
	
	
}
}
