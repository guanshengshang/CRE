package com.buc.cre.activity;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.buc.cre.R;
import com.buc.cre.entity.ADInfo;
import com.buc.cre.widget.ImageCycleView;
import com.buc.cre.widget.ImageCycleView.ImageCycleViewListener;
import com.nostra13.universalimageloader.core.ImageLoader;

public class ImageCycleActivity extends Activity {

	private ImageCycleView mAdViewTop;
	
	private ImageCycleView mAdViewButtom;
	
	private ArrayList<ADInfo> infosTop = new ArrayList<ADInfo>();
	private ArrayList<ADInfo> infosButtom = new ArrayList<ADInfo>();

	private String[] imageUrlsTop = {"http://img.taodiantong.cn/v55183/infoimg/2013-07/130720115322ky.jpg",
			"http://pic30.nipic.com/20130626/8174275_085522448172_2.jpg",
			"http://pic18.nipic.com/20111215/577405_080531548148_2.jpg",
			"http://pic15.nipic.com/20110722/2912365_092519919000_2.jpg",
			"http://pic.58pic.com/58pic/12/64/27/55U58PICrdX.jpg",
			"http://www.iteye.com/upload/logo/user/1032200/c8d9d8c4-286a-3c7d-91f1-01f4ac0e4fc6.jpg?1416063504"};
	
	private String[] imageUrlsButtom = {
			"http://down1.sucaitianxia.com/psd02/psd158/psds27988.jpg",
			"http://pic2.ooopic.com/11/35/98/12bOOOPIC8f.jpg",
			"http://down1.sucaitianxia.com/psd02/psd158/psds28266.jpg",
			"http://pic02.sosucai.com/PSD/PSD_cd0267/b/PSD_cd0267_00016.jpg"};


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		/*mImageUrl = new ArrayList<String>();
		mImageUrl2 = new ArrayList<String>();*/
		for(int i=0;i < imageUrlsTop.length; i ++){
			ADInfo info = new ADInfo();
			info.setUrl(imageUrlsTop[i]);
			info.setContent("top-->" + i);
			infosTop.add(info);
		}
		
		for(String str: imageUrlsButtom){
			ADInfo info = new ADInfo();
			info.setUrl(str);
			info.setContent("bottom");
			infosButtom.add(info);
		}
		
		mAdViewTop = (ImageCycleView) findViewById(R.id.ad_viewTop);
		mAdViewButtom = (ImageCycleView) findViewById(R.id.ad_viewButtom);
		mAdViewTop.setImageResources(infosTop, mAdCycleViewListener);
		mAdViewButtom.setImageResources(infosButtom, mAdCycleViewListener);
	}

	private ImageCycleViewListener mAdCycleViewListener = new ImageCycleViewListener() {

		@Override
		public void onImageClick(ADInfo info, int position, View imageView) {
			Toast.makeText(ImageCycleActivity.this, "content->"+info.getContent(), Toast.LENGTH_SHORT).show();
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
