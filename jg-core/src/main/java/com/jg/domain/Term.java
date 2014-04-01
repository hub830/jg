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

import com.jg.constant.Term_ResultStatus;
import com.jg.constant.Term_SaleStatus;
import com.jg.constant.Term_SettleStatus;
import com.jg.constant.YesNo;

@Entity
public class Term {

	private long id;

	private String gameId;
	private String issue;
	private int issueNo;
	private Date begintime;
	private Date endtime;
	private Term_SaleStatus salestatus;
	private Term_SettleStatus settlestatus;
	private YesNo block;
	private String result;
	private Term_ResultStatus resultstatus;
	private String bonuspond;
	private String ticketIsp;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(length = 12, nullable = false)
	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	@Column(length = 16, nullable = false)
	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	@Column(length = 8, nullable = false)
	public int getIssueNo() {
		return issueNo;
	}

	public void setIssueNo(int issueNo) {
		this.issueNo = issueNo;
	}

	@Temporal(TemporalType.DATE)
	public Date getBegintime() {
		return begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	@Temporal(TemporalType.DATE)
	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 2, nullable = false)
	public Term_SaleStatus getSalestatus() {
		return salestatus;
	}

	public void setSalestatus(Term_SaleStatus salestatus) {
		this.salestatus = salestatus;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public Term_SettleStatus getSettlestatus() {
		return settlestatus;
	}

	public void setSettlestatus(Term_SettleStatus settlestatus) {
		this.settlestatus = settlestatus;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public YesNo getBlock() {
		return block;
	}

	public void setBlock(YesNo block) {
		this.block = block;
	}

	@Column(length = 64, nullable = false)
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public Term_ResultStatus getResultstatus() {
		return resultstatus;
	}

	public void setResultstatus(Term_ResultStatus resultstatus) {
		this.resultstatus = resultstatus;
	}

	@Lob
	public String getBonuspond() {
		return bonuspond;
	}

	public void setBonuspond(String bonuspond) {
		this.bonuspond = bonuspond;
	}

	@Column(length = 16, nullable = false)
	public String getTicketIsp() {
		return ticketIsp;
	}

	public void setTicketIsp(String ticketIsp) {
		this.ticketIsp = ticketIsp;
	}

}
