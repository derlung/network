package class0518;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class URLEx1 {
public static void main(String[]a) {
	try {
		URL url = new URL("http://www.codechobo.com:80/sample/hello.html");
		
		System.out.println("url.getAuthority() : "+url.getAuthority());
		System.out.println("url.getDefaultPort() : "+url.getDefaultPort());
		System.out.println("url.getPort() : "+url.getPort());
		System.out.println("url.getFile() : "+url.getFile());
		//호스트 명 
		System.out.println("url.getHost() : "+url.getHost());
		System.out.println("url.getPath()"+url.getPath());
		System.out.println("url.getProtocol() : "+url.getProtocol());
		System.out.println("url.getRef() : "+url.getRef());
		System.out.println("url.getUserInfo() : "+url.getUserInfo());

		// URL을 URI로 변환
		System.out.println("url.toURI() :"+url.toURI());
	} catch (URISyntaxException | MalformedURLException e) {
		
		e.printStackTrace();
	}
}
}
