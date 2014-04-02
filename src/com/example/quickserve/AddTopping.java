package com.example.quickserve;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class AddTopping extends Activity implements OnClickListener {
	
	Order customerOrder;
	CheckBox lettuce;
	CheckBox tomato;
	CheckBox onion;
	CheckBox spinach;
	CheckBox pepper;
	CheckBox pickle;
	CheckBox mushroom;
	CheckBox cheese;
	CheckBox bacon;

	
	public void onCreate (Bundle savedInstanceState )
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addtopping);
		
		lettuce = (CheckBox) findViewById(R.id.top_cb1);
		tomato = (CheckBox) findViewById(R.id.top_cb2);
		onion = (CheckBox) findViewById(R.id.top_cb3);
		spinach = (CheckBox) findViewById(R.id.top_cb4);
		pepper = (CheckBox) findViewById(R.id.top_cb5);
		pickle = (CheckBox) findViewById(R.id.top_cb6);
		mushroom = (CheckBox) findViewById(R.id.top_cb7);
		cheese = (CheckBox) findViewById(R.id.top_cb8);
		bacon = (CheckBox) findViewById(R.id.top_cb9);
		
		Button cancel = (Button) findViewById(R.id.top_c);
		Button next = (Button) findViewById(R.id.top_n);
		
		cancel.setOnClickListener(this);
		next.setOnClickListener(this);
		
		Intent intent = getIntent();
		
		customerOrder = (Order) intent.getSerializableExtra("com.example.quickserve.Order.class");
	}

	@Override
	public void onClick(View v) 
	{
		if (v.getId() == R.id.top_c)
		{			
			// Kill activity return to main activity
			
		}
		
		else if (v.getId() == R.id.top_n)
		{			
			if(lettuce.isChecked())
				customerOrder.addTopping(lettuce.getText().toString());
			if(tomato.isChecked())
				customerOrder.addTopping(tomato.getText().toString());
			if(onion.isChecked())
				customerOrder.addTopping(onion.getText().toString());
			if(spinach.isChecked())
				customerOrder.addTopping(spinach.getText().toString());
			if(pepper.isChecked())
				customerOrder.addTopping(pepper.getText().toString());
			if(pickle.isChecked())
				customerOrder.addTopping(pickle.getText().toString());
			if(mushroom.isChecked())
				customerOrder.addTopping(mushroom.getText().toString());
			if(cheese.isChecked())
				customerOrder.addTopping(cheese.getText().toString());
			if(bacon.isChecked())
				customerOrder.addTopping(bacon.getText().toString());
			
			customerOrder.addTopping("enditem");
			
			if(customerOrder.isCombo())
			{
			Intent intent1 = new Intent(AddTopping.this,AddSides.class);			
			intent1.putExtra("com.example.quickserve.Order.class", customerOrder);
            startActivity(intent1);
			}
		}
		
	}

}