package com.buc.cre.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.buc.cre.R;
import com.buc.cre.widget.TextJustification;

public class EditSellActivity extends Activity {
	//match layout id
	private TextView txtEditSell5;
	private TextView txtEditSell6;
	private TextView txtEditSell7;
	private TextView txtEditSell8;
	private TextView txtEditSell9;
	private Button btnBack;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_sell);
		
		init();
	}

	private void init() {
		txtEditSell5 = (TextView) findViewById(R.id.text_edit_sell_5);
		txtEditSell6 = (TextView) findViewById(R.id.text_edit_sell_6);
		txtEditSell7 = (TextView) findViewById(R.id.text_edit_sell_7);
		txtEditSell8 = (TextView) findViewById(R.id.text_edit_sell_8);
		txtEditSell9 = (TextView) findViewById(R.id.text_edit_sell_9);
		
		TextJustification.justifyWord(txtEditSell5, 60);
		TextJustification.justifyWord(txtEditSell6, 60);
		TextJustification.justifyWord(txtEditSell7, 60);
		TextJustification.justifyWord(txtEditSell8, 60);
		TextJustification.justifyWord(txtEditSell9, 60);
		
		btnBack = (Button) findViewById(R.id.btn_edit_sell_back);
		btnBack.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(EditSellActivity.this,
						PublishActivity.class);
				startActivity(intent);
			}
		});
	}
}
