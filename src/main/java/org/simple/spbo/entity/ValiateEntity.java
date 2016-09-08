package org.simple.spbo.entity;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 验证信息entity
 * @author GeL
 *
 */
public class ValiateEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long id;
	
	@NotEmpty(message="名字不能为空")
	private String name;

	
	@NotEmpty(message="密码不能为空")
	@Size(min=6,message="密码长度不能小于6")
	private String password;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
}
