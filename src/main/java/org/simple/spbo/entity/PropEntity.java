package org.simple.spbo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 映射属性文件类
 * @author GeL
 *
 */
@Component
@ConfigurationProperties(prefix = "propEntity",locations = "classpath:config/propEntity.properties")
public class PropEntity {

	private String name;
	
	private String des;
	
	private String text;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "name:"+name+",text:"+text+",des"+des;
	}
	
	
}
