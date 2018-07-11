package com.oreillyauto.samplenetprise.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.oreillyauto.samplenetprise.domains.Itemrecord;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.jdbc.core.RowMapper;


@Repository
public class ListPriceRepository {

	
	@Autowired
    JdbcTemplate jdbcTemplate;


	class ItemPriceRowMapper implements RowMapper < Itemrecord >{

		@Override
		public Itemrecord mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Itemrecord itemrecord = new Itemrecord();
			
				itemrecord.setId(rs.getLong("id"));
				itemrecord.setItem(rs.getString("item"));
				itemrecord.setLine(rs.getString("line"));
				itemrecord.setStoreNumber(rs.getString("storeNumber"));			
		        
		        return itemrecord;
		    }

	}


	public Iterable<Itemrecord> findAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from Item", new ItemPriceRowMapper());
		
	}
	
	public Long save(Itemrecord item) {
		// TODO Auto-generated method stub
		return (long) jdbcTemplate.update("insert into Item (id, item, line, storeNumber) " + "values(?,  ?, ?,?)",
				new Object[] { item.getId(),item.getItem(),item.getLine(), item.getStoreNumber() });
	}
	
	public Itemrecord findById(long id) {
	    return jdbcTemplate.queryForObject("select * from Item where id=?", new Object[] {
	          id
	        },
	        new BeanPropertyRowMapper < Itemrecord > (Itemrecord.class));
	}
}