package com.example.quickserve;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class AddCombo extends Activity implements OnClickListener {
	
	Order customerOrder;
	RadioGroup burger;
	RadioGroup bun;
	RadioGroup meat;
	public void onCreate (Bundle savedInstanceState )
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addcombo);
		burger = (RadioGroup) findViewById(R.id.combo_rg1);
		bun = (RadioGroup) findViewById(R.id.combo_rg2);
		meat = (RadioGroup) findViewById(R.id.combo_rg3);
		
		
		Button combo_c = (Button) findViewById(R.id.combo_c);
		Button combo_n = (Button) findViewById(R.id.combo_n);
		
		combo_c.setOnClickListener(this);
		combo_n.setOnClickListener(this);
		
		Intent intent = getIntent();
		
		customerOrder = (Order) intent.getSerializableExtra("com.example.quickserve.Order.class");
		
		
	}

	@Override
	public void onClick(View v) 
	{
		if (v.getId() == R.id.combo_c)
		{			
			// Kill activity return to main activity
			
		}
		
		else if (v.getId() == R.id.combo_n)
		{			
			int a = burger.getCheckedRadioButtonId();
			int b = bun.getCheckedRadioButtonId();
			int c = meat.getCheckedRadioButtonId();
			
			RadioButton first = (RadioButton) findViewById(a);
			RadioButton second = (RadioButton) findViewById(b);
			RadioButton third = (RadioButton) findViewById(c);
			
			String X = first.getText().toString();
			String Y = second.getText().toString();
			String Z = third.getText().toString();
			
			
			customerOrder.addBurger(X); // add the size of burger
			customerOrder.addBurger(Y); // add the bun type
			customerOrder.addBurger(Z); // add the meat type
			// the first 3 "toppings" are theses three strings selected from the radiogroups
			
			//start the get sides activity
			
			
			Intent intent1 = new Intent(AddCombo.this,AddTopping.class);
			intent1.putExtra("com.example.quickserve.Order.class", customerOrder);
            startActivity(intent1);
			
			
		}
		
	}

}
