package com.buc.cre.widget;

import java.util.ArrayList;

import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

public class TextJustification {
	public static void justify(TextView textView, float contentWidth) {
		String text = textView.getText().toString();
		String tempText;
		String resultText = "";
		Paint paint = textView.getPaint();
		ArrayList<String> paraList = new ArrayList<String>();
		paraList = paraBreak(text, textView);
		for (int i = 0; i < paraList.size(); i++) {
			ArrayList<String> lineList = lineBreak(paraList.get(i).trim(),
					paint, contentWidth);
			tempText = TextUtils.join(" ", lineList).replaceFirst("\\s*", "");
			resultText += tempText.replaceFirst("\\s*", "") + "\n";
		}

		textView.setText(resultText);
	}

	public static void justifyWord(TextView textView, float contentWidth) {
		String text = textView.getText().toString();
		String resultText = "";
		ArrayList<String> letterList = new ArrayList<String>();
		letterList = letterBreak(text);
		float intervalWidth = (contentWidth - getTextWidth(text)) / letterList.size();
		float spaceWidth = getTextWidth(" ");
		int spaceCount = (int) (intervalWidth / spaceWidth);
		String space = "";
		for(int i = 0; i < spaceCount; ++i) {
			space += " ";
		}
		
		for (int i = 1; i < letterList.size() - 1; ++i) {
			resultText = resultText + letterList.get(i) + space;
		}
		resultText = resultText + letterList.get(letterList.size() - 1);
		
		textView.setText(resultText);
	}

	// 分开每个文字
	public static ArrayList<String> letterBreak(String text) {
		ArrayList<String> paraList = new ArrayList<String>();
		String[] paraArray = text.split("");
		for (String para : paraArray) {
			paraList.add(para);
		}
		return paraList;
	}

	// 分开每个段落
	public static ArrayList<String> paraBreak(String text, TextView textview) {
		ArrayList<String> paraList = new ArrayList<String>();
		String[] paraArray = text.split("\\n+");
		for (String para : paraArray) {
			paraList.add(para);
		}
		return paraList;
	}
	
	private static float getTextWidth(String text) {
		Paint mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		 
		// Measure the width of the text string.
		float textWidth = mTextPaint.measureText(text);
		
		return textWidth;
	}

	// 分开每一行，使每一行填入最多的单词数
	private static ArrayList<String> lineBreak(String text, Paint paint,
			float contentWidth) {
		String[] wordArray = text.split("\\s");
		ArrayList<String> lineList = new ArrayList<String>();
		String myText = "";
		for (String word : wordArray) {
			if (paint.measureText(myText + " " + word) <= contentWidth)
				myText = myText + " " + word;
			else {
				int totalSpacesToInsert = (int) ((contentWidth - paint
						.measureText(myText)) / paint.measureText(" "));
				lineList.add(justifyLine(myText, totalSpacesToInsert));
				myText = word;
			}
		}
		lineList.add(myText);
		return lineList;
	}

	// 已填入最多单词数的一行，插入对应的空格数直到该行满
	private static String justifyLine(String text, int totalSpacesToInsert) {
		String[] wordArray = text.split("\\s");
		String toAppend = " ";
		while ((totalSpacesToInsert) >= (wordArray.length - 1)) {
			toAppend = toAppend + " ";
			totalSpacesToInsert = totalSpacesToInsert - (wordArray.length - 1);
		}
		int i = 0;
		String justifiedText = "";
		for (String word : wordArray) {
			if (i < totalSpacesToInsert)
				justifiedText = justifiedText + word + " " + toAppend;
			else
				justifiedText = justifiedText + word + toAppend;
			i++;
		}
		return justifiedText;
	}
}
