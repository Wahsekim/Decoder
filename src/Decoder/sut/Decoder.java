/**
 * Le decoder 
 * @author Mike
 *
 */
package Decoder.sut;
public class Decoder {
	/**
	 * methode static pour decoder d'un string 
	 * @param input le string a decoder
	 * @return
	 */
	public static String decode(String input) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < input.length(); i += 2) {
			String str = input.substring(i, i + 2);
			try {
				res.append((char) Integer.parseInt(str, 16));
			} catch (Exception e) {
				System.out.println("NumberFormatException.message broken" );
				break ;
			}
		}

		return res.toString();
	}
}
