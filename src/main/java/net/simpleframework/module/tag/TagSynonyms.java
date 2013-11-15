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
public class TagSynonyms extends AbstractIdBean {
	/* 具有同义的源标签id */
	private ID tagFrom;

	/* 具有同义的目标标签id */
	private ID tagTo;

	/* 描述 */
	private String description;

	public ID getTagFrom() {
		return tagFrom;
	}

	public void setTagFrom(final ID tagFrom) {
		this.tagFrom = tagFrom;
	}

	public ID getTagTo() {
		return tagTo;
	}

	public void setTagTo(final ID tagTo) {
		this.tagTo = tagTo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public static final DbEntityTable TBL = new DbEntityTable(TagSynonyms.class, "sf_tag_synonyms");

	private static final long serialVersionUID = -4344381418173608712L;
}
