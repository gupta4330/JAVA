import java.io.*;
import java.util.*;

class FileSearch{
	public static void main(String[] args) {
		try{
			File f = new File("file1.txt");
			FileWriter fin = new FileWriter(f);
			    BufferedReader bin = new BufferedReader(fin);
			    String search;
			    System.out.println("Enter the word to search: ");
			    Scanner sc = new Scanner(System.in);
			    search sc.next();
			    String sr;
			    boolean flag = false;
			    System.out.println("The contents of the file are : ");
                while ((sr=bin.readLine())!=null){
                	System.out.println(sr);
                	String[] strs = sr.split(" ");
                	for (int i = 0 ;i,strs.length ;i++) {
                		if (strs[i].equals(search)){
                			flag=true;
                			break;
                		}
                		
                	}
                }
            }
                if ((sr=bin.readLine())==null&&flag==false) {
                	System.out.println("\nNot Present");}
                	else{
                		System.out.println("\nPresent");
                	}
                	
                
                catch(Exception e){
                	e.printStackTrace();

                }





	}

	
	}
