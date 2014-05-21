package course.labs.activitylab;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends Activity {

	private static final String RESTART_KEY = "restart";
	private static final String RESUME_KEY = "resume";
	private static final String START_KEY = "start";
	private static final String CREATE_KEY = "create";

	// String for LogCat documentation
	private final static String TAG = "Lab-ActivityTwo";

	// Lifecycle counters
	TextView mTvCreate, mTvRestart, mTvStart, mTvResume;
	// TODO:
	// Create counter variables for onCreate(), onRestart(), onStart() and
	// onResume(), called mCreate, etc.
	// You will need to increment these variables' values when their
	// corresponding lifecycle methods get called


	int mCreate, mStart, mResume, mRestart;
	// TODO: Create variables for each of the TextViews, called
        // mTvCreate, etc. 


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
		
		mTvCreate = (TextView) findViewById(R.id.create);
		mTvStart = (TextView) findViewById(R.id.start);
		mTvResume = (TextView) findViewById(R.id.resume);
		mTvRestart = (TextView) findViewById(R.id.restart);

		// TODO: Assign the appropriate TextViews to the TextView variables
		// Hint: Access the TextView by calling Activity's findViewById()
		// textView1 = (TextView) findViewById(R.id.textView1);





		Button closeButton = (Button) findViewById(R.id.bClose); 
		closeButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				finish();
				// TODO:
				// This function closes Activity Two
				// Hint: use Context's finish() method
										}
		});

		// Check for previously saved state
		if (savedInstanceState != null) {
			mRestart = savedInstanceState.getInt(RESTART_KEY);
			mResume = savedInstanceState.getInt(RESUME_KEY);
			mStart = savedInstanceState.getInt(START_KEY);
			mCreate = savedInstanceState.getInt(CREATE_KEY);
			// TODO:
			// Restore value of counters from saved state
			// Only need 4 lines of code, one for every count variable
		}
		else
		{
		 mRestart = 0;
		 mResume = 0;
		 mStart = 0;
		 mCreate = 0;
		}
		Log.i("Variable","The variable work has been done,i.e.,assignment and initialization.Currently in activity two");

		// TODO: Emit LogCat message
		
		mCreate++;
	    displayCounts();

		// TODO:
		// Update the appropriate count variable
		// Update the user interface via the displayCounts() method




	}

	// Lifecycle callback methods overrides

	@Override
	public void onStart() {
		super.onStart();
		Log.i("Lab-ActivityTwo", "Entered the onStart() method");
		mStart++;
		displayCounts();

		// TODO: Emit LogCat message


		// TODO:
		// Update the appropriate count variable
		// Update the user interface



	}

	@Override
	public void onResume() {
		super.onResume();
		Log.i("Lab-ActivityTwo", "Entered the onResume() method");
		mResume++;
		displayCounts();

		// TODO: Emit LogCat message


		// TODO:
		// Update the appropriate count variable
		// Update the user interface




	}

	@Override
	public void onPause() {
		super.onPause();
		Log.i("Lab-ActivityTwo", "Entered the onPause() method");
	

		// TODO: Emit LogCat message



	}

	@Override
	public void onStop() {
		super.onStop();
		Log.i("Lab-ActivityTwo", "Entered the onStop() method");
		
		// TODO: Emit LogCat message



	}

	@Override
	public void onRestart() {
		super.onRestart();
		Log.i("Lab-ActivityTwo", "Entered the onRestart() method");
		mRestart++;
		displayCounts();

		// TODO: Emit LogCat message


		// TODO:
		// Update the appropriate count variable
		// Update the user interface



	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.i("Lab-ActivityTwo", "Entered the onDestroy() method");
		
		// TODO: Emit LogCat message

	}

	@Override
	public void onSaveInstanceState(Bundle savedInstanceState) {

		// TODO:
		// Save counter state information with a collection of key-value pairs
		// 4 lines of code, one for every count variable
		savedInstanceState.putInt(RESTART_KEY, mRestart);
		savedInstanceState.putInt(RESUME_KEY, mResume);
		savedInstanceState.putInt(START_KEY, mStart);
		savedInstanceState.putInt(CREATE_KEY, mCreate);
		super.onSaveInstanceState(savedInstanceState);	
	}

	// Updates the displayed counters
	public void displayCounts() {

		mTvCreate.setText("onCreate() calls: " + mCreate);
		mTvStart.setText("onStart() calls: " + mStart);
		mTvResume.setText("onResume() calls: " + mResume);
		mTvRestart.setText("onRestart() calls: " + mRestart);
	
	}
}
