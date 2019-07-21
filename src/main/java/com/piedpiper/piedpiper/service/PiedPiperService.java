package com.piedpiper.piedpiper.service;


import org.springframework.stereotype.Service;

import com.piedpiper.piedpiper.model.PiedPiperSides;
import com.piedpiper.piedpiper.model.DeafRatsEntity;

@Service
public class PiedPiperService {
	

	private static final String PIED_PIPER = "P";
	private static final char TAIL = '~';
	private static final char HEAD = 'O';

	public DeafRatsEntity getDeafRats(String inputString) {
		int inputLength = inputString.length();
		int piedPiperIndex = 0;
		int deafRatsCount = 0;
		piedPiperIndex = findPiedPiperIndex(inputString, piedPiperIndex);
		
		String leftSidePart = inputString.substring(piedPiperIndex + 1, inputLength);

		String rightSidePart = inputString.substring(0, piedPiperIndex);
		
		deafRatsCount = deafRatsCount + countDeafRats(rightSidePart, PiedPiperSides.RIGHT_SIDE) + countDeafRats(leftSidePart, PiedPiperSides.LEFT_SIDE);

		return new DeafRatsEntity(inputString, deafRatsCount);
	}

	private int findPiedPiperIndex(String inputString, int piedPiperIndex) {
		if (inputString.contains(PIED_PIPER)) {
			piedPiperIndex = inputString.indexOf(PIED_PIPER);
		}
		return piedPiperIndex;
	}
	
	private int countDeafRats(String part, PiedPiperSides piedPiperSide) {
		int deafs = 0;		
		char[] list= part.toCharArray();
		if(piedPiperSide.equals(PiedPiperSides.LEFT_SIDE)) {
			deafs = countDeafRatsLeftSidePart(deafs, list);
		}
		else {
			deafs = countDeafRatsRightSidePart(deafs, list);
		}
		return deafs;
	}

	private int countDeafRatsRightSidePart(int deafs, char[] list) {
		for(int i =0; i <list.length; i=i+2) {
			if(list[i] == HEAD && list[i+1] == TAIL) {
				deafs++;
			}
		}
		return deafs;
	}

	private int countDeafRatsLeftSidePart(int deafs, char[] list) {
		for(int i =0; i <list.length; i=i+2) {
			if(list[i] == TAIL && list[i+1] == HEAD) {
				deafs++;
			}
		}
		return deafs;
	}
	
	/*private int countDeafRatsRightSide(String part) {
		int deafs = 0;		
		char[] list= part.toCharArray();
		
		for(int i =0; i <list.length; i=i+2) {
			if(list[i] == HEAD && list[i+1] == TAIL) {
				deafs++;
			}
		}
		return deafs;
	}
	
	private int countDeafRatsLeftSide(String part) {
		int deafs = 0;		
		char[] list= part.toCharArray();
		
		for(int i =0; i <list.length; i=i+2) {
			if(list[i] == TAIL && list[i+1] == HEAD) {
				deafs++;
			}
		}
		return deafs;
	}*/

  

}
