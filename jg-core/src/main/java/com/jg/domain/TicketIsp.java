package com.jg.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TicketIsp {

	private long id;
	private String name;
	private String remark;

	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(length = 256)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(length = 256)
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
