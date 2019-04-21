package com.shop.index.action;


import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.shop.category.pojo.Category;
import com.shop.category.service.CategoryService;


/**
 * 首页访问Action
 * @author 11312
 *
 */
public class IndexAction extends ActionSupport {

	// 注入一级分类的Service:
	private CategoryService categoryService;
	
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	/**
	 * 执行的访问首页的方法:
	 */
	public String execute(){
		// 查询所有一级分类集合
		List<Category> cList = categoryService.findAll();
		// 将一级分类存入到Session的范围:
		ActionContext.getContext().getSession().put("cList", cList);
		return "index";
	}
}
