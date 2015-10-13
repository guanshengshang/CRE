package com.buc.cre.activity;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.buc.cre.R;
import com.buc.cre.entity.StoreItemDevelop;
import com.buc.cre.entity.StoreItemSell;
import com.buc.cre.widget.StoreListAdapter;

public class StoreListActivity extends Activity {

	private ListView listView = null;
	private int listType = 0;// 0 develop, 1 sell

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_store_list);

		listView = (ListView) findViewById(R.id.list_store);
		StoreListAdapter storeListAdapter = new StoreListAdapter(this);
		storeListAdapter.SetStoresDev(getStoreDevDatas());
		listView.setAdapter(storeListAdapter);  
	}

	private ArrayList<StoreItemDevelop> getStoreDevDatas() {
		ArrayList<StoreItemDevelop> storesDev = new ArrayList<StoreItemDevelop>();
		
		for(int i  = 0; i < 10; ++i) {
			StoreItemDevelop storeDev = new StoreItemDevelop();
			
			storeDev.setStoreType(i % 4 + 1);
			storeDev.setAddress("aaa" + i);
			storeDev.setArea(i * 10);
			storeDev.setInvestObject("bbb" + i);
			storeDev.setPrice(i * 100);
			storeDev.setProjrectName("ccc" + i);
			storeDev.setPublished(i % 2 == 0 ? true : false);
			
			storesDev.add(storeDev);
		}
		
		return storesDev;
	}

	private ArrayList<StoreItemSell> getStoreSellDatas() {
		ArrayList<StoreItemSell> storesSell = new ArrayList<StoreItemSell>();
		
		return storesSell;
	}
}
