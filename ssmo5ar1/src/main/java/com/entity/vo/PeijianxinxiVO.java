package com.entity.vo;

import com.entity.PeijianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 配件信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-27 14:05:12
 */
public class PeijianxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 价格
	 */
	
	private String jiage;
		
	/**
	 * 配件介绍
	 */
	
	private String peijianjieshao;
		
	/**
	 * 配件详情
	 */
	
	private String peijianxiangqing;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(String jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public String getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：配件介绍
	 */
	 
	public void setPeijianjieshao(String peijianjieshao) {
		this.peijianjieshao = peijianjieshao;
	}
	
	/**
	 * 获取：配件介绍
	 */
	public String getPeijianjieshao() {
		return peijianjieshao;
	}
				
	
	/**
	 * 设置：配件详情
	 */
	 
	public void setPeijianxiangqing(String peijianxiangqing) {
		this.peijianxiangqing = peijianxiangqing;
	}
	
	/**
	 * 获取：配件详情
	 */
	public String getPeijianxiangqing() {
		return peijianxiangqing;
	}
			
}
