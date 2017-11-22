package com.search;

public class Dataset {
int [] data;
int NumberTry;
	public Dataset(int size) {
		data = new int[size];
		for(int i = 1;i<=size;i++)
			data[i-1] = i;
		NumberTry=0;
	}
	public int getsize(){
		return data.length;
	}
}
