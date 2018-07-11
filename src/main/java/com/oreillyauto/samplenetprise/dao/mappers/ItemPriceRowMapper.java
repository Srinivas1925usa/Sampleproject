/*package com.oreillyauto.samplenetprise.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.oreillyauto.samplenetprise.domains.ItemPrice;

public class ItemPriceRowMapper implements RowMapper < ItemPrice >{

	@Override
	public ItemPrice mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ItemPrice itemPrice = new ItemPrice();
		
			itemPrice.setId(rs.getLong("id"));
			itemPrice.setItem(rs.getString("item"));
			itemPrice.setLine(rs.getString("line"));
			itemPrice.setStoreNumber(rs.getString("storeNumber"));			
	        
	        return itemPrice;
	    }

	public List < ItemPrice > findAll() {
	    return jdbcTemplate.query("select * from student", new ItemPriceRowMapper());
	}
	

}
*/