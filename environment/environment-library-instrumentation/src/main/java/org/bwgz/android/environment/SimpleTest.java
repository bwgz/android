package org.bwgz.android.environment;

import android.test.AndroidTestCase;
import android.util.Log;

public class SimpleTest extends AndroidTestCase {
	static private final String TAG = SimpleTest.class.getSimpleName();

    protected void setUp() throws Exception {
		super.setUp();
	}
    
    public void TestOne() {
    	Log.d(TAG, "this is a test");
    	
    }
}
