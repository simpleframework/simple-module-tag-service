package net.simpleframework.module.tag.impl;

import static net.simpleframework.common.I18n.$m;
import net.simpleframework.ado.db.DbEntityTable;
import net.simpleframework.ctx.AbstractADOModuleContext;
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
	protected DbEntityTable[] createEntityTables() {
		return new DbEntityTable[] { new DbEntityTable(Tag.class, "sf_tag"),
				new DbEntityTable(TagR.class, "sf_tagr"),
				new DbEntityTable(TagSynonyms.class, "sf_tag_synonyms") };
	}

	@Override
	protected Module createModule() {
		return super.createModule().setName(MODULE_NAME).setText($m("TagContext.0")).setOrder(22);
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
