package net.simpleframework.module.tag.impl;

import static net.simpleframework.common.I18n.$m;
import net.simpleframework.ado.IADOManagerFactory;
import net.simpleframework.ado.db.DbManagerFactory;
import net.simpleframework.ctx.AbstractADOModuleContext;
import net.simpleframework.ctx.IApplicationContext;
import net.simpleframework.ctx.Module;
import net.simpleframework.module.tag.ITagContext;
import net.simpleframework.module.tag.ITagService;
import net.simpleframework.module.tag.Tag;
import net.simpleframework.module.tag.TagR;
import net.simpleframework.module.tag.TagSynonyms;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885) https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
public abstract class TagContext extends AbstractADOModuleContext implements ITagContext {

	@Override
	public void onInit(final IApplicationContext application) throws Exception {
		super.onInit(application);

		final IADOManagerFactory aFactory = getADOManagerFactory();
		if (aFactory instanceof DbManagerFactory) {
			((DbManagerFactory) aFactory).regist(Tag.TBL, TagR.TBL, TagSynonyms.TBL);
		}
	}

	@Override
	protected Module createModule() {
		return new Module().setName(MODULE_NAME).setText($m("TagContext.0")).setOrder(22);
	}

	@Override
	public ITagService getTagService() {
		return singleton(TagService.class);
	}

	@Override
	public TagPluginRegistry getPluginRegistry() {
		return singleton(TagPluginRegistry.class);
	}
}
