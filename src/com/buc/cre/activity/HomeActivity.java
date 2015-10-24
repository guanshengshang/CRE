package com.buc.cre.activity;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.buc.cre.R;
import com.buc.cre.entity.ADInfo;
import com.buc.cre.widget.ImageCycleView;
import com.buc.cre.widget.ImageCycleView.ImageCycleViewListener;
import com.nostra13.universalimageloader.core.ImageLoader;

public class HomeActivity extends Activity {
	// ads
	private ImageCycleView mAdViewTop;
	private ImageCycleView mAdViewButtom;
	private ArrayList<ADInfo> infosTop = new ArrayList<ADInfo>();
	private ArrayList<ADInfo> infosButtom = new ArrayList<ADInfo>();

	private String[] imageUrlsTop = {
			"http://img.taodiantong.cn/v55183/infoimg/2013-07/130720115322ky.jpg",
			"http://pic30.nipic.com/20130626/8174275_085522448172_2.jpg",
			"http://pic18.nipic.com/20111215/577405_080531548148_2.jpg",
			"http://pic15.nipic.com/20110722/2912365_092519919000_2.jpg",
			"http://pic.58pic.com/58pic/12/64/27/55U58PICrdX.jpg" };

	private String[] imageUrlsButtom = {
			"http://down1.sucaitianxia.com/psd02/psd158/psds27988.jpg",
			"http://pic2.ooopic.com/11/35/98/12bOOOPIC8f.jpg",
			"http://down1.sucaitianxia.com/psd02/psd158/psds28266.jpg",
			"http://pic02.sosucai.com/PSD/PSD_cd0267/b/PSD_cd0267_00016.jpg" };

	// buttons
	private Button btnHome;
	private Button btnPublish;
	private Button btnShopCenter;
	private Button btnStreet;
	private Button btnHotel;
	private Button btnCommunity;
	private Button btnSearch;
	private EditText editSearch;
	
	// 定义Handler对象
	private Handler handler = new Handler() {
		@Override
		// 当有消息发送出来的时候就执行Handler的这个方法
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
			switch (msg.what) {
			case 0:
				
				break;
			default:
				break;
			}
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		for (int i = 0; i < imageUrlsTop.length; i++) {
			ADInfo info = new ADInfo();
			info.setUrl(imageUrlsTop[i]);
			info.setContent("top-->" + i);
			infosTop.add(info);
		}

		for (String str : imageUrlsButtom) {
			ADInfo info = new ADInfo();
			info.setUrl(str);
			info.setContent("bottom");
			infosButtom.add(info);
		}

		mAdViewTop = (ImageCycleView) findViewById(R.id.view_home_adTop);
		mAdViewButtom = (ImageCycleView) findViewById(R.id.view_home_adBottom);
		mAdViewTop.setImageResources(infosTop, mAdCycleViewListener);
		mAdViewButtom.setImageResources(infosButtom, mAdCycleViewListener);

		init();
	}

	private void init() {
		btnHome = (Button) findViewById(R.id.btn_home_home);
		btnPublish = (Button) findViewById(R.id.btn_home_publish);
		btnShopCenter = (Button) findViewById(R.id.btn_home_shoppingCenter);
		btnStreet = (Button) findViewById(R.id.btn_home_street);
		btnHotel = (Button) findViewById(R.id.btn_home_hotel);
		btnCommunity = (Button) findViewById(R.id.btn_home_community);
		btnSearch = (Button) findViewById(R.id.btn_home_search);
		editSearch = (EditText) findViewById(R.id.txt_home_search);
		
		btnHome.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			}
		});

		btnPublish.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(HomeActivity.this,
						PublishActivity.class);
				startActivity(intent);
			}
		});

		btnShopCenter.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(HomeActivity.this,
						StoreListActivity.class);
				startActivity(intent);
			}
		});

		btnStreet.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(HomeActivity.this,
						StoreListActivity.class);
				startActivity(intent);
			}
		});

		btnHotel.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(HomeActivity.this,
						StoreListActivity.class);
				startActivity(intent);
			}
		});

		btnCommunity.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(HomeActivity.this,
						StoreListActivity.class);
				startActivity(intent);
			}
		});
		
		btnSearch.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Bundle bundle = new Bundle();
				bundle.putString("search", editSearch.getText().toString());
				Intent intent = new Intent(HomeActivity.this,
						StoreListActivity.class);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
	}

	private ImageCycleViewListener mAdCycleViewListener = new ImageCycleViewListener() {

		@Override
		public void onImageClick(ADInfo info, int position, View imageView) {
			Toast.makeText(HomeActivity.this, "content->" + info.getContent(),
					Toast.LENGTH_SHORT).show();
		}

		@Override
		public void displayImage(String imageURL, ImageView imageView) {
			ImageLoader.getInstance().displayImage(imageURL, imageView);// 使用ImageLoader对图片进行加装！
		}
	};

	@Override
	protected void onResume() {
		super.onResume();
		mAdViewTop.startImageCycle();
		mAdViewButtom.startImageCycle();
	};

	@Override
	protected void onPause() {
		super.onPause();
		mAdViewTop.pushImageCycle();
		mAdViewButtom.pushImageCycle();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		mAdViewTop.pushImageCycle();
		mAdViewButtom.pushImageCycle();
	}

}
