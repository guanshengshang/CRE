package com.buc.cre.activity;

import java.util.ArrayList;

import com.buc.cre.R;
import com.buc.cre.entity.ADInfo;
import com.buc.cre.widget.ImageCycleView;
import com.buc.cre.widget.ImageCycleView.ImageCycleViewListener;
import com.nostra13.universalimageloader.core.ImageLoader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class PublishActivity extends Activity {

	private ImageView mAdView;
	private ArrayList<ADInfo> adInfos = new ArrayList<ADInfo>();
	private String ImageUrl = "http://pic.58pic.com/58pic/12/64/27/55U58PICrdX.jpg";
	
	//buttons
	private Button btnHome;
	private Button btnHire;
	private Button btnSell;
	private Button btnLessee;
	private Button btnBuy;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_publish);
		
		ADInfo adInfo = new ADInfo();
		adInfo.setUrl(ImageUrl);
		adInfos.add(adInfo);
		
		mAdView = (ImageView) findViewById(R.id.view_publish_ad);
		ImageLoader.getInstance().displayImage(ImageUrl, mAdView);// 使用ImageLoader对图片进行加装！
		
		initButtonListener();
	}
	
	private void initButtonListener() {
		btnHome = (Button) findViewById(R.id.btn_publish_home);
		btnHire = (Button) findViewById(R.id.btn_publish_hire);
		btnSell = (Button) findViewById(R.id.btn_publish_sell);
		btnLessee = (Button) findViewById(R.id.btn_publish_lessee);
		btnBuy = (Button) findViewById(R.id.btn_publish_buy);
		
		btnHome.setOnClickListener(new OnClickListener(){
	         @Override
	         public void onClick(View v) {
	        	 Intent intent = new Intent(PublishActivity.this, HomeActivity.class);
	        	 startActivity(intent);
	         }
	         });
		btnHire.setOnClickListener(new OnClickListener(){
	         @Override
	         public void onClick(View v) {
	        	 Intent intent = new Intent(PublishActivity.this, EditSellActivity.class);
	        	 startActivity(intent);
	         }
	         });
		btnSell.setOnClickListener(new OnClickListener(){
	         @Override
	         public void onClick(View v) {
	        	 Intent intent = new Intent(PublishActivity.this, EditSellActivity.class);
	        	 startActivity(intent);
	         }
	         });
		btnLessee.setOnClickListener(new OnClickListener(){
	         @Override
	         public void onClick(View v) {
	        	 Intent intent = new Intent(PublishActivity.this, EditBuyActivity.class);
	        	 startActivity(intent);
	         }
	         });
		btnBuy.setOnClickListener(new OnClickListener(){
	         @Override
	         public void onClick(View v) {
	        	 Intent intent = new Intent(PublishActivity.this, EditBuyActivity.class);
	        	 startActivity(intent);
	         }
	         });
	}
}
