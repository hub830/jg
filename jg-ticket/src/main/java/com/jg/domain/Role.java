package com.jg.domain;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.jg.constant.YesNo;

@Entity
public class Role {
	private long id;
	/** 角色名称 */
	private String name;
	/** 是否系统用户 */
	private YesNo issys;
	/** 描述 */
	private String description;

	private Set<String> permissions;
	
	private Set<Administrator> administrators;

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

	@Enumerated(EnumType.ORDINAL)
	@Column(length = 1, nullable = false)
	public YesNo getIssys() {
		return issys;
	}

	public void setIssys(YesNo issys) {
		this.issys = issys;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "role_permissions", joinColumns = @JoinColumn(name = "roleid"))
	@Column(name = "permissions")
	public Set<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<String> permissions) {
		this.permissions = permissions;
	}
	

	@ManyToMany(mappedBy = "roles", fetch=FetchType.LAZY)
	@OrderBy("id") @Fetch(FetchMode.SUBSELECT)
	@NotFound(action = NotFoundAction.IGNORE)
	public Set<Administrator> getAdministrators() {
		return administrators;
	}

	public void setAdministrators(Set<Administrator> administrators) {
		this.administrators = administrators;
	}

}
