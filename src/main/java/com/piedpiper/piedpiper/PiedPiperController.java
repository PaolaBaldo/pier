package com.piedpiper.piedpiper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PiedPiperController {
	
	@Autowired
	PiedPiperService piedPiperService;
		
	@RequestMapping(value = "/deafrats/getdeafrats", method = RequestMethod.GET)
	public @ResponseBody ReturnEntity getDeafRats(@RequestParam String inputString) {
		
        //String test = "~O~O~O~OP";
        //String inputString = "PO~O~~OO~"; ok
        //String test = "~OO~~O~OPO~~OO~";
		ReturnEntity returnEntity = piedPiperService.getDeafRats(inputString);
		return returnEntity;
   	
	}
	
	

}
