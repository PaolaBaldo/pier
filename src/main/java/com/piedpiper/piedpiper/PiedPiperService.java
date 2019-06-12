package com.piedpiper.piedpiper;

import org.springframework.stereotype.Service;

@Service
public class PiedPiperService {
	
	

	private static final CharSequence PIED_PIPER = "P";

	public ReturnEntity getDeafRats(String inputString) {
		int length = inputString.length();
		int index = 0;
		if (inputString.contains(PIED_PIPER)) {
			index = inputString.indexOf("P");
		}
		String part2 = inputString.substring(index + 1, length);

		String part1 = inputString.substring(0, index);

		int count = countDeafRats(part1, "~~") + countDeafRats(part2, "~~");
		return new ReturnEntity(inputString, count);
	}
	
	public void test() {
		
	}
	
	  public int countDeafRats(String str, String findStr){
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
	    }

}
