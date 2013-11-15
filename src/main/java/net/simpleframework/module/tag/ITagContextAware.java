package net.simpleframework.module.tag;

import net.simpleframework.ctx.ModuleContextFactory;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
public interface ITagContextAware {

	static ITagContext Context = ModuleContextFactory.get(ITagContext.class);
}
