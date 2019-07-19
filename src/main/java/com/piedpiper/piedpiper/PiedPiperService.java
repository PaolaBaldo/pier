package com.piedpiper.piedpiper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class PiedPiperService {
	
	

	private static final CharSequence PIED_PIPER = "P";

	public ReturnEntity getDeafRats(String inputString) {
		int length = inputString.length();
		int index = 0;
		int count = 0;
		if (inputString.contains(PIED_PIPER)) {
			index = inputString.indexOf("P");
		}
		String part2 = inputString.substring(index + 1, length);

		String part1 = inputString.substring(0, index);
		
		count = count + countDeafRats(part1) + countDeafRats(part2);

		
		return new ReturnEntity(inputString, count);
	}
	
	private int countDeafRats(String part) {
		int deafs = 0;		
		char[] list= part.toCharArray();
		
		for(int i =0; i <list.length; i ++) {
			if(list[i] == '~' && list[i+1] == 'O') {
				deafs++;
			}
		}
	
		
		return deafs;
	}

	public void test() {
		
	}
	
	//encontrar string não funciona
	  /*public int countDeafRats(String str, String findStr){
	        int lastIndex = 0;
	        int count = 0;

	        while(lastIndex != -1){

	            lastIndex = str.indexOf(findStr,lastIndex);

	            if(lastIndex != -1){
	                count ++;
	                lastIndex += findStr.length();
	            }
	        }
	        return count;
	    }*/  

}
