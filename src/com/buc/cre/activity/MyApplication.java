package com.buc.cre.activity;

import android.app.Application;

import com.buc.cre.R;
import com.buc.cre.R.drawable;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;

/**
 * MyApplication
 * 
 * @author minking
 */
public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		// 鍒濆鍖朓mageLoader
		@SuppressWarnings("deprecation")
		DisplayImageOptions options = new DisplayImageOptions.Builder().showStubImage(R.drawable.icon_stub) // 璁剧疆鍥剧墖涓嬭浇鏈熼棿鏄剧ず鐨勫浘鐗�
		.showImageForEmptyUri(R.drawable.icon_empty) // 璁剧疆鍥剧墖Uri涓虹┖鎴栨槸閿欒鐨勬椂鍊欐樉绀虹殑鍥剧墖
				.showImageOnFail(R.drawable.icon_error) // 璁剧疆鍥剧墖鍔犺浇鎴栬В鐮佽繃绋嬩腑鍙戠敓閿欒鏄剧ず鐨勫浘鐗�				
				.cacheInMemory(true) // 璁剧疆涓嬭浇鐨勫浘鐗囨槸鍚︾紦瀛樺湪鍐呭瓨涓�				
				.cacheOnDisc(true) // 璁剧疆涓嬭浇鐨勫浘鐗囨槸鍚︾紦瀛樺湪SD鍗′腑// 
				//.displayer(new RoundedBitmapDisplayer(20)) // 璁剧疆鎴愬渾瑙掑浘鐗�	
				.imageScaleType(ImageScaleType.EXACTLY_STRETCHED)
				.build(); // 鍒涘缓閰嶇疆杩囧緱DisplayImageOption瀵硅薄

		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext()).defaultDisplayImageOptions(options)
				.threadPriority(Thread.NORM_PRIORITY - 2).denyCacheImageMultipleSizesInMemory()
				.discCacheFileNameGenerator(new Md5FileNameGenerator()).tasksProcessingOrder(QueueProcessingType.LIFO).build();
		ImageLoader.getInstance().init(config);
	}

}
