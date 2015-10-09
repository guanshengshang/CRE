package com.buc.cre.entity;

import org.json.JSONException;
import org.json.JSONObject;

public class Datetime {
	private String json;
	
	public void setDatatime(String dataTime) {
		json = dataTime;
	}
	
	public long getDatatime() {
		return parserDatatime(json);
	}
	
	private long parserDatatime(String json) {
		long dataTime = 0;
		try {
			JSONObject dataJson = new JSONObject(json);
			JSONObject objectId = dataJson.getJSONObject("create_time");
			dataTime = objectId.optLong("$date");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return dataTime;
	}
}
