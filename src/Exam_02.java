import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam_02 {
	public static void main(String[] args)throws Exception {
//		ServerSocket server = new ServerSocket(20500);
//		while(true){
//			Socket sock = server.accept();
//			System.out.println(sock.getInetAddress() + "님이 연결");
//		}
		
		//하드디스크 파일 내용을 램으로 로딩하는 코드 
		//------------------------------------------------------------------------------------------------
		File target = new File("D:/7월_자바웹개발취업반/target.txt");		//타겟설정 
		FileInputStream fis = new FileInputStream(target);				//인풋스트림개방 
		DataInputStream dis = new DataInputStream(fis);					//업그레이드 
		
		byte[] fileContents = new byte[(int)target.length()];			//byte배열을 담을 공간생성 //lenght는 
	
		
		dis.readFully(fileContents);			// hdd에 있는 바이트배열형 파일읽기fileContents라는 byte배열을 담을 공간의 인자를 가지고서..
		dis.close();
		
		System.out.println(fileContents[3]);
		//------------------------------------------------------------------------------------------------
	}
}
