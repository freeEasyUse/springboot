package org.simple.spbo.shiro.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * 系统角色类
 * @author GeL
 *
 */
@Entity
public class SysRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;	//id
	
	private String role;	//角色
	
	private String description;	//描述
	
	private Boolean available = false;	//是否可用
	
	/**
	 * 角色和权限关联 通过中间表
	 */
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="sys_role_permission",joinColumns={@JoinColumn(name="roleId")},inverseJoinColumns={@JoinColumn(name="permissionId")})
	private List<SysPermission> permissions;
	
	/**
	 * 用户角色关系  通过中间表关联
	 */
    @ManyToMany
    @JoinTable(name="sys_user_role",joinColumns={@JoinColumn(name="roleId")},inverseJoinColumns={@JoinColumn(name="uid")})
	private List<UserInfo> userInfos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public List<SysPermission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<SysPermission> permissions) {
		this.permissions = permissions;
	}

	public List<UserInfo> getUserInfos() {
		return userInfos;
	}

	public void setUserInfos(List<UserInfo> userInfos) {
		this.userInfos = userInfos;
	}
	
    @Override
    public String toString() {
       return "SysRole [id=" + id + ", role=" + role + ", description=" + description + ", available=" + available
              + ", permissions=" + permissions + "]";
    }
	
}
