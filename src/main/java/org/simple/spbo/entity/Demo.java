package org.simple.spbo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * ����ʵ��
 * @author GeL
 *
 */
public class Demo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	private int id;
	
	private int age;

	private Date birthday;
	
	private List<String> likse;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}
	
	

	public List<String> getLikse() {
		return likse;
	}

	public void setLikse(List<String> likse) {
		this.likse = likse;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
