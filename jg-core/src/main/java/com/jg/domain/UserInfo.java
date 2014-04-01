package com.jg.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class UserInfo {

	private long id;
	private Date lasttime;
	private String lastdevice;
	private String lastchannel;
	private String lastip;
	private String cardno;
	private String realname;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	public Date getLasttime() {
		return lasttime;
	}

	public void setLasttime(Date lasttime) {
		this.lasttime = lasttime;
	}

	@Column(length = 32, nullable = false)
	public String getLastdevice() {
		return lastdevice;
	}

	public void setLastdevice(String lastdevice) {
		this.lastdevice = lastdevice;
	}

	@Column(length = 32, nullable = false)
	public String getLastchannel() {
		return lastchannel;
	}

	public void setLastchannel(String lastchannel) {
		this.lastchannel = lastchannel;
	}

	@Column(length = 32, nullable = false)
	public String getLastip() {
		return lastip;
	}

	public void setLastip(String lastip) {
		this.lastip = lastip;
	}

	@Column(length = 32, nullable = false)
	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	@Column(length = 32, nullable = false)
	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

}
