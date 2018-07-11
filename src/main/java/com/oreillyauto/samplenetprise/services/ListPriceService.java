package com.oreillyauto.samplenetprise.services;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oreillyauto.samplenetprise.dao.ListPriceRepository;
import com.oreillyauto.samplenetprise.domains.Itemrecord;

@Service
public class ListPriceService {
	
	private ListPriceRepository listPriceRepository;
	
	@Autowired
	public ListPriceService(ListPriceRepository listPriceRepository) {
		
		this.listPriceRepository = listPriceRepository;
	}

	public Iterable<Itemrecord> findAll() {
		// TODO Auto-generated method stub
		return listPriceRepository.findAll();
	}

	public Long save(@Valid Itemrecord item) {
		// TODO Auto-generated method stub
		return listPriceRepository.save(item);
	}

	public Itemrecord findById(long id) {
		// TODO Auto-generated method stub
		return listPriceRepository.findById(id);
	}

}
