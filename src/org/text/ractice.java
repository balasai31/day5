package org.text;

import java.io.File;
import java.io.IOException;


	public static void main(String[] args) throws IOException {
		
		
		//file oeration
		
		
		File f=new File("F;\\file 0eration");
		
		
		
		boolean b=f.mkdir();
		System.out.println(b);
		
		
		File d=new File("F;\\CREATE FILE\\FILE2\\FILE3\\create.jpeg");
		
		
		boolean c=d.createNewFile();
		System.out.println(c);
		
		
//		boolean s=d.isFile();
//		System.out.println(s);
//		
//		
//				
//		boolean v=f.isFile();
//		System.out.println(v);
//		
//		boolean n=d.canRead();	
//		System.out.println(n);
//		
//		
//		boolean m= d.canWrite();
//		System.out.println(m);
//		
//		d.getAbsolutePath();
//		System.out.println();
//		
		
		
		
	
	
	
	
	
	
	
	
	}
	
	
	
	

}
