/**
 * 
 */

/**
 * @author Hannah Ku, TempConvert, 8/31/16, 2nd Period
 * this program converts a temperature from fahrenheit to celcius.
 */
public class FtoC {
	public static void main(String[] args){
		tempconvert(32);
	}
	
	public static int tempconvert(int fahrenheitTemp){
		int celciusTemp = (fahrenheitTemp - 32) * 5/9;
		return(celciusTemp);
	}
}

