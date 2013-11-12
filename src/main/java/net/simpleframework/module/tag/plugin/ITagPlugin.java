package net.simpleframework.module.tag.plugin;

import net.simpleframework.common.ID;
import net.simpleframework.module.common.plugin.IModulePlugin;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public interface ITagPlugin extends IModulePlugin {

	/**
	 * 插入标签
	 * 
	 * @param contentId
	 * @param text
	 * @param description
	 */
	void updateTag(ID contentId, String text, String description);
}
