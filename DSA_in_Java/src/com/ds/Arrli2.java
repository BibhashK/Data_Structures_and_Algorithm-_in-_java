package com.ds;
import java.io.*;
import java.util.*;
public class Arrli2 {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Integer> da = new ArrayList<Integer>();
		
		da.add(11);
		System.out.println("size: " + da.size() );
		da.add(12);
		System.out.println("size: " + da.size() );
		da.add(13);
		System.out.println("size: " + da.size() );
		da.add(14);
		System.out.println("size: " + da.size() );
		da.add(15);
		System.out.println("size: " + da.size() );
		
		System.out.println("element saved is : ");
	for(int i =0; i<da.size();i++){
		System.out.println(da.get(i));
	}
	}


	}


