/*
 * Copyright (C) 2007,2008 Cambio Healthcare Systems AB, Sweden
 * All Rights Reserved.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You may obtain a copy of the License at
 * http://www.gnu.org/licenses/gpl.txt
 *
 */

package org.openehr.am.parser;

public class KeyedObject extends Parsed {
	
	public KeyedObject(SimpleValue key, ObjectBlock object) {
		this.key = key;
		this.object = object;
	}
	
	public SimpleValue getKey() {
		return key;
	}
	
	public ObjectBlock getObject() {
		return object;
	}
	
	private SimpleValue key;
	private ObjectBlock object;
}
