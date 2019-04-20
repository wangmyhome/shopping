package com.shop.index.action;


import com.opensymphony.xwork2.ActionSupport;


/**
 * 首页访问Action
 * @author 11312
 *
 */
public class IndexAction extends ActionSupport {

	/**
	 * 执行的访问首页的方法:
	 */
	public String execute(){
		return "index";
	}
}
