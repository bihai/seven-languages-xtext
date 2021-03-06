/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xtext.mongobeans.examples;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class JavaExample {

	public void dealWithMongoEntities() throws UnknownHostException, MongoException {
		DBObject artist = new BasicDBObject();
		artist.put("name", "John Coltrane");
		DBObject album = new BasicDBObject();
		album.put("title", "A Love Supreme");
		album.put("year", 1965);
		List<DBObject> albums = new ArrayList<DBObject>();
		artist.put("albums", albums);

		DB db = new Mongo().getDB("testdb");
		DBCollection dbCollection = db.getCollection("testCollection");
		dbCollection.save(artist);
		
		DBObject query = new BasicDBObject();
		query.put("name", "John Coltrane");
		DBObject artistFromDB = dbCollection.find(query).next();
		Object albumFromDB = artistFromDB.get("album");
		if(albumFromDB instanceof Collection) {
			Object firstAlbumFromDB = ((Collection<?>) album).iterator().next();
			if(firstAlbumFromDB instanceof DBObject) {
				Object titleFromDB = album.get("title");
				System.out.println(titleFromDB.toString());
			}
		}
	}
}
