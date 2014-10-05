package com.example.proj1;

import java.util.Observable;
import java.util.Observer;

import android.view.Menu;

public class Allan implements Observer{
	int i = 10;
	int j=10;
	public Allan() {
		// TODO Auto-generated constructor stub
	}
	
	public void thisIsIT(Menu menu){
		try {
			int a = 3888;
			int b = 5777;
			int d=188;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void thisIsIT2(Menu menu){
		try {
			int b=16;
			String S = "Heppa";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void thisIsIT3(Menu menu){
		int k=16;
	
}

	@Override
	public void update(Observable observable, Object data) {
		// TODO Auto-generated method stub
		
	}
}
