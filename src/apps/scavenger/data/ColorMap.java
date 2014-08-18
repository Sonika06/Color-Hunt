package apps.scavenger.data;

import android.graphics.Color;

public class ColorMap {
	private static ColorMap instance;

	private final int BUCKETS = 4;
	private final int BUCKET_SIZE = 256 / BUCKETS;

	/**
	 * 3-dimensional array acting as key to determining pixel color
	 * classification First index is Red level, second index is Green level,
	 * third index is Blue level
	 */
	private ColorEnum[][][] colorArray;

	protected ColorMap() {
		// prevent instantiation
	}

	private void populateColorMap() {

		colorArray = new ColorEnum[5][5][5];
		// RED ZERO
		colorArray[0][0][0] = ColorEnum.GREY;
		colorArray[0][0][1] = ColorEnum.BLUE;
		colorArray[0][0][2] = ColorEnum.BLUE;
		colorArray[0][0][3] = ColorEnum.BLUE;
		colorArray[0][0][4] = ColorEnum.BLUE;
		colorArray[0][0][5] = ColorEnum.BLUE;
		
		colorArray[0][1][0] = ColorEnum.GREEN;
		colorArray[0][1][1] = ColorEnum.BLUE;
		colorArray[0][1][2] = ColorEnum.BLUE;
		colorArray[0][1][3] = ColorEnum.BLUE;
		colorArray[0][1][4] = ColorEnum.BLUE;
		colorArray[0][1][5] = ColorEnum.BLUE;
		
		colorArray[0][2][0] = ColorEnum.GREEN;
		colorArray[0][2][1] = ColorEnum.GREEN;
		colorArray[0][2][2] = ColorEnum.GREEN;
		colorArray[0][2][3] = ColorEnum.BLUE;//ADD green
		colorArray[0][2][4] = ColorEnum.BLUE;
		colorArray[0][2][5] = ColorEnum.BLUE;//addblue//add violet
		
		colorArray[0][3][0] = ColorEnum.GREEN;
		colorArray[0][3][1] = ColorEnum.GREEN;
		colorArray[0][3][2] = ColorEnum.GREEN;
		colorArray[0][3][3] = ColorEnum.BLUE;
		colorArray[0][3][4] = ColorEnum.BLUE;
		colorArray[0][3][5] = ColorEnum.BLUE;
		
		colorArray[0][4][0] = ColorEnum.GREEN;
		colorArray[0][4][1] = ColorEnum.GREEN;
		colorArray[0][4][2] = ColorEnum.GREEN;
		colorArray[0][4][3] = ColorEnum.GREEN;
		colorArray[0][4][4] = ColorEnum.BLUE;
		colorArray[0][4][5] = ColorEnum.BLUE;
		
		colorArray[0][5][0] = ColorEnum.GREEN;
		colorArray[0][5][1] = ColorEnum.GREEN;
		colorArray[0][5][2] = ColorEnum.GREEN;
		colorArray[0][5][3] = ColorEnum.GREEN;
		colorArray[0][5][4] = ColorEnum.GREEN;
		colorArray[0][5][5] = ColorEnum.BLUE;
		
		
		// RED 1	
		
		colorArray[1][0][0] = ColorEnum.RED;
		colorArray[1][0][1] = ColorEnum.VIOLET;
		colorArray[1][0][2] = ColorEnum.VIOLET;
		colorArray[1][0][3] = ColorEnum.VIOLET;
		colorArray[1][0][4] = ColorEnum.VIOLET;
		colorArray[1][0][5] = ColorEnum.VIOLET;//ADD BLUE
		
		colorArray[1][1][0] = ColorEnum.GREEN;
		colorArray[1][1][1] = ColorEnum.GREY;
		colorArray[1][1][2] = ColorEnum.BLUE;
		colorArray[1][1][3] = ColorEnum.VIOLET; //add blue
		colorArray[1][1][4] = ColorEnum.BLUE;
		colorArray[1][1][5] = ColorEnum.BLUE;
		
		colorArray[1][2][0] = ColorEnum.GREEN;
		colorArray[1][2][1] = ColorEnum.GREEN;
		colorArray[1][2][2] = ColorEnum.GREEN;
		colorArray[1][2][3] = ColorEnum.BLUE;
		colorArray[1][2][4] = ColorEnum.BLUE;
		colorArray[1][2][5] = ColorEnum.BLUE;
		
		colorArray[1][3][0] = ColorEnum.GREEN;
		colorArray[1][3][1] = ColorEnum.GREEN;
		colorArray[1][3][2] = ColorEnum.GREEN;//add blue and green
		colorArray[1][3][3] = ColorEnum.BLUE;
		colorArray[1][3][4] = ColorEnum.BLUE;
		colorArray[1][3][5] = ColorEnum.BLUE;
		
		colorArray[1][4][0] = ColorEnum.GREEN;
		//colorArray[1][4][1] = ColorEnum.
		colorArray[1][4][2] = ColorEnum.GREEN;
		colorArray[1][4][3] = ColorEnum.GREEN;
		colorArray[1][4][4] = ColorEnum.BLUE;
		colorArray[1][4][5] = ColorEnum.BLUE;
		
		colorArray[1][5][0] = ColorEnum.GREEN;
		//colorArray[1][5][1] = ColorEnum.
		colorArray[1][5][2] = ColorEnum.GREEN;
		colorArray[1][5][3] = ColorEnum.GREEN;
		colorArray[1][5][4] = ColorEnum.GREEN;
		colorArray[1][5][5] = ColorEnum.BLUE;
		
	//red 2
		colorArray[2][0][0] = ColorEnum.RED;
		colorArray[2][0][1] = ColorEnum.GREY;
		//colorArray[2][0][2] = ColorEnum.
		colorArray[2][0][3] = ColorEnum.VIOLET;
		colorArray[2][0][4] = ColorEnum.VIOLET;
		colorArray[2][0][5] = ColorEnum.VIOLET;//addblue
		
		colorArray[2][1][0] = ColorEnum.BROWN;
		colorArray[2][1][1] = ColorEnum.GREY;
		colorArray[2][1][2] = ColorEnum.GREY;
		colorArray[2][1][3] = ColorEnum.VIOLET;
		colorArray[2][1][4] = ColorEnum.VIOLET;
		colorArray[2][1][5] = ColorEnum.BLUE;
		
		colorArray[2][2][0] = ColorEnum.BROWN;//YELLOW
		colorArray[2][2][1] = ColorEnum.GREY;
		colorArray[2][2][2] = ColorEnum.GREY;
		colorArray[2][2][3] = ColorEnum.BLUE;
		colorArray[2][2][4] = ColorEnum.BLUE;//ADDVIOLET
		colorArray[2][2][5] = ColorEnum.BLUE;
	
		colorArray[2][3][0] = ColorEnum.GREEN;
		colorArray[2][3][1] = ColorEnum.GREEN;
		colorArray[2][3][2] = ColorEnum.GREEN;
		colorArray[2][3][3] = ColorEnum.BLUE;
		colorArray[2][3][4] = ColorEnum.BLUE;
		colorArray[2][3][5] = ColorEnum.BLUE;
		
//		colorArray[2][4][0] = ColorEnum.
		colorArray[2][4][1] = ColorEnum.GREEN;
		colorArray[2][4][2] = ColorEnum.GREEN;
		//colorArray[2][4][3] = ColorEnum.
		colorArray[2][4][4] = ColorEnum.BLUE;
		colorArray[2][4][5] = ColorEnum.BLUE;
		
		colorArray[2][5][0] = ColorEnum.GREEN;
//		colorArray[2][5][1] = ColorEnum.
		colorArray[2][5][2] = ColorEnum.GREEN;
		colorArray[2][5][3] = ColorEnum.BLUE;
		colorArray[2][5][4] = ColorEnum.GREEN;//add greenAND BLUE
		colorArray[2][5][5] = ColorEnum.BLUE;
	
		
		//red 3
		
		colorArray[3][0][0] = ColorEnum.RED;//CHANGEDGREENaddviolet too and red
		colorArray[3][0][1] = ColorEnum.VIOLET;//add red
		colorArray[3][0][2] = ColorEnum.VIOLET;
		colorArray[3][0][3] = ColorEnum.VIOLET;
		colorArray[3][0][4] = ColorEnum.VIOLET;
		colorArray[3][0][5] = ColorEnum.VIOLET;//add blue
	
		colorArray[3][1][0] = ColorEnum.BROWN;
		colorArray[3][1][1] = ColorEnum.RED;
		colorArray[3][1][2] = ColorEnum.VIOLET;
		colorArray[3][1][3] = ColorEnum.VIOLET;
		colorArray[3][1][4] = ColorEnum.VIOLET;
		colorArray[3][1][5] = ColorEnum.VIOLET;
		
		colorArray[3][2][0] = ColorEnum.BROWN;
		colorArray[3][2][1] = ColorEnum.BROWN;
		colorArray[3][2][2] = ColorEnum.RED;
		colorArray[3][2][3] = ColorEnum.VIOLET;
		colorArray[3][2][4] = ColorEnum.VIOLET;
		colorArray[3][2][5] = ColorEnum.VIOLET;//ADD blue and violet
		
		colorArray[3][3][0] = ColorEnum.GREEN;
		colorArray[3][3][1] = ColorEnum.GREEN;
		colorArray[3][3][2] = ColorEnum.GREEN;
		colorArray[3][3][3] = ColorEnum.VIOLET;
		colorArray[3][3][4] = ColorEnum.GREY;
		colorArray[3][3][5] = ColorEnum.GREY;
	
		colorArray[3][4][0] = ColorEnum.GREEN;
		colorArray[3][4][1] = ColorEnum.GREEN;
		colorArray[3][4][2] = ColorEnum.GREEN;
		colorArray[3][4][3] = ColorEnum.GREEN;
		colorArray[3][4][4] = ColorEnum.GREEN;//BLUE ADD
		colorArray[3][4][5] = ColorEnum.BLUE;
	
		colorArray[3][5][0] = ColorEnum.GREEN;
//		colorArray[3][5][1] = ColorEnum.
//		colorArray[3][5][2] = ColorEnum.
		colorArray[3][5][3] = ColorEnum.GREEN;
		colorArray[3][5][4] = ColorEnum.GREEN;//ADD BLUE
		colorArray[3][5][5] = ColorEnum.BLUE;

		
		//red 4
		colorArray[4][0][0] = ColorEnum.RED;
		colorArray[4][0][1] = ColorEnum.VIOLET;
		colorArray[4][0][2] = ColorEnum.VIOLET;
		colorArray[4][0][3] = ColorEnum.VIOLET;//add red
		colorArray[4][0][4] = ColorEnum.VIOLET;//LEFT
		colorArray[4][0][5] = ColorEnum.VIOLET;
		
		colorArray[4][1][0] = ColorEnum.RED;//BROWN//ADD red//ORANGE
		colorArray[4][1][1] = ColorEnum.RED;//add red ,brown,ORANGE
		colorArray[4][1][2] = ColorEnum.VIOLET;
		colorArray[4][1][3] = ColorEnum.VIOLET;
		colorArray[4][1][4] = ColorEnum.VIOLET;
		colorArray[4][1][5] = ColorEnum.VIOLET;
		
		colorArray[4][2][0] = ColorEnum.BROWN;
		colorArray[4][2][1] = ColorEnum.BROWN; //ADD GREEN
		colorArray[4][2][2] = ColorEnum.VIOLET;
		colorArray[4][2][3] = ColorEnum.VIOLET;
		colorArray[4][2][4] = ColorEnum.VIOLET;
		colorArray[4][2][5] = ColorEnum.VIOLET;

		colorArray[4][3][0] = ColorEnum.BROWN;//CHANGETOYELLOW
		colorArray[4][3][1] = ColorEnum.BROWN;//YELLPOW
		colorArray[4][3][2] = ColorEnum.BROWN;
		colorArray[4][3][3] = ColorEnum.VIOLET;
		colorArray[4][3][4] = ColorEnum.VIOLET;
		colorArray[4][3][5] = ColorEnum.VIOLET;
	
		colorArray[4][4][0] = ColorEnum.GREEN;
		colorArray[4][4][1] = ColorEnum.GREEN;//ORANGE,BROWN
		colorArray[4][4][2] = ColorEnum.GREEN;
		colorArray[4][4][3] = ColorEnum.BROWN;
		colorArray[4][4][4] = ColorEnum.BLUE;
		colorArray[4][4][5] = ColorEnum.BLUE;
	
		colorArray[4][5][0] = ColorEnum.GREEN;
		colorArray[4][5][1] = ColorEnum.GREEN;
		colorArray[4][5][2] = ColorEnum.GREEN;
		colorArray[4][5][3] = ColorEnum.GREEN;
		colorArray[4][5][4] = ColorEnum.GREEN;
		colorArray[4][5][5] = ColorEnum.VIOLET;//add blue
		
		//red 5
		colorArray[5][0][0] = ColorEnum.RED;
		colorArray[5][0][1] = ColorEnum.RED;//ADDVIOLET
		colorArray[5][0][2] = ColorEnum.VIOLET; //add  violet and red
		colorArray[5][0][3] = ColorEnum.VIOLET; //add red
		colorArray[5][0][4] = ColorEnum.VIOLET;
		colorArray[5][0][5] = ColorEnum.VIOLET;
		
		colorArray[5][1][0] = ColorEnum.RED;
		colorArray[5][1][1] = ColorEnum.RED;
		colorArray[5][1][2] = ColorEnum.VIOLET;
		colorArray[5][1][3] = ColorEnum.RED;
		colorArray[5][1][4] = ColorEnum.VIOLET;
		colorArray[5][1][5] = ColorEnum.VIOLET;
		
		colorArray[5][2][0] = ColorEnum.BROWN;//ORANGE
		colorArray[5][2][1] = ColorEnum.BLUE;
		colorArray[5][2][2] = ColorEnum.RED;
		colorArray[5][2][3] = ColorEnum.VIOLET; //add red
		colorArray[5][2][4] = ColorEnum.VIOLET;//ADD RED
		colorArray[5][2][5] = ColorEnum.VIOLET;
		
		colorArray[5][3][0] = ColorEnum.RED;//CHANGEDBROWN//ORANGE
		colorArray[5][3][1] = ColorEnum.BROWN;//ORANGE
		colorArray[5][3][2] = ColorEnum.GREEN;
		colorArray[5][3][3] = ColorEnum.RED;
		colorArray[5][3][4] = ColorEnum.RED;
		colorArray[5][3][5] = ColorEnum.VIOLET;
	
		colorArray[5][4][0] = ColorEnum.RED;//CHENAGEDBROWN//ORANGE,YELLOW
		colorArray[5][4][1] = ColorEnum.BROWN;//ORANGE,YELLOW
		colorArray[5][4][2] = ColorEnum.GREEN;
		colorArray[5][4][3] = ColorEnum.BROWN;//ORANGE
		colorArray[5][4][4] = ColorEnum.VIOLET; //add red
		colorArray[5][4][5] = ColorEnum.VIOLET;
	
		colorArray[5][5][0] = ColorEnum.BROWN;//YELLOW
		colorArray[5][5][1] = ColorEnum.RED;//YELLOW//CHANGED BROWN
		colorArray[5][5][2] = ColorEnum.BROWN;//YELLOW
		colorArray[5][5][3] = ColorEnum.GREEN;
		colorArray[5][5][4] = ColorEnum.BROWN;//ORANGE
		colorArray[5][5][5] = ColorEnum.VIOLET;//add blue
	
		
	
	}

	public static ColorMap getInstance() {
		if (instance == null) {
			instance = new ColorMap();
			instance.populateColorMap();
		}
		return instance;
	}

	public String getColorFromInt(int rawColorValue) {
		int red = Color.red(rawColorValue);
		int green = Color.green(rawColorValue);
		int blue = Color.blue(rawColorValue);

		return getColorFromValue(red, green, blue);
	}

	private String getColorFromValue(int r, int g, int b) {
		return colorArray[bucketIndex(r)][bucketIndex(g)][bucketIndex(b)]
				.getStringVersion();
	}

	private int bucketIndex(int colorChannelValue) {
		return (int) Math.floor(colorChannelValue / BUCKET_SIZE);
	}
}
