import java.io.File;

public class Exam_01 {
	public static void main(String[] args) throws Exception{
		//File f = new File("D:/7��_�ڹ������������.target.txt");
		File f = new File("D:/7��_�ڹ������������");		//����Ǹ��� �����°� �� ������ ������ �����������ϰ� �������� ������
		System.out.println(f.exists()); 			// f.exists() �� ������ �����ϴ����� ���°� // f�� .������ f�� �ּҷΰ� 
		System.out.println(f.isDirectory()); 		// f.isDirectory() �� ������ �����İ� ���°� 	
		System.out.println(f.getAbsolutePath());    // f.getAbsolutePath() �������ִ°��� Ǯ��� ������  
		System.out.println(f.getParent());   		// f.getParent() ������ �ֱ��������� ��α����� ������ 
		System.out.println(f.length());				// f.length() ������ ũ�� 
		//System.out.println(f.delete()); 			// f.delete() ��������� 
		//System.out.println(f.createNewFile()); 	// f.createNewFile() ���ϸ����
		
		File[] list = f.listFiles();		// �����ȿ� ���ϸ�ϵ��� �������迭�� list������ ����� 	
		for(File tmp : list){				// // for each����  for(�ڷ��� +���� : collection�̿�){}
			System.out.println(tmp.getName()+"\t\t\t" +  tmp.isDirectory());
		}			
	}	
}
