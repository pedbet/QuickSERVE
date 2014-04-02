package com.example.quickserve;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AddMain extends Activity implements OnClickListener {
	
	
	Order customerOrder;
	


	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addmain);
		
		Button combo = (Button) findViewById(R.id.addmain_b1);
		Button burger = (Button) findViewById(R.id.addmain_b2);
		Button side = (Button) findViewById(R.id.addmain_b3);
		Button drink = (Button) findViewById(R.id.addmain_b4);
		
		combo.setOnClickListener(this);
		burger.setOnClickListener(this);
		side.setOnClickListener(this);
		drink.setOnClickListener(this);
		
		customerOrder = new Order();// create an empty object class
		
		Button cancel = (Button) findViewById(R.id.addmaincancel);
		Button review = (Button) findViewById(R.id.addmainreview);
		Button confirm = (Button) findViewById(R.id.addmainconfirmm);
		
		cancel.setOnClickListener(this);
		review.setOnClickListener(this);
		confirm.setOnClickListener(this);
		
	}

	
	@Override
	public void onClick(View v) {
		//what happens when each button is clicked
		if(v.getId() == R.id.addmain_b1){
			// start the add combo activity
			customerOrder.setCombo(true);
			Intent intent1 = new Intent(AddMain.this,AddCombo.class);			
			intent1.putExtra("com.example.quickserve.Order.class", customerOrder);
            startActivity(intent1);
           
			
		}
		
		else if (v.getId() == R.id.addmain_b2)
		{
			customerOrder.setCombo(false);	
			Intent intent2 = new Intent(AddMain.this,AddCombo.class);			
			intent2.putExtra("com.example.quickserve.Order.class", customerOrder);
            startActivity(intent2);
		}
		
		else if (v.getId() == R.id.addmain_b3)
		{
			Intent intent3 = new Intent(AddMain.this,AddSides.class);			
			intent3.putExtra("com.example.quickserve.Order.class", customerOrder);
            startActivity(intent3);
		}
		
		else if (v.getId() == R.id.addmain_b4)
		{			
			customerOrder.addDrink();
			
		}
		
		else if (v.getId() == R.id.addmaincancel)
		{			
			// Kill activity return to main activity
			
		}
		
		else if (v.getId() == R.id.addmainreview)
		{			
			// go to order screen
			
		}
		
		else if (v.getId() == R.id.addmainconfirmm)
		{			
			// Check if an order has been placed
			// Start the confirm screen activity
			
		}
		
	}//end onClick
}
