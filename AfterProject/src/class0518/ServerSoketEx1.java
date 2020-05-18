package class0518;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSoketEx1 {
	public static void main(String[]a) {
		
		//socket : 프로세스간의 통신에 사용되는 양쪽 끝단을 의미함
		
		//서버에서는 서버소켓을 사용해서 서버 컴퓨터의 특정 포트에서
		//클라이언트의 연결 요청을 처리할 준비하기
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5001);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//클라이언트는 접속할 서버의 ip주소와 포트 정보를 가지고
		//소켓을 생성해서 서버에 연결 요청하기
		
		while(true) {
			System.out.println("클라이언트의 요청 기다림");
			//서버 소켓은 클라이언트의 연결 요청을 받으면 서버에 새로운
			//소켓을 생성해서 클라이언트의 소켓과 연결
			Socket socket;
			try {
				socket = serverSocket.accept();
				System.out.println(socket.getInetAddress()+"로 연결 요청 들어옴");
				//클라이언트의 소켓과 새로 생성된 서버 소켓은 서버 소켓과
				//상관없이 일대일 통신
				
				//소켓에 쓰기 위한 출력 스트림 얻기
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF("서버가 보내는 메세지: Hello");
				
				//클라이언트가 보낸 메시지 읽기
				InputStream in = socket.getInputStream();
				DataInputStream dis = new DataInputStream(in);
				System.out.println(dis.readUTF());
				
				
				dos.close();
				dis.close();
				socket.close();
								
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
