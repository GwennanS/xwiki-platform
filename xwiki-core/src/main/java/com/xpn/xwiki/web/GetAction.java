/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package com.xpn.xwiki.web;

import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.XWikiException;

/**
 * Action used to get a resource that is a part of a page loaded asynchronously generally for performance reasons. Like
 * <code>download</code> or <code>skin</code> but for wiki content.
 * <p>
 * This means that by default there is not UI and it's not registered in the statistics since the main page is already
 * logged.
 * 
 * @version $Id$
 */
public class GetAction extends XWikiAction
{
    /**
     * The identifier of the view action.
     * 
     * @todo need an enumerated class for actions.
     */
    public static final String GET_ACTION = "get";

    /**
     * {@inheritDoc}
     * 
     * @see XWikiAction#action(com.xpn.xwiki.XWikiContext)
     */
    public boolean action(XWikiContext context) throws XWikiException
    {
        boolean shouldRender = true;

        context.put("action", GET_ACTION);

        return shouldRender;
    }

    /**
     * {@inheritDoc}
     * 
     * @see XWikiAction#render(com.xpn.xwiki.XWikiContext)
     */
    public String render(XWikiContext context) throws XWikiException
    {
        handleRevision(context);

        return GET_ACTION;
    }
}
