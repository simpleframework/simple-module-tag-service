package net.simpleframework.module.tag;

import net.simpleframework.common.ID;
import net.simpleframework.ctx.service.ado.db.IDbBeanService;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public interface ITagService extends IDbBeanService<Tag> {

	/**
	 * 更新tag
	 * 
	 * @param tagMark
	 * @param contentId
	 * @param text
	 * @param description
	 */
	void updateTag(int tagMark, ID contentId, String text, String description);
}
