package com.buc.cre.server;

import java.io.File;
import java.util.ArrayList;

import com.buc.cre.entity.RentProject;

public class RentRequestManager {
	private static final String IP = "";
	private static final String URL_RESOURCES = "http://" + IP + "/resources/";
	private static final String URL_RENT_PUBLISH = "http://" + IP
			+ "/rent/publish/";
	private static final String URL_RENT_APPROVE = "http://" + IP
			+ "/rent/approve/";
	private static final String URL_RENT_VIEW = "http://" + IP + "/rent/view/";
	private static final String URL_RENT_DELETE = "http://" + IP
			+ "/rent/delete/";
	private static final String URL_RENT_SEARCH = "http://" + IP
			+ "/rent/search?";

	private static final String URL_WANTED_PUBLISH = "http://" + IP
			+ "/wanted/publish/";
	private static final String URL_WANTED_APPROVE = "http://" + IP
			+ "/wanted/approve/";
	private static final String URL_WANTED_VIEW = "http://" + IP
			+ "/wanted/view/";
	private static final String URL_WANTED_DELETE = "http://" + IP
			+ "/wanted/delete/";
	private static final String URL_WANTED_SEARCH = "http://" + IP
			+ "/wanted/search?";

	// 上传文件
	public static void OnUploadFile(String path) {

	}

	// 发布招租信息
	public static void OnPublishRentInfo(RentProject rentProject) {

	}

	// 更新招租信息
	public static void OnUpdateRentInfo(RentProject rentProject) {

	}

	// 通过审核招租信息
	public static void OnApproveRentInfo(String id) {

	}

	// 查看招租信息
	public static void OnViewRentInfo(String id) {

	}

	// 删除招租信息
	public static void OnDeleteRentInfo(String id) {

	}

	// 查找招租信息
	public static void OnSearchRentInfo(ArrayList<String> keys, int from) {

	}

}
