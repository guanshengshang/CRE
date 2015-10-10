package com.buc.cre.util;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.util.Log;

public class RequestUtil {
	public class Response {
		public int responseCode = 0;
		public String responseString = "";
	}
	
	public static boolean uploadFile(String url, String path) {
		boolean bRet = false;
		HttpURLConnection conn = null;
		
		File f = new File(path);
		long fileSize = f.length();
		if(fileSize <= 0)
			return bRet;
		
		try {
			URL url1 = new URL(url);
			conn = (HttpURLConnection) url1.openConnection();
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(30000);
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Connection", "Keep-Alive");
			conn.setRequestProperty("User-Agent",
					"Mozilla/5.0 (Windows; U; Windows NT 6.1; zh-CN; rv:1.9.2.6)");
			conn.setRequestProperty("Content-Type", "application/octet-stream");
			InputStream fis = new BufferedInputStream(new FileInputStream(path));
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			fis.close();
			OutputStream out = new DataOutputStream(conn.getOutputStream());
			out.write(buffer);
			out.flush();
			out.close();
			conn.connect();
			int response = conn.getResponseCode();
			if (response == 200)
				bRet = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
				conn = null;
			}
		}
		
		return bRet;
	}
	
	public static Response sendRequest(String url) {
		HttpURLConnection conn = null;
		InputStream is;
		OutputStream os;
		Response reponse = null;
		
		try {
			URL url1 = new URL(url);
			conn = (HttpURLConnection) url1.openConnection();
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(30000);
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Connection", "Keep-Alive");
			conn.setRequestProperty("User-Agent",
					"Mozilla/5.0 (Windows; U; Windows NT 6.1; zh-CN; rv:1.9.2.6)");
			conn.setRequestProperty("Content-Type", "application/octet-stream");
			conn.connect();
			
			os = conn.getOutputStream();
			
			DataOutputStream dos = new DataOutputStream(os);
			dos.close();
			
			is = conn.getInputStream();
			
			reponse.responseCode = conn.getResponseCode();
			reponse.responseString = StreamUtil.getStringFromInputStream(is);
			//Log.v("==test", "" + conn.getResponseCode());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
				conn = null;
			}
		}
		
		return reponse;
	}
}
