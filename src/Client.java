import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Client {
	public static void main(String[] args) throws Exception {

		Socket client = new Socket("192.168.53.250",20500);	//소켓 생성 ("소켓번호입력",포트번호)

		InputStream is = client.getInputStream();		// 입력통로생성 
		DataInputStream dis = new DataInputStream(is);	// 기본인풋스트림을 업그레이드함 	

//		OutputStream os = client.getOutputStream();
//		DataOutputStream dos = new DataOutputStream(os); 
		
//		while(true){
		
			long fileSize = dis.readLong();	//파일 사이즈 수신 
			//System.out.println(fileSize);
			String fileName = dis.readUTF(); //파일 이름 수신 
			//System.out.println(fileName);
			
			
			byte[] fileContents = new byte[(int)fileSize];	//파일 사이즈만큼 배열 생성 
			dis.readFully(fileContents);		//소켓으로부터 파일 내용을 받아 배열에 저장 
			
			File target = new File("D:/7월_자바웹개발취업반/다운성공mp3"); // 타킷 위치 설정 
			FileOutputStream fos = new FileOutputStream(target); //타깃에대해 파일 출력스트림 개방 (파일받아온것은 ram에 저장되어 있기때문에 ram기준으로 outputstream을 개방해야한다)
			DataOutputStream dos = new DataOutputStream(fos);	//스트림 업그레이드 

			dos.write(fileContents);	//데이터 출력
			dos.flush();				//출력 플러시
			dos.close();				//연결 해제 
			
			
			
//			System.out.println(dis.readLong());
//			String msg = dis.readFully();			 //메세지온거 받기  
//			System.out.println(msg);			 //받은 메세지 출력
//			
//			dos.writeUTF(JOptionPane.showInputDialog("짝에게 할말"));
//			dos.flush();
//		}
	}
}
