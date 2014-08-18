package apps.scavenger.activity;

public class Score implements Comparable<Score> {

	private String sDate;
	public int score;

	public Score(String date, int num) {

		sDate = date;
		score = num;
	}

	/**
	 * Sorting scores Sort in Descending order
	 */
	public int compareTo(Score sc) {
		return sc.score > score ? 1 : sc.score < score ? -1 : 0;
	}

	public String getScoreText() {
		return sDate + " - " + score;
	}
}
