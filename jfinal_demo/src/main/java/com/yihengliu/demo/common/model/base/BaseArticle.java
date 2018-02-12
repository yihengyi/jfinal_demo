package com.yihengliu.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseArticle<M extends BaseArticle<M>> extends Model<M> implements IBean {

	public M setAid(java.lang.Integer aid) {
		set("aid", aid);
		return (M)this;
	}
	
	public java.lang.Integer getAid() {
		return getInt("aid");
	}

	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}
	
	public java.lang.String getContent() {
		return getStr("content");
	}

	public M setUid(java.lang.Integer uid) {
		set("uid", uid);
		return (M)this;
	}
	
	public java.lang.Integer getUid() {
		return getInt("uid");
	}

}
