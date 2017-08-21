import java.io.File;

public class Exam_01 {
	public static void main(String[] args) throws Exception{
		//File f = new File("D:/7월_자바웹개발취업반.target.txt");
		File f = new File("D:/7월_자바웹개발취업반");		//제어권만을 가져온것 이 파일의 내용은 가져오지못하고 정보들을 가져옴
		System.out.println(f.exists()); 			// f.exists() 이 파일이 존재하는지를 묻는것 // f에 .찍으면 f의 주소로감 
		System.out.println(f.isDirectory()); 		// f.isDirectory() 이 파일이 폴더냐고 묻는것 	
		System.out.println(f.getAbsolutePath());    // f.getAbsolutePath() 파일이있는곳의 풀경로 꺼내기  
		System.out.println(f.getParent());   		// f.getParent() 파일이 있기전까지의 경로까지만 꺼내옴 
		System.out.println(f.length());				// f.length() 파일의 크기 
		//System.out.println(f.delete()); 			// f.delete() 파일지우기 
		//System.out.println(f.createNewFile()); 	// f.createNewFile() 파일만들기
		
		File[] list = f.listFiles();		// 폴더안에 파일목록들을 파일형배열의 list변수에 담았음 	
		for(File tmp : list){				// // for each구문  for(자료형 +변수 : collection이옴){}
			System.out.println(tmp.getName()+"\t\t\t" +  tmp.isDirectory());
		}			
	}	
}
