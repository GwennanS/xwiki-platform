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
package com.xpn.xwiki.internal.model;

import java.util.Set;

/**
 * Represents a nested page. This class is used to query the <strong>Nested Pages</strong> hierarchy.
 * 
 * @version $Id$
 * @since 8.3M2, 7.4.5
 */
public class XWikiPage extends AbstractXWikiPage
{
    private Set<XWikiPageTranslation> translations;

    /**
     * @return the page translations
     */
    public Set<XWikiPageTranslation> getTranslations()
    {
        return translations;
    }
}
