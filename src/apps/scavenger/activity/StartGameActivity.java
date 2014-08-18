package apps.scavenger.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import apps.scavenger.data.ColorEnum;
import apps.scavenger.data.GlobalState;

import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.google.analytics.tracking.android.StandardExceptionParser;
import com.google.analytics.tracking.android.Tracker;

//import gms.common.api.*;
import com.google.android.gms.common.api.*;
import com.google.example.games.basegameutils.BaseGameActivity;
import com.google.android.gms.games.Games;

//import com.google.example.games.basegameutils.BaseGameActivity;

public class StartGameActivity extends BaseGameActivity implements
		View.OnClickListener {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		findViewById(R.id.show_achievements).setOnClickListener(this);
		findViewById(R.id.show_leaderboard).setOnClickListener(this);

		findViewById(R.id.sign_in_button).setOnClickListener(this);
		findViewById(R.id.sign_out_button).setOnClickListener(this);

		// Games.Leaderboards.submitScore(getApiClient(), LB_ID, 12345);

	}

	public void startGame() {
		GlobalState.myScore = 0;
		Intent levelOne = new Intent(this, LevelActivity.class);
		GlobalState.randColorList = ColorEnum.randomizeColorOrder();
		startActivity(levelOne);
		EasyTracker.getInstance(this).activityStart(this);

	}

	public void goToHelp(View view) {
		Intent help = new Intent(this, Help.class);
		startActivity(help);

	}

	public void setEasy(View view) {
		GlobalState.taskDurationMili = 31000;
		startGame();
	}

	public void setMedium(View view) {
		GlobalState.taskDurationMili = 21000;
		startGame();
	}

	public void setHard(View view) {
		GlobalState.taskDurationMili = 11000;
		startGame();
	}

	public void setHigh(View view) {

		Intent levelHigh = new Intent(this, FinalScoreActivity.class);
		this.startActivity(levelHigh);
	}

	@Override
	public void onBackPressed() {
		moveTaskToBack(true);
	}

	public void onSignInSucceeded() {
		// show sign-out button, hide the sign-in button
		findViewById(R.id.sign_in_button).setVisibility(View.GONE);
		findViewById(R.id.sign_out_button).setVisibility(View.VISIBLE);

		// (your code here: update UI, enable functionality that depends on sign
		// in, etc)
	}

	public void onSignInFailed() {
		// Sign in has failed. So show the user the sign-in button.
		findViewById(R.id.sign_in_button).setVisibility(View.VISIBLE);
		findViewById(R.id.sign_out_button).setVisibility(View.GONE);
	}

	public void onLoad(long loadTime) {

		// May return null if EasyTracker has not been initialized with a
		// property
		// ID.
		Tracker easyTracker = EasyTracker.getInstance(this);

		easyTracker.send(MapBuilder.createTiming("resources", // Timing category
				// (required)
				loadTime, // Timing interval in milliseconds (required)
				"Start", // Timing name
				null) // Timing label
				.build());
	}

	@Override
	public void onClick(View view) {
		if (view.getId() == R.id.sign_in_button) {
			// start the asynchronous sign in flow
			beginUserInitiatedSignIn();
		} else if (view.getId() == R.id.sign_out_button) {

			signOut();

			// show sign-in button, hide the sign-out button
			findViewById(R.id.sign_in_button).setVisibility(View.VISIBLE);
			findViewById(R.id.sign_out_button).setVisibility(View.GONE);
		}

		else if (view.getId() == R.id.show_achievements) {

			if (getApiClient().isConnected()) {
				startActivityForResult(
						Games.Achievements
								.getAchievementsIntent(getApiClient()),
						1);
			} else {
				beginUserInitiatedSignIn();
			}
		} else if (view.getId() == R.id.show_leaderboard) {

			if (getApiClient().isConnected()) {
				startActivityForResult(Games.Leaderboards.getLeaderboardIntent(
						getApiClient(),
						getString(R.string.number_guesses_leaderboard)), 2);
			} else {
				beginUserInitiatedSignIn();
			}
		}
		int score = GlobalState.myScore;
		if (getApiClient().isConnected()) {

			Games.Leaderboards.submitScore(getApiClient(),
					getString(R.string.number_guesses_leaderboard),
					GlobalState.myScore);

			if (score > 10 && score < 20)
				Games.Achievements.increment(getApiClient(),
						getString(R.string.achievement_color), 50);
			else if (score > 20 && score < 40)

				Games.Achievements.unlock(getApiClient(),
						getString(R.string.achievement_2));
			else if (score > 40 && score < 60)

				Games.Achievements.unlock(getApiClient(),
						getString(R.string.achievement_3));
			else if (score > 60 && score < 80)

				Games.Achievements.unlock(getApiClient(),
						getString(R.string.achievement_4));

			else if (score > 80)

				Games.Achievements.unlock(getApiClient(),
						getString(R.string.achievement_5));

		}

	}

}