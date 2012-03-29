package ni.buyonmobile.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 
 * @author <a href="mailto:cesar20904@gmail.com">César Bolaños</a>
 *
 */
public class OrderActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		TextView textView = new TextView(this);
		textView.setText("This is the order tab");
		setContentView(textView);
	}
	
}
