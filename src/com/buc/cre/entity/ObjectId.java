package com.buc.cre.entity;

import org.json.JSONException;
import org.json.JSONObject;

public class ObjectId {
	private String json;
	
	public void setObjectId(String objectId) {
		json = objectId;
	}
	
	public String getObjectId() {
		return parserObjectId(json);
	}
	
	private String parserObjectId(String json) {
		String id = "";
		try {
			JSONObject dataJson = new JSONObject(json);
			JSONObject objectId = dataJson.getJSONObject("_id");
			id = objectId.optString("$oid");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return id;
	}
}
