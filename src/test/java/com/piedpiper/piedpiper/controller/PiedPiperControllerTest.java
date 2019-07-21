package com.piedpiper.piedpiper.controller;



import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.piedpiper.piedpiper.model.DeafRatsEntity;
import com.piedpiper.piedpiper.service.PiedPiperService;

@RunWith(SpringRunner.class)
@WebMvcTest(PiedPiperController.class)
public class PiedPiperControllerTest {
	
	@Autowired
    MockMvc mockMvc;

    @MockBean
    private PiedPiperService service;
    
   
    
    @Test
    public void testGetDeafRats() throws Exception {
    	DeafRatsEntity deafRatsEntity = new DeafRatsEntity("PO~O~~OO~", 1);
        when(service.getDeafRats("PO~O~~OO~")).thenReturn(deafRatsEntity);
        this.mockMvc.perform(get("/deafrats/getdeafrats?inputString=PO~O~~OO~")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.deafRatsQuantity", is(1)));
    }

}
