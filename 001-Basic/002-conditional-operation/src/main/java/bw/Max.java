package com.bw;

/**
 * Created by BAtmAN on 29.01.17.
 */

public class Max {
	
	public int max (int first, int second) {
		return (first > second) ? first : second;
	}
	
	public int max (int first, int second, int third) {
		return max(max(first, second), third);
		
	}
}