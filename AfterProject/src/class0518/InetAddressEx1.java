package class0518;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx1 {
	public static void main(String[] args) {
		try {
			InetAddress ipAddr = InetAddress.getByName("www.naver.com");
			
			System.out.println("getLocalHostName : "+ipAddr.getHostName());
			System.out.println("getLocalHostAddress : "+ipAddr.getHostAddress());
			System.out.println("toString : "+ipAddr.toString());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
