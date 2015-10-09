package com.buc.cre.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
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
	private LinearLayout textArea;
	
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
		textArea = (LinearLayout) findViewById(R.id.layout_text);
		
		TextJustification.justifyWord(txtEditSell5, 60);
		TextJustification.justifyWord(txtEditSell6, 60);
		TextJustification.justifyWord(txtEditSell7, 60);
		TextJustification.justifyWord(txtEditSell8, 60);
		TextJustification.justifyWord(txtEditSell9, 60);
	}
}
