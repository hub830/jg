package com.jg.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.jg.constant.YesNo;

@Entity
public class Users {
	
	private long id;
	private String name;
	private String nickname;
	private String email;
	private String mobile;
	private YesNo block;
	private String salt;
	private String key;
	private String password;
	private String password2;
	private Date createtime;
	private String channel;
	private Date registdate;
	private String iemi;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(length = 32, nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length = 32, nullable = false)
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(length = 32, nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(length = 32, nullable = false)
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public YesNo getBlock() {
		return block;
	}

	public void setBlock(YesNo block) {
		this.block = block;
	}

	@Column(length = 32, nullable = false)
	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	@Column(length = 32, nullable = false)
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Column(length = 64, nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(length = 64, nullable = false)
	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	@Temporal(TemporalType.DATE)
	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(length = 32, nullable = false)
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	@Temporal(TemporalType.DATE)
	public Date getRegistdate() {
		return registdate;
	}

	public void setRegistdate(Date registdate) {
		this.registdate = registdate;
	}

	@Column(length = 32, nullable = false)
	public String getIemi() {
		return iemi;
	}

	public void setIemi(String iemi) {
		this.iemi = iemi;
	}

}
