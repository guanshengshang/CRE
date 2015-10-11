package com.buc.cre.activity;

import java.util.ArrayList;

import com.buc.cre.R;
import com.buc.cre.entity.ADInfo;
import com.nostra13.universalimageloader.core.ImageLoader;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class EditBuyActivity extends Activity {

	private ImageView mAdView;
	private ArrayList<ADInfo> adInfos = new ArrayList<ADInfo>();
	private String ImageUrl = "http://pic.58pic.com/58pic/12/64/27/55U58PICrdX.jpg";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_buy);
		
		ADInfo adInfo = new ADInfo();
		adInfo.setUrl(ImageUrl);
		adInfos.add(adInfo);
		
		mAdView = (ImageView) findViewById(R.id.view_edit_sell_ad);
		ImageLoader.getInstance().displayImage(ImageUrl, mAdView);// 使用ImageLoader对图片进行加装！
	}
	
}
