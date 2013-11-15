package net.simpleframework.module.tag;

import net.simpleframework.common.ID;
import net.simpleframework.ctx.AbstractModuleRef;
import net.simpleframework.ctx.ModuleContextFactory;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885) https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
public class TagRef extends AbstractModuleRef {

	@Override
	public ITagContext getModuleContext() {
		return ModuleContextFactory.get(ITagContext.class);
	}

	public void insertTag(final ID contentId, final String text) {
	}
}
