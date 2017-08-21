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

		Socket client = new Socket("192.168.53.250",20500);	//���� ���� ("���Ϲ�ȣ�Է�",��Ʈ��ȣ)

		InputStream is = client.getInputStream();		// �Է���λ��� 
		DataInputStream dis = new DataInputStream(is);	// �⺻��ǲ��Ʈ���� ���׷��̵��� 	

//		OutputStream os = client.getOutputStream();
//		DataOutputStream dos = new DataOutputStream(os); 
		
//		while(true){
		
			long fileSize = dis.readLong();	//���� ������ ���� 
			//System.out.println(fileSize);
			String fileName = dis.readUTF(); //���� �̸� ���� 
			//System.out.println(fileName);
			
			
			byte[] fileContents = new byte[(int)fileSize];	//���� �����ŭ �迭 ���� 
			dis.readFully(fileContents);		//�������κ��� ���� ������ �޾� �迭�� ���� 
			
			File target = new File("D:/7��_�ڹ������������/�ٿ��mp3"); // ŸŶ ��ġ ���� 
			FileOutputStream fos = new FileOutputStream(target); //Ÿ�꿡���� ���� ��½�Ʈ�� ���� (���Ϲ޾ƿ°��� ram�� ����Ǿ� �ֱ⶧���� ram�������� outputstream�� �����ؾ��Ѵ�)
			DataOutputStream dos = new DataOutputStream(fos);	//��Ʈ�� ���׷��̵� 

			dos.write(fileContents);	//������ ���
			dos.flush();				//��� �÷���
			dos.close();				//���� ���� 
			
			
			
//			System.out.println(dis.readLong());
//			String msg = dis.readFully();			 //�޼����°� �ޱ�  
//			System.out.println(msg);			 //���� �޼��� ���
//			
//			dos.writeUTF(JOptionPane.showInputDialog("¦���� �Ҹ�"));
//			dos.flush();
//		}
	}
}
