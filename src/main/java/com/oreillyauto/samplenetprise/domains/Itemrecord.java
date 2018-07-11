package com.oreillyauto.samplenetprise.domains;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Itemrecord {
	
	@NotNull
	private Long id;
	
	@NotNull
	private String storeNumber;
	
	@NotBlank (message="Line cannot be blank")
	private String line;
	
	@NotBlank(message="Item cannot be blank")
	private String item;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	public String getStoreNumber() {
		return storeNumber;
	}


	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}


	public String getLine() {
		return line;
	}


	public void setLine(String line) {
		this.line = line;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}

	
	
	
	
	public Itemrecord() {
		super();
	}

	
	@Override
	public String toString() {
		return "ItemPrice {"+
					"id='" + id+'\'' +
					 "line='" + line+'\'' + 
					 ", item=" + item +'\''+ 
					 ", storeNumber=" + storeNumber +'\''+
					 '}';
	}
	
	@Override
	public int hashCode() {

		return new HashCodeBuilder(17, 37)
				.append(id)
				.append(line)
				.append(item)
				.append(storeNumber)
				.toHashCode();
				
		}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass()){
			return false;
		}
		Itemrecord item1 = (Itemrecord) o;
		
		return new EqualsBuilder()
				.append(id ,item1.id)
				.append(line ,item1.line)
				.append(item, item1.item)
				.append(storeNumber, item1.storeNumber)
				.isEquals();
		}
	
	public int compareTo(Itemrecord other) {
		// TODO Auto-generated method stub
		
		if(this==other) {

			return 0;
		}	
	
		if(other==null) {
			return  1;
		}

		return new CompareToBuilder()
				.append(id ,other.id)
				.append(line ,other.line)
				.append(item, other.item)
				.append(storeNumber, other.storeNumber)
				.toComparison();
}

	
		
}
