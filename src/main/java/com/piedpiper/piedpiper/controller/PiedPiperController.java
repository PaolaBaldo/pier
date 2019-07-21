package com.piedpiper.piedpiper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.piedpiper.piedpiper.model.DeafRatsEntity;
import com.piedpiper.piedpiper.service.PiedPiperService;

@RestController
public class PiedPiperController {
	
	
	private final  PiedPiperService service;
	
    public PiedPiperController(PiedPiperService service) {
        this.service = service;
    }
		
	@RequestMapping(value = "/deafrats/getdeafrats", method = RequestMethod.GET)
	public @ResponseBody DeafRatsEntity getDeafRats(@RequestParam String inputString) {
		
    
		DeafRatsEntity deafRatsEntity = service.getDeafRats(inputString);
		return deafRatsEntity;
   	
	}
	
	

}
