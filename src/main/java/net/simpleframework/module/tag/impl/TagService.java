package net.simpleframework.module.tag.impl;

import net.simpleframework.ado.IParamsValue;
import net.simpleframework.ado.db.IDbEntityManager;
import net.simpleframework.ado.db.common.ExpressionValue;
import net.simpleframework.common.ID;
import net.simpleframework.common.object.ObjectUtils;
import net.simpleframework.ctx.service.ado.db.AbstractDbBeanService;
import net.simpleframework.module.tag.ITagContextAware;
import net.simpleframework.module.tag.ITagService;
import net.simpleframework.module.tag.Tag;
import net.simpleframework.module.tag.TagR;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public class TagService extends AbstractDbBeanService<Tag> implements ITagService, ITagContextAware {

	@Override
	public void updateTag(final int tagMark, final ID contentId, final String text,
			final String description) {
		Tag tag = getBean("tagText=?", text);
		final boolean insert = tag == null;
		if (insert) {
			tag = createBean();
			tag.setTagMark(tagMark);
			tag.setTagText(text);
			tag.setDescription(description);
			insert(tag);
		} else {
			if (!ObjectUtils.objectEquals(description, tag.getDescription())) {
				tag.setDescription(description);
				update(tag);
			}
		}
		TagR r = getEntityManager(TagR.class).queryForBean(
				new ExpressionValue("contentId=? and tagId=?", contentId, tag.getId()));
		if (r == null) {
			r = new TagR();
			r.setContentId(contentId);
			r.setTagId(tag.getId());
			getEntityManager(TagR.class).insert(r);
		}
	}

	@Override
	public void onInit() throws Exception {

		addListener(new DbEntityAdapterEx() {
			@Override
			public void onBeforeDelete(final IDbEntityManager<?> manager,
					final IParamsValue paramsValue) {
				super.onBeforeDelete(manager, paramsValue);
				for (final Tag tag : coll(paramsValue)) {
					getEntityManager(TagR.class).delete(new ExpressionValue("tagId=?", tag.getId()));
				}
			}
		});
	}
}
