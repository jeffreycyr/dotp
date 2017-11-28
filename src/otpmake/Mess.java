package otpmake;

import java.util.Random;

//import randomengine.rand;


public class Mess {
	
	public static String in(String source) {
		String otp = "";
		//System.out.println(source.length());
		for (int i = 0; i < source.length(); i++){
			char bitsout = rand(source.charAt(i));
			//System.out.println(Character.valueOf(bitsout));
			otp = otp + bitsout;
		}
		return otp;
		
	}
	
	public static String garble(String mess, String otpin){
		String out = "";
		for (int i=0;i<mess.length();i++){
			out = out + Character.valueOf((char) (mess.charAt(i) ^ otpin.charAt(i)));
		}
		return out;
		
	}
	public static char rand(long seed){
		//System.out.println(seed);
		Random number = new Random();
		number.setSeed(number.nextLong()^seed);
		for (int i = 0;i < (seed);i++){
			number.nextInt();
		}
		return (char) number.nextInt();
	}	

}
