package com.example.quickserve;

import java.util.ArrayList;
import java.util.ListIterator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class ParseSelected extends Activity implements OnClickListener {
	
	Order customerOrder;
	TextView text;
	ArrayList<String> burgers;
	ArrayList<String> toppings;
	ArrayList<String> sides;
	public void onCreate (Bundle savedInstanceState )
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.parseselected);
						
		text = (TextView) findViewById(R.id.parsedtext);		
		Intent intent = getIntent();		
		customerOrder = (Order) intent.getSerializableExtra("com.example.quickserve.Order.class");
		
		burgers= customerOrder.getBurgers();
		toppings= customerOrder.getToppings();
		sides = customerOrder.getSides();
		ListIterator<String> it = burgers.listIterator();
		ListIterator<String> it2= toppings.listIterator();
		ListIterator<String> it3 = sides.listIterator();
		String a = "enditem";
		while(!burgers.isEmpty())
		{
			text.append("Burger: ");
			text.append(it.next());//first one
			it.remove();// remove it
			text.append(" ");//space

			text.append(it.next());//second one
			it.remove();// remove it
			text.append(" ");//space

			text.append(it.next());//third one
			it.remove();// remove it
			text.append(" ");//space
			text.append("\n");
			text.append("Toppings: ");
			while(!toppings.isEmpty())
			{
				text.append(" ");//space
				String b = it2.next();
				it2.remove();
				if(b.compareTo(a)==0)
					break;
				text.append(b);
			}
			
			
		}//end outter while
		text.append("\n");
		text.append("Sides: ");
		while(!sides.isEmpty())
		{
			text.append(" ");//space
			String c = it3.next();
			it3.remove();
			text.append(c);
		}
		
	}

	@Override
	public void onClick(View v) 
	{
		
		
	}

}