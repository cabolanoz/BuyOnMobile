package ni.buyonmobile.android;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

/**
 * 
 * @author <a href="mailto:cesar20904@gmail.com">César Bolaños</a>
 *
 */
public class BuyOnMobileActivity extends Activity {
	
	private ProgressBar progressBar;
	private final Handler handler = new Handler();
	private int progressBarStatus = 0;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        initSplash();
    }
    
    private void initSplash() {
    	progressBar = (ProgressBar) findViewById(R.id.progressBar);
    	
    	new Thread( new Runnable() {
    		public void run() {
    			while (progressBarStatus < 100) {
    				progressBarStatus++;
    				
    				handler.post(new Runnable() {
    					public void run () {
    						progressBar.setProgress(progressBarStatus);
    					}
    				});
    			}
    		}
    	}).start();
    }
    
}