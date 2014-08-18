package apps.scavenger.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import apps.scavenger.activity.R;

public enum ColorEnum {
	RED("Red", R.drawable.nred, 0), 
	BLUE("Blue", R.drawable.nblue, 0), 
	GREEN("Green", R.drawable.ngreen, 0), 
	VIOLET("Violet", R.drawable.npurple, 0),
	GREY("Grey",R.drawable.ngrey,0),
	BROWN("Brown",R.drawable.nbrown,0);
	
	private static List<ColorEnum> VALUES = Arrays.asList(values());
	// private static final int SIZE = VALUES.size();
	private final String stringVersion;
	private final int resource;
	private int colorScore;
	
	public static List<ColorEnum> randomizeColorOrder() {
		Collections.shuffle(VALUES);
		return VALUES;
	}

	private ColorEnum(String str, int resource, int colorScore) {
		this.stringVersion = str;
		this.resource = resource;
		this.colorScore = colorScore;
	}

	public String getStringVersion() {
		return stringVersion;
	}

	public int getResource() {
		return resource;
	}

	public int getColorScore() {
		return colorScore;
	}

	public void setColorScore(int newScore) {
		colorScore = newScore;
		
	}

}
