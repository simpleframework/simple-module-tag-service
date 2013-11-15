package net.simpleframework.module.tag;

import net.simpleframework.ctx.service.ado.db.IDbModuleContext;
import net.simpleframework.module.common.plugin.ModulePluginRegistry;
import net.simpleframework.module.tag.plugin.ITagPlugin;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885) https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
public interface ITagContext extends IDbModuleContext {

	static final String MODULE_NAME = "simple-module-tag";

	/**
	 * 获取标签管理器
	 * 
	 * @return
	 */
	ITagService getTagService();

	TagPluginRegistry getPluginRegistry();

	public static class TagPluginRegistry extends ModulePluginRegistry<ITagPlugin> {
	}
}
