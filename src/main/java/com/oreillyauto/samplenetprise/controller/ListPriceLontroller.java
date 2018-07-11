package com.oreillyauto.samplenetprise.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.oreillyauto.samplenetprise.domains.Itemrecord;
import com.oreillyauto.samplenetprise.exception.ItemNotFoundException;
import com.oreillyauto.samplenetprise.services.ListPriceService;


@RestController
@RequestMapping("/api/itemprice")
 class ListPriceLontroller {
	
	
	private ListPriceService listPriceService;
	@Autowired
	public ListPriceLontroller(ListPriceService listPriceService) {
			this.listPriceService = listPriceService;
	}
	
	
	 @GetMapping
	    public Iterable<Itemrecord> findAll() {
	        return listPriceService.findAll();
	    }
	
	 
	    @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public Long save(@Valid @RequestBody Itemrecord itemrecord) {
	    	
	   	   return listPriceService.save(itemrecord);
	         
	    }
	
	

}
