package net.simpleframework.module.tag;

import net.simpleframework.ado.bean.AbstractIdBean;
import net.simpleframework.ado.db.DbEntityTable;
import net.simpleframework.common.ID;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885) https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
public class TagR extends AbstractIdBean {
	/* 标签id */
	private ID tagId;

	/* 内容id */
	private ID contentId;

	public ID getTagId() {
		return tagId;
	}

	public void setTagId(final ID tagId) {
		this.tagId = tagId;
	}

	public ID getContentId() {
		return contentId;
	}

	public void setContentId(final ID contentId) {
		this.contentId = contentId;
	}

	public static final DbEntityTable TBL = new DbEntityTable(TagR.class, "sf_tagr");

	private static final long serialVersionUID = 4041558017029897229L;
}
