package class0518;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx1 {
	public static void main(String[]a) {
		//클라이언트는 접속할 서버의 ip주소와 포트 정보를 가지고
		//소켓을 생성해서 서버에 연결 요청하기
		Socket socket=  null;
		String serverIp = "127.0.0.1";
		try {
			System.out.println("클라이언트 연결 요청");
			socket = new Socket(serverIp,5001);
			if(socket!=null) {
				System.out.println("연결 성공");
			}			
			//서버가 보낸 메세지 읽기
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("서버가 보내는 메시지 :"+dis.readUTF());
			
			//서버로 메시지 보내기
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF("안녕하세요 클라이언트입니다.");
			
			dos.close();
			dis.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}	
