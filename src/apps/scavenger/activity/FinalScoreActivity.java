package apps.scavenger.activity;

import java.util.ArrayList;
import java.util.List;

import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.google.analytics.tracking.android.StandardExceptionParser;
import com.google.analytics.tracking.android.Tracker;

import android.content.SharedPreferences;

import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

import com.google.analytics.tracking.android.EasyTracker;

import apps.scavenger.data.ColorEnum;
import apps.scavenger.data.GlobalState;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FinalScoreActivity extends Activity {

	// Views
	private ListView colorListView;
	private ListView scoreListView;
	// Color
	private List<ColorEnum> colorList;
	private ArrayAdapter<String> adapter;
	private ArrayList<String> listItems;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.finalscore);
		setBackground();
		colorList = GlobalState.randColorList;
		listItems = new ArrayList<String>();

		// get text view
		TextView scoreView = (TextView) findViewById(R.id.high_scores_list);

		SharedPreferences scorePrefs = getSharedPreferences(
				LevelActivity.GAME_PREFS, 0);
		String[] savedScores = scorePrefs.getString("highScores", "").split(
				"\\|");
		StringBuilder scoreBuild = new StringBuilder("");
		for (String score : savedScores) {
			scoreBuild.append(score + "\n");
		}
		scoreView.setText(scoreBuild.toString());
		// populateScores(colorList);

	}

	// private void populateScores(List<ColorEnum> list) {
	//
	// TextView colorText;
	// TextView scoreText;
	// ColorEnum currColor;
	// for (int i = 0; i < list.size(); i++) {
	// colorText = (TextView) colorListView.getChildAt(i);
	// scoreText = (TextView) scoreListView.getChildAt(i);
	// currColor = list.get(i);
	// colorText.setText(currColor.getStringVersion());
	// scoreText.setText(Integer.toString(currColor.getColorScore()));
	// }
	//
	// adapter = new ArrayAdapter<String>(this,
	// android.R.layout.simple_list_item_1, listItems);
	// colorListView.setAdapter(adapter);
	// }
	//
	// private void setBackground() {
	// RelativeLayout relLay = (RelativeLayout) findViewById(R.id.scoreLayout);
	// Drawable bg = relLay.getBackground();
	// bg.setAlpha(100);
	// }

	private void setBackground() {
		RelativeLayout relLay = (RelativeLayout) findViewById(R.id.scoreLayout);
		Drawable bg = relLay.getBackground();
		bg.setAlpha(100);
	}

	@Override
	public void onStart() {
		super.onStart();
		// The rest of your onStart() code.
		EasyTracker.getInstance(this).activityStart(this); // Add this method.
	}

	@Override
	public void onStop() {
		super.onStop();
		// The rest of your onStop() code.
		EasyTracker.getInstance(this).activityStop(this); // Add this method.
	}

	@Override
	public void onBackPressed() {
		Intent restart = new Intent(this, StartGameActivity.class);
		startActivity(restart);
	}

	public void start(View view) {
		Intent menu = new Intent(this, StartGameActivity.class);
		startActivity(menu);
	}

	public void onLoad(long loadTime) {

		// May return null if EasyTracker has not been initialized with a
		// property
		// ID.
		Tracker easyTracker = EasyTracker.getInstance(this);

		easyTracker.send(MapBuilder.createTiming("resources", // Timing category
																// (required)
				loadTime, // Timing interval in milliseconds (required)
				"HighScore", // Timing name
				null) // Timing label
				.build());
	}
	// @Override
	// public boolean onCreateOptionsMenu(Menu menu) {
	// getMenuInflater().inflate(R.menu.main, menu);
	// return true;
	// }

}
