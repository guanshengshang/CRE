package com.buc.cre.util;

import com.buc.cre.R;

import android.content.Context;


public class CommonUtil {
	public static String getStoreType(Context context, int type) {
		String result = "";
		switch (type)
		{
		case 1:
			return context.getString(R.string.btn_shopcenter);
		case 2:
			return context.getString(R.string.btn_street);
		case 3:
			return context.getString(R.string.btn_hotel);
		case 4:
			return context.getString(R.string.btn_community);
		}
		
		return result;
	}
}
