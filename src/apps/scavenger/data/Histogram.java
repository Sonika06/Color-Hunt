package apps.scavenger.data;

import android.graphics.Bitmap;
import android.graphics.Color;

public class Histogram {

	private Bitmap bitmap;
	private int redPixels;
	private int greenPixels;
	private int bluePixels;
	private int violetPixels;
	private int greyPixels;
	private int brownPixels;

	public Histogram(Bitmap bmp) {
		bitmap = bmp;
		generateHistogram(bitmap);
	}

	public int getRedPixels() {
		return redPixels;
	}

	public int getBrownPixels() {
		return brownPixels;
	}

	public int getGreyPixels() {
		return greyPixels;
	}

	public int getGreenPixels() {
		return greenPixels;
	}

	public int getBluePixels() {
		return bluePixels;
	}

	public int getVioletPixels() {
		return violetPixels;
	}

	private void generateHistogram(Bitmap bmp) {
		// bitmap = bmp;
		int width = bitmap.getWidth();
		int height = bitmap.getHeight();
		// size = width * height;

		for (int i = 0; i < width; i += 2) {
			for (int j = 0; j < height; j += 2) {
				int pixColor = bmp.getPixel(i, j);

				// int pixColor = bitmap.getPixel(i, j);

				if (isRedZero(pixColor)) {
					if (isGreenZero(pixColor)) {
						if (isBlueZero(pixColor)) {
							greyPixels++;
						} else if (isBlueOne(pixColor)) {
							bluePixels++;
						} else if (isBlueTwo(pixColor)) {
							bluePixels++;
						} else if (isBlueThree(pixColor)) {
							bluePixels++;
						} else if (isBlueFour(pixColor)) {
							bluePixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					} else if (isGreenOne(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
						} else if (isBlueOne(pixColor)) {
							bluePixels++;
						} else if (isBlueTwo(pixColor)) {
							bluePixels++;
						} else if (isBlueThree(pixColor)) {
							bluePixels++;
						} else if (isBlueFour(pixColor)) {
							bluePixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					} else if (isGreenTwo(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
						} else if (isBlueOne(pixColor)) {
							greenPixels++;
						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
						} else if (isBlueThree(pixColor)) {
							bluePixels++;
							greenPixels++;
						} else if (isBlueFour(pixColor)) {
							bluePixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
							violetPixels++;
						}
					}

					else if (isGreenThree(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
						} else if (isBlueOne(pixColor)) {
							greenPixels++;
						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
						} else if (isBlueThree(pixColor)) {
							bluePixels++;
						} else if (isBlueFour(pixColor)) {
							bluePixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					}

					else if (isGreenFour(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
						} else if (isBlueOne(pixColor)) {
							greenPixels++;
						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
						} else if (isBlueThree(pixColor)) {
							greenPixels++;
						} else if (isBlueFour(pixColor)) {
							bluePixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					}

					else if (isGreenFive(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
						} else if (isBlueOne(pixColor)) {
							greenPixels++;
						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
						} else if (isBlueThree(pixColor)) {
							greenPixels++;
						} else if (isBlueFour(pixColor)) {
							greenPixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					}

				}

				if (isRedFour(pixColor)) {
					if (isGreenZero(pixColor)) {
						if (isBlueZero(pixColor)) {
							redPixels++;
						} else if (isBlueOne(pixColor)) {
							violetPixels++;
						} else if (isBlueTwo(pixColor)) {
							violetPixels++;
						} else if (isBlueThree(pixColor)) {
							violetPixels++;
							redPixels++;
						} else if (isBlueFour(pixColor)) {
							violetPixels++;
						} else if (isBlueFive(pixColor)) {
							violetPixels++;
						}
					} else if (isGreenOne(pixColor)) {
						if (isBlueZero(pixColor)) {
							redPixels++;
						} else if (isBlueOne(pixColor)) {
							redPixels++;
						} else if (isBlueTwo(pixColor)) {
							violetPixels++;
						} else if (isBlueThree(pixColor)) {
							violetPixels++;
						} else if (isBlueFour(pixColor)) {
							violetPixels++;
						} else if (isBlueFive(pixColor)) {
							violetPixels++;
						}
					} else if (isGreenTwo(pixColor)) {
						if (isBlueZero(pixColor)) {
							brownPixels++;
						} else if (isBlueOne(pixColor)) {
							// replace
							greenPixels++;
						} else if (isBlueTwo(pixColor)) {
							violetPixels++;
						} else if (isBlueThree(pixColor)) {
							violetPixels++;
						} else if (isBlueFour(pixColor)) {
							violetPixels++;
						} else if (isBlueFive(pixColor)) {
							violetPixels++;
						}
					} else if (isGreenThree(pixColor)) {
						if (isBlueZero(pixColor)) {
							brownPixels++;
						} else if (isBlueOne(pixColor)) {
							brownPixels++;
						} else if (isBlueTwo(pixColor)) {
							brownPixels++;
						} else if (isBlueThree(pixColor)) {
							violetPixels++;

						} else if (isBlueFour(pixColor)) {
							violetPixels++;
						} else if (isBlueFive(pixColor)) {
							violetPixels++;
						}
					}

					else if (isGreenFour(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
						} else if (isBlueOne(pixColor)) {
							greenPixels++;
						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
							// replace
						} else if (isBlueThree(pixColor)) {
							brownPixels++;
						} else if (isBlueFour(pixColor)) {
							bluePixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					}

					else if (isGreenFive(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
						} else if (isBlueOne(pixColor)) {
							greenPixels++;
						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
						} else if (isBlueThree(pixColor)) {
							greenPixels++;
						} else if (isBlueFour(pixColor)) {
							greenPixels++;
						}

						else if (isBlueFive(pixColor)) {
							violetPixels++;
							bluePixels++;
						}
					}

				}

				if (isRedFive(pixColor)) {
					if (isGreenZero(pixColor)) {
						if (isBlueZero(pixColor)) {
							redPixels++;
						} else if (isBlueOne(pixColor)) {
							redPixels++;
							violetPixels++;
						} else if (isBlueTwo(pixColor)) {
							// also
							violetPixels++;
							redPixels++;
						} else if (isBlueThree(pixColor)) {
							violetPixels++;
							redPixels++;
						} else if (isBlueFour(pixColor)) {
							violetPixels++;
						} else if (isBlueFive(pixColor)) {
							violetPixels++;
						}
					} else if (isGreenOne(pixColor)) {
						if (isBlueZero(pixColor)) {
							redPixels++;
						} else if (isBlueOne(pixColor)) {
							redPixels++;
						} else if (isBlueTwo(pixColor)) {
							violetPixels++;
						} else if (isBlueThree(pixColor)) {
							redPixels++;
						} else if (isBlueFour(pixColor)) {
							violetPixels++;
						} else if (isBlueFive(pixColor)) {
							violetPixels++;
						}
					} else if (isGreenTwo(pixColor)) {
						if (isBlueZero(pixColor)) {
							brownPixels++;
						} else if (isBlueOne(pixColor)) {
							bluePixels++;
						} else if (isBlueTwo(pixColor)) {
							redPixels++;
						} else if (isBlueThree(pixColor)) {
							violetPixels++;
							redPixels++;
						} else if (isBlueFour(pixColor)) {
							violetPixels++;
							redPixels++;
						} else if (isBlueFive(pixColor)) {
							violetPixels++;
						}
					} else if (isGreenThree(pixColor)) {
						if (isBlueZero(pixColor)) {
							redPixels++;
						} else if (isBlueOne(pixColor)) {
							brownPixels++;
						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
						} else if (isBlueThree(pixColor)) {
							redPixels++;
						} else if (isBlueFour(pixColor)) {
							redPixels++;
						} else if (isBlueFive(pixColor)) {
							violetPixels++;
						}
					}

					else if (isGreenFour(pixColor)) {
						if (isBlueZero(pixColor)) {
							redPixels++;
						} else if (isBlueOne(pixColor)) {
							brownPixels++;
						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
						} else if (isBlueThree(pixColor)) {
							brownPixels++;
						} else if (isBlueFour(pixColor)) {
							violetPixels++;
							redPixels++;
						} else if (isBlueFive(pixColor)) {
							violetPixels++;
						}
					}

					else if (isGreenFive(pixColor)) {
						if (isBlueZero(pixColor)) {
							brownPixels++;
						} else if (isBlueOne(pixColor)) {
							redPixels++;
						} else if (isBlueTwo(pixColor)) {
							brownPixels++;
						} else if (isBlueThree(pixColor)) {
							greenPixels++;
						} else if (isBlueFour(pixColor)) {
							brownPixels++;
						} else if (isBlueFive(pixColor)) {
							violetPixels++;
							bluePixels++;

						}
					}

				}

				if (isRedOne(pixColor)) {
					if (isGreenZero(pixColor)) {
						if (isBlueZero(pixColor)) {
							redPixels++;
						} else if (isBlueOne(pixColor)) {
							violetPixels++;
						} else if (isBlueTwo(pixColor)) {
							violetPixels++;
						} else if (isBlueThree(pixColor)) {
							violetPixels++;
						} else if (isBlueFour(pixColor)) {
							violetPixels++;
						} else if (isBlueFive(pixColor)) {
							violetPixels++;
							bluePixels++;
						}
					} else if (isGreenOne(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
						} else if (isBlueOne(pixColor)) {
							greyPixels++;
						} else if (isBlueTwo(pixColor)) {
							bluePixels++;
						} else if (isBlueThree(pixColor)) {
							violetPixels++;
							bluePixels++;
						} else if (isBlueFour(pixColor)) {
							bluePixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					} else if (isGreenTwo(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;

						} else if (isBlueOne(pixColor)) {
							greenPixels++;
						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
						} else if (isBlueThree(pixColor)) {
							bluePixels++;
						} else if (isBlueFour(pixColor)) {
							bluePixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					} else if (isGreenThree(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
						} else if (isBlueOne(pixColor)) {
							greenPixels++;
						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
							bluePixels++;
						} else if (isBlueThree(pixColor)) {
							bluePixels++;
						} else if (isBlueFour(pixColor)) {
							bluePixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					}

					else if (isGreenFour(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
						} else if (isBlueOne(pixColor)) {

						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
						} else if (isBlueThree(pixColor)) {
							greenPixels++;
						} else if (isBlueFour(pixColor)) {
							bluePixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					}

					else if (isGreenFive(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
						} else if (isBlueOne(pixColor)) {

						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
						} else if (isBlueThree(pixColor)) {
							greenPixels++;
						} else if (isBlueFour(pixColor)) {
							greenPixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					}

				}

				if (isRedTwo(pixColor)) {
					if (isGreenZero(pixColor)) {
						if (isBlueZero(pixColor)) {
							redPixels++;
						} else if (isBlueOne(pixColor)) {
							greyPixels++;
						} else if (isBlueTwo(pixColor)) {

						} else if (isBlueThree(pixColor)) {
							violetPixels++;
						} else if (isBlueFour(pixColor)) {
							violetPixels++;
						} else if (isBlueFive(pixColor)) {
							violetPixels++;
							bluePixels++;
						}
					} else if (isGreenOne(pixColor)) {
						if (isBlueZero(pixColor)) {
							brownPixels++;
						} else if (isBlueOne(pixColor)) {
							greyPixels++;
						} else if (isBlueTwo(pixColor)) {
							greyPixels++;
						} else if (isBlueThree(pixColor)) {
							violetPixels++;
						} else if (isBlueFour(pixColor)) {
							violetPixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					} else if (isGreenTwo(pixColor)) {
						if (isBlueZero(pixColor)) {
							brownPixels++;
						} else if (isBlueOne(pixColor)) {
							greyPixels++;
						} else if (isBlueTwo(pixColor)) {
							greyPixels++;
						} else if (isBlueThree(pixColor)) {
							bluePixels++;
						} else if (isBlueFour(pixColor)) {

							bluePixels++;
							violetPixels++;
						} else if (isBlueFive(pixColor)) {

							bluePixels++;
						}
					} else if (isGreenThree(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
						} else if (isBlueOne(pixColor)) {
							greenPixels++;
						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
						} else if (isBlueThree(pixColor)) {
							bluePixels++;
						} else if (isBlueFour(pixColor)) {
							bluePixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					}

					else if (isGreenFour(pixColor)) {
						if (isBlueZero(pixColor)) {

						} else if (isBlueOne(pixColor)) {
							greenPixels++;
						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
						} else if (isBlueThree(pixColor)) {

						} else if (isBlueFour(pixColor)) {
							bluePixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					}

					else if (isGreenFive(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
						} else if (isBlueOne(pixColor)) {

						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
						} else if (isBlueThree(pixColor)) {
							bluePixels++;
						} else if (isBlueFour(pixColor)) {
							greenPixels++;
							bluePixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					}

				}

				if (isRedThree(pixColor)) {
					if (isGreenZero(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
							redPixels++;
							violetPixels++;
						} else if (isBlueOne(pixColor)) {
							violetPixels++;
							redPixels++;
						} else if (isBlueTwo(pixColor)) {
							violetPixels++;
						} else if (isBlueThree(pixColor)) {
							violetPixels++;
						} else if (isBlueFour(pixColor)) {
							violetPixels++;
						} else if (isBlueFive(pixColor)) {
							violetPixels++;
							bluePixels++;
						}
					} else if (isGreenOne(pixColor)) {
						if (isBlueZero(pixColor)) {
							brownPixels++;
						} else if (isBlueOne(pixColor)) {
							redPixels++;
						} else if (isBlueTwo(pixColor)) {
							violetPixels++;
						} else if (isBlueThree(pixColor)) {
							violetPixels++;
						} else if (isBlueFour(pixColor)) {
							violetPixels++;
						} else if (isBlueFive(pixColor)) {
							violetPixels++;
						}
					}

					else if (isGreenTwo(pixColor)) {
						if (isBlueZero(pixColor)) {
							brownPixels++;
						} else if (isBlueOne(pixColor)) {
							brownPixels++;
						} else if (isBlueTwo(pixColor)) {
							redPixels++;
						} else if (isBlueThree(pixColor)) {
							violetPixels++;
						} else if (isBlueFour(pixColor)) {
							violetPixels++;
						} else if (isBlueFive(pixColor)) {
							violetPixels++;
							bluePixels++;
						}
					}

					else if (isGreenThree(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
						} else if (isBlueOne(pixColor)) {
							greenPixels++;
						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
						} else if (isBlueThree(pixColor)) {
							violetPixels++;
						} else if (isBlueFour(pixColor)) {
							greyPixels++;
						} else if (isBlueFive(pixColor)) {
							greyPixels++;
						}
					}

					else if (isGreenFour(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
						} else if (isBlueOne(pixColor)) {
							greenPixels++;
						} else if (isBlueTwo(pixColor)) {
							greenPixels++;
						} else if (isBlueThree(pixColor)) {
							greenPixels++;
						} else if (isBlueFour(pixColor)) {
							greenPixels++;
							bluePixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					}

					else if (isGreenFive(pixColor)) {
						if (isBlueZero(pixColor)) {
							greenPixels++;
						} else if (isBlueOne(pixColor)) {

						} else if (isBlueTwo(pixColor)) {

						} else if (isBlueThree(pixColor)) {
							greenPixels++;
						} else if (isBlueFour(pixColor)) {
							greenPixels++;
							bluePixels++;
						} else if (isBlueFive(pixColor)) {
							bluePixels++;
						}
					}
				}

			}
		}
	}

	// 51 102 127 153 204 255
	// 51
	private boolean isRedZero(int pixCol) {
		int redValue = Color.red(pixCol);
		return redValue < 52;
	}

	// 102
	private boolean isRedOne(int pixCol) {
		int redValue = Color.red(pixCol);
		return redValue > 51 && redValue < 103;
	}

	// 153
	private boolean isRedTwo(int pixCol) {
		int redValue = Color.red(pixCol);
		return redValue > 102 && redValue < 128;
	}

	private boolean isRedThree(int pixCol) {
		int redValue = Color.red(pixCol);
		return redValue > 127 && redValue < 154;
	}

	// 204
	private boolean isRedFour(int pixCol) {
		int redValue = Color.red(pixCol);
		return redValue > 153 && redValue < 205;
	}

	// 255
	private boolean isRedFive(int pixCol) {
		int redValue = Color.red(pixCol);
		return redValue > 204 && redValue < 256;
	}

	private boolean isBlueZero(int pixCol) {
		int blueValue = Color.blue(pixCol);
		return blueValue < 52;
	}

	private boolean isBlueOne(int pixCol) {
		int blueValue = Color.blue(pixCol);
		return blueValue > 51 && blueValue < 103;
	}

	private boolean isBlueTwo(int pixCol) {
		int blueValue = Color.blue(pixCol);
		return blueValue > 102 && blueValue < 128;
	}

	private boolean isBlueThree(int pixCol) {
		int blueValue = Color.blue(pixCol);
		return blueValue > 127 && blueValue < 154;
	}

	// 204
	private boolean isBlueFour(int pixCol) {
		int blueValue = Color.blue(pixCol);
		return blueValue > 153 && blueValue < 205;
	}

	// 255
	private boolean isBlueFive(int pixCol) {
		int blueValue = Color.blue(pixCol);
		return blueValue > 204 && blueValue < 256;
	}

	private boolean isGreenZero(int pixCol) {
		int greenValue = Color.green(pixCol);
		return greenValue < 52;
	}

	private boolean isGreenOne(int pixCol) {
		int greenValue = Color.green(pixCol);
		return greenValue > 51 && greenValue < 103;
	}

	private boolean isGreenTwo(int pixCol) {
		int greenValue = Color.green(pixCol);
		return greenValue > 102 && greenValue < 128;
	}

	private boolean isGreenThree(int pixCol) {
		int greenValue = Color.green(pixCol);
		return greenValue > 127 && greenValue < 154;
	}

	// 204
	private boolean isGreenFour(int pixCol) {
		int greenValue = Color.green(pixCol);
		return greenValue > 153 && greenValue < 205;
	}

	// 255
	private boolean isGreenFive(int pixCol) {
		int greenValue = Color.green(pixCol);
		return greenValue > 204 && greenValue < 256;
	}

}
