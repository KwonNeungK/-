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
//			System.out.println(sock.getInetAddress() + "���� ����");
//		}
		
		//�ϵ��ũ ���� ������ ������ �ε��ϴ� �ڵ� 
		//------------------------------------------------------------------------------------------------
		File target = new File("D:/7��_�ڹ������������/target.txt");		//Ÿ�ټ��� 
		FileInputStream fis = new FileInputStream(target);				//��ǲ��Ʈ������ 
		DataInputStream dis = new DataInputStream(fis);					//���׷��̵� 
		
		byte[] fileContents = new byte[(int)target.length()];			//byte�迭�� ���� �������� //lenght�� 
	
		
		dis.readFully(fileContents);			// hdd�� �ִ� ����Ʈ�迭�� �����б�fileContents��� byte�迭�� ���� ������ ���ڸ� ������..
		dis.close();
		
		System.out.println(fileContents[3]);
		//------------------------------------------------------------------------------------------------
	}
}
