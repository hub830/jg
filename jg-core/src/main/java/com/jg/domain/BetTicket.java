package com.jg.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.jg.constant.Ticket_Status;
import com.jg.constant.YesNo;

@Entity
public class BetTicket {

	private long id;
	private long serialNumber;
	private long userId;
	private long gameId;
	private long ticketId;
	private String issue;
	private int bs;
	private int zs;
	private String playtype;
	private String bettype;
	private String code;
	private Ticket_Status status;
	private YesNo ishit;
	private int betmoney;
	private int hitmoney;
	private Date createtime;
	private Date endtime;
	private String ticketIsp;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(length = 16, nullable = false)
	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Column(length = 16, nullable = false)
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Column(length = 16, nullable = false)
	public long getGameId() {
		return gameId;
	}

	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	@Column(length = 16, nullable = false)
	public long getTicketId() {
		return ticketId;
	}

	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}

	@Column(length = 16, nullable = false)
	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	@Column(length = 6, nullable = false)
	public int getBs() {
		return bs;
	}

	public void setBs(int bs) {
		this.bs = bs;
	}

	@Column(length = 6, nullable = false)
	public int getZs() {
		return zs;
	}

	public void setZs(int zs) {
		this.zs = zs;
	}

	@Column(length = 8, nullable = false)
	public String getPlaytype() {
		return playtype;
	}

	public void setPlaytype(String playtype) {
		this.playtype = playtype;
	}

	@Column(length = 8, nullable = false)
	public String getBettype() {
		return bettype;
	}

	public void setBettype(String bettype) {
		this.bettype = bettype;
	}

	@Lob
	@Column(nullable = false)
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public Ticket_Status getStatus() {
		return status;
	}

	public void setStatus(Ticket_Status status) {
		this.status = status;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public YesNo getIshit() {
		return ishit;
	}

	public void setIshit(YesNo ishit) {
		this.ishit = ishit;
	}

	@Column(length = 12, nullable = false)
	public int getBetmoney() {
		return betmoney;
	}

	public void setBetmoney(int betmoney) {
		this.betmoney = betmoney;
	}

	@Column(length = 12, nullable = false)
	public int getHitmoney() {
		return hitmoney;
	}

	public void setHitmoney(int hitmoney) {
		this.hitmoney = hitmoney;
	}

	@Temporal(TemporalType.DATE)
	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Temporal(TemporalType.DATE)
	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	@Column(length = 16, nullable = false)
	public String getTicketIsp() {
		return ticketIsp;
	}

	public void setTicketIsp(String ticketIsp) {
		this.ticketIsp = ticketIsp;
	}

}
