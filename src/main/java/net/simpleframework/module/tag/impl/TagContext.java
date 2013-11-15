package net.simpleframework.module.tag.impl;

import static net.simpleframework.common.I18n.$m;
import net.simpleframework.ado.db.DbEntityTable;
import net.simpleframework.ctx.Module;
import net.simpleframework.ctx.service.ado.db.AbstractDbModuleContext;
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
public abstract class TagContext extends AbstractDbModuleContext implements ITagContext {

	@Override
	protected DbEntityTable[] getEntityTables() {
		return new DbEntityTable[] { Tag.TBL, TagR.TBL, TagSynonyms.TBL };
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
