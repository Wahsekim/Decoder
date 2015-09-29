import java.io.*;

import Decoder.sut.Decoder;
import java.net.URL;
import java.net.URLClassLoader;

public class Application {

	public static void main(String[] args) {
		{

			String file = "";
			if (args.length > 0)
				file = args[0];
			else
				System.out.println("File should be input");

			BufferedReader in = null;
			try {
				in = new BufferedReader(new FileReader("src/" + file));
			} catch (FileNotFoundException e) {
				System.out.println("Can't find file.");
			}
			String[] substrings;
			String line;
			try {
				while ((line = in.readLine()) != null) {
					substrings = line.split("/");
					System.out.println(Decoder.decode(substrings[24]));
				}
			} catch (IOException e) {
				e.printStackTrace();

			}
			 ClassLoader cl = ClassLoader.getSystemClassLoader();

		        URL[] urls = ((URLClassLoader)cl).getURLs();

		        for(URL url: urls){
		        	System.out.println(url.getFile());
		        }
		         
		}

	}
}
