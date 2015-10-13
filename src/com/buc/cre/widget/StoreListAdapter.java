package com.buc.cre.widget;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.buc.cre.R;
import com.buc.cre.entity.StoreItemDevelop;
import com.buc.cre.entity.StoreItemSell;
import com.buc.cre.util.CommonUtil;

public class StoreListAdapter extends BaseAdapter {

	private LayoutInflater layoutInflater;
	private Context context;
	private ArrayList<StoreItemDevelop> storesDev;
	private ArrayList<StoreItemSell> storesSell;
	private int listType = 0;// 0 develop, 1 sell
	
	public final class Module {
		public TextView text1;
		public TextView text2;
		public TextView text3;
		public TextView text4;
		public TextView text5;
		public TextView text6;
		public TextView text7;
	}
	
	public StoreListAdapter(Context context) {
		this.context = context;
		this.layoutInflater = LayoutInflater.from(context);
	}

	public void SetStoresDev(ArrayList<StoreItemDevelop> storesDev) {
		listType = 0;
		this.storesDev = storesDev;
	}
	
	public void SetStoreSell(ArrayList<StoreItemSell> storesSell) {
		listType = 1;
		this.storesSell = storesSell;
	}
	

	@Override
	public int getCount() {
		if (listType == 0) {
			return storesDev.size();
		} else if (listType == 1) {
			return storesSell.size();
		} else {
			return 0;
		}
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Module module = null;
		if (convertView == null) {
			module = new Module();
			// 获得组件，实例化组件
			convertView = layoutInflater
					.inflate(R.layout.view_store_list, null);
			module.text1 = (TextView) convertView
					.findViewById(R.id.text_store_list_1);
			module.text2 = (TextView) convertView
					.findViewById(R.id.text_store_list_2);
			module.text3 = (TextView) convertView
					.findViewById(R.id.text_store_list_3);
			module.text4 = (TextView) convertView
					.findViewById(R.id.text_store_list_4);
			module.text5 = (TextView) convertView
					.findViewById(R.id.text_store_list_5);
			module.text6 = (TextView) convertView
					.findViewById(R.id.text_store_list_6);
			module.text7 = (TextView) convertView
					.findViewById(R.id.text_store_list_7);
			convertView.setTag(module);
		} else {
			module = (Module) convertView.getTag();
		}

		// 绑定数据
		if (listType == 0) {
			module.text1.setText("【" + CommonUtil.getStoreType(context, storesDev.get(position).getStoreType()) + "】");
			module.text2.setText(context.getString(R.string.text_store_list_5) + storesDev.get(position).getProjrectName());
			module.text3.setText(context.getString(R.string.text_store_list_6) + storesDev.get(position).getAddress());
			if (storesDev.get(position).isPublished())
				module.text4.setText(context.getString(R.string.text_store_list_7) + storesDev.get(position).getPrice());
			else
				module.text4.setVisibility(View.GONE);  
			module.text5.setText(context.getString(R.string.text_store_list_8) + storesDev.get(position).getArea());
			module.text6.setText(context.getString(R.string.text_store_list_9) + storesDev.get(position).getInvestObject());
			module.text7.setVisibility(View.GONE);  
		} else if (listType == 1) {
			module.text1.setText("111");
			module.text2.setText("222");
			module.text3.setText("33");
			module.text4.setText("44");
			module.text5.setText("5");
			module.text6.setText("6");
			module.text7.setText("7");
		}
		

		return convertView;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

}
