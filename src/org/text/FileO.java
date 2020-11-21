package org.text;

import java.io.File;
import java.io.IOException;

public class FileO {
	public static void main(String[] args) throws IOException {
//		File ref = new File("E:\\JavaPro\\FileOp\\create.txt");
//		boolean first = ref.createNewFile();
//		System.out.println(first);
//		
//		boolean Second = ref.isFile();
//		System.out.println(Second);
//		
//		boolean gg = ref.isHidden();
//		System.out.println(gg);
//		
//		boolean jh = ref.canRead();
//		System.out.println(jh);
//		
//		String df = ref.getAbsolutePath();
//		System.out.println(df);
//		
//		
//		boolean hj = ref.exists();
//		System.out.println(hj);
		
		File ref = new File("E:\\");
		File[] fi = ref.listFiles();
		for (File s : fi) {
			System.out.println(s);
			
		File ghj=new File("E:\\");
		String[] io = ghj.list();
			System.out.println(io);
		}
		
		
		
		
	}

}
