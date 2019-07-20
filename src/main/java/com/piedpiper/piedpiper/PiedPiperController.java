package com.piedpiper.piedpiper;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PiedPiperController {
	
	
	private final  PiedPiperService service;
	
    public PiedPiperController(PiedPiperService service) {
        this.service = service;
    }
		
	@RequestMapping(value = "/deafrats/getdeafrats", method = RequestMethod.GET)
	public @ResponseBody ReturnEntity getDeafRats(@RequestParam String inputString) {
		
        //String test = "~O~O~O~OP";
        //String inputString = "PO~O~~OO~"; ok
        //String test = "~OO~~O~OPO~~OO~";
		ReturnEntity returnEntity = service.getDeafRats(inputString);
		return returnEntity;
   	
	}
	
	

}
