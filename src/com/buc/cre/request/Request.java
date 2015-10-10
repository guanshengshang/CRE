package com.buc.cre.request;

import com.buc.cre.util.RequestUtil;
import com.buc.cre.util.RequestUtil.Response;

public class Request {
	public static final int STATUS_INVALID = -1;
	public static final int STATUS_PROCESSING = 2;
	public static final int STATUS_SUCCEED = 1;
	public static final int STATUS_FAILED = 0;

	private int status = STATUS_INVALID;
	private Response response = null;

	public int getRequestStatus() {
		return status;
	}

	public void sendRequest(final String url) {
		status = STATUS_PROCESSING;
		new Thread() {
			@Override
			public void run() {
				response = RequestUtil.sendRequest(url);

				if (response.responseCode == 200) {
					// success
					status = STATUS_SUCCEED;
				} else {
					status = STATUS_FAILED;
				}
			}
		}.start();
	}
	
	public String getResponseString() {
		return response.responseString;
	}
}
