package org.bwgz.android.environment;

import org.bwgz.android.common.TwoLineListActivity;

import android.app.Activity;
import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import android.view.KeyEvent;

public class EnvironmentActivityTest extends ActivityInstrumentationTestCase2<EnvironmentActivity> {
	static private final String TAG = EnvironmentActivityTest.class.getSimpleName();
	
	private Instrumentation instrumentation;
	private Activity activity;
	private TwoLineListActivity list;
	
    public EnvironmentActivityTest() {
        super(EnvironmentActivity.class);
    }

    protected void setUp() throws Exception {
		super.setUp();
		
		instrumentation = getInstrumentation();
		activity = getActivity(); 
		assertNotNull(activity);
	}
	  
	public void aTest() {
	  /*
	   * request focus for the list, so that the test can send key events to it
	   * This request must be run on the UI thread. To do this, use the runOnUiThread method
	   * and pass it a Runnable that contains a call to requestFocus on the Spinner.
	   */
		activity.runOnUiThread(new Runnable() {
			public void run() {
				list.getListView().requestFocus();
			}
		});
	
	  instrumentation.waitForIdleSync();

	  sendKeys(KeyEvent.KEYCODE_DPAD_CENTER);
	}
}
