package class0518;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLEx2 {
	public static void main(String[]a) {
		try {
			URL site = new URL("https://www.naver.com");
			URLConnection con = site.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String readLine;
			while((readLine = in.readLine())!=null) {
				System.out.println(readLine);
			}
			
			in.close();
			
			
		} catch (MalformedURLException e) {
						e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
