package com.buc.cre.activity;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.buc.cre.R;
import com.buc.cre.entity.ADInfo;
import com.nostra13.universalimageloader.core.ImageLoader;

public class EditBuyActivity extends Activity {

	private ImageView adView;
	private ArrayList<ADInfo> adInfos = new ArrayList<ADInfo>();
	private String imageUrl = "http://pic.58pic.com/58pic/12/64/27/55U58PICrdX.jpg";
	private Button btnBack;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_buy);
		
		ADInfo adInfo = new ADInfo();
		adInfo.setUrl(imageUrl);
		adInfos.add(adInfo);
		
		adView = (ImageView) findViewById(R.id.view_edit_sell_ad);
		ImageLoader.getInstance().displayImage(imageUrl, adView);// 使用ImageLoader对图片进行加装！
		
		init();
	}
	
	private void init() {
		btnBack = (Button) findViewById(R.id.btn_edit_buy_back);
		btnBack.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(EditBuyActivity.this,
						PublishActivity.class);
				startActivity(intent);
			}
		});
	}
}
