package com.jg.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.jg.constant.GameType;
import com.jg.constant.YesNo;

@Entity
public class Games {

	private String id;

	private String name;
	private YesNo block;
	private String config;
	private String description;
	private String remark;
	private GameType type;
	private String ticketIsp;

	@Id
	@Column(length = 12, nullable = false)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(length = 32, nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public YesNo getBlock() {
		return block;
	}

	public void setBlock(YesNo block) {
		this.block = block;
	}

	@Column(length = 256)
	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	@Column(length = 256)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(length = 256)
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public GameType getType() {
		return type;
	}

	public void setType(GameType type) {
		this.type = type;
	}

	@Column(length = 12, nullable = false)
	public String getTicketIsp() {
		return ticketIsp;
	}

	public void setTicketIsp(String ticketIsp) {
		this.ticketIsp = ticketIsp;
	}

}
