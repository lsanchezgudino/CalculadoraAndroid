package com.example.calculadorae;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,beq,borr;
	EditText Textet;
	float val1;
	float val2;
	float val3;
	boolean add,sub,div,mul;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		  b1=(Button) findViewById(R.id.button1);
		  b2=(Button) findViewById(R.id.button2);
		  b3=(Button) findViewById(R.id.button3);
		  b4=(Button) findViewById(R.id.button4);
		  b5=(Button) findViewById(R.id.button5);
		  b6=(Button) findViewById(R.id.button6);
		  b7=(Button) findViewById(R.id.button7);
		  b8=(Button) findViewById(R.id.button8);
		  b9=(Button) findViewById(R.id.button9);
		  b0=(Button) findViewById(R.id.button0);
		  bdot=(Button) findViewById(R.id.buttonPunto);
		  badd=(Button) findViewById(R.id.buttonMas);
		  bsub=(Button) findViewById(R.id.buttonMenos);
		  bmul=(Button) findViewById(R.id.buttonPor);
		  bdiv=(Button) findViewById(R.id.buttonEntre);
		  beq=(Button) findViewById(R.id.buttonIgual);
		  borr=(Button) findViewById(R.id.buttonBorrar);
		  Textet =(EditText) findViewById(R.id.editText1);
		  
		  b1.setOnClickListener(new View.OnClickListener() {
			   @Override
			   public void onClick(View v) {
				   Textet.setText(Textet.getText()+"1");
			   }
			  });
			  b2.setOnClickListener(new View.OnClickListener() {
			   @Override
			   public void onClick(View v) {
				   Textet.setText(Textet.getText()+"2");
			   }
			  });
			  b3.setOnClickListener(new View.OnClickListener() {
			   @Override
			   public void onClick(View v) {
				   Textet.setText(Textet.getText()+"3");

			   }
			  });
			  b4.setOnClickListener(new View.OnClickListener() {
			   @Override
			   public void onClick(View v) {
				   Textet.setText(Textet.getText()+"4");
			   }
			  });
			  b5.setOnClickListener(new View.OnClickListener() {
			   @Override
			   public void onClick(View v) {
				   Textet.setText(Textet.getText()+"5");
			   }
			  });
			  b6.setOnClickListener(new View.OnClickListener() {
			   @Override
			   public void onClick(View v) {
				   Textet.setText(Textet.getText()+"6");
			   }
			  });
			  b7.setOnClickListener(new View.OnClickListener() {
			   @Override
			   public void onClick(View v) {
				   Textet.setText(Textet.getText()+"7");
			   }
			  });
			  b8.setOnClickListener(new View.OnClickListener() {
			   @Override
			   public void onClick(View v) {
				   Textet.setText(Textet.getText()+"8");
			   }
			  });
			  b9.setOnClickListener(new View.OnClickListener() {
			   @Override
			   public void onClick(View v) {
				   Textet.setText(Textet.getText()+"9");
			   }
			  });
			  b0.setOnClickListener(new View.OnClickListener() {
			   @Override
			   public void onClick(View v) {
				   Textet.setText(Textet.getText()+"0");
			   }
			  });
			  bdot.setOnClickListener(new View.OnClickListener() {
			   @Override
			   public void onClick(View v) {
				   Textet.setText(Textet.getText()+".");
			   }
			  });
			  borr.setOnClickListener(new View.OnClickListener() {
				   @Override
				   public void onClick(View v) {
					   Textet.setText(null);
				   }
				  });
			  
			 badd.setOnClickListener(new View.OnClickListener() {
			  
			  @Override
			  public void onClick(View v) {
				   val1=Float.parseFloat(Textet.getText()+"");
				   add=true;
				   Textet.setText(null);
			  }
			 });
			bsub.setOnClickListener(new View.OnClickListener() {
			  
			  @Override
			  public void onClick(View v) {
				  val1=Float.parseFloat(Textet.getText()+"");
				  sub=true;
				  Textet.setText(null);
			  }
			 });
			bdiv.setOnClickListener(new View.OnClickListener() {
			 
			 @Override
			 public void onClick(View v) {
				 val1=Float.parseFloat(Textet.getText()+"");
				  div=true;
				  Textet.setText(null);
			 }
			});
			bmul.setOnClickListener(new View.OnClickListener() {
			 
			 @Override
			 public void onClick(View v) {
				 val1=Float.parseFloat(Textet.getText()+"");
				  mul=true;
				  Textet.setText(null);
			 }
			});

			beq.setOnClickListener(new View.OnClickListener() {
			 
			 @Override
			 public void onClick(View v) {
			  val2=Float.parseFloat(Textet.getText()+"");
			  if (add==true) {
				  val3 = val1+val2;
				  Textet.setText(val3 + "");
			   add=false; 
			  }
			  if (sub==true) {
				  val3 = val1-val2;
				  Textet.setText(val3 + "");
			   sub=false; 
			  }
			  if (mul==true) {
				  val3 = val1*val2;
				  Textet.setText(val3 + "");
			   mul=false; 
			  }
			  if (div==true) {
				  val3 = val1/val2;
				  Textet.setText(val3 + "");
			   div=false; 
			  }
			 }
			 
			});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
