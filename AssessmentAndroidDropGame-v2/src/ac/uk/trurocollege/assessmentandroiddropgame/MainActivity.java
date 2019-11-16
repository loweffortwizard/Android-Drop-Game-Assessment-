package ac.uk.trurocollege.assessmentandroiddropgame;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onTouchEvent (MotionEvent event){
		ImageView player = (ImageView)findViewById(R.id.imageView1);
		//player is imageView1
		//object ImageView has the var player which has the value of imageView1 
		
		float theX = event.getX();
		//var theX has the value of imageView1 X position 
		
		player.setX(theX);
		//setting player the new x
		//var theX is given to the player.setX - moving the player to the position
		
		return true;
		//do this
		
	}//end of onTouchEvent


}//end of program
