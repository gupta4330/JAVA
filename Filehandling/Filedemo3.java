class Filedemo3{
	public static void main(String[] args) {
		try{
			File f = new File("data.txt");
			FileWriter fout = new FileWriter(f);
			    BufferedWriter bout = new BufferedWriter(fout);
			    Scanner sc new = new Scanner(System.in);
			    boolean flag = true;
			    while(flag){
			    	System.out.println("Enter Serial No.");
			    	bout.write(Integer.toString(sc.nextInt()));
			    	bout.write(' ');
			    	System.out.println("Enter Name : ");
			    	bout.writer(sc.next());
			    	bout.write(' ');
			    	System.out.println("Enter CGPA : ");
			    	bout.write(Float.toString(sc.nextFloat()));
			    	bout.write(' ');
			    	System.out.println("Enter Grade : (A / B / C / D) ");
			    	bout.write(sc.next().charAt(0));

			    	bout.newLine();
			    	System.out.println("\nDo you want to continue entering data Y/N ");
			    	if(c=='n'|| c=='N'){
			    		flag = false;
			    	}
			    }

			    bout.close();
			    FileReader fin = new FileReader(f);
			    Bufferer Reader bin = new BufferedReader(fln);
			    String sr;
			    System.out.println("The contents of the file are : \n");
			    while((sr= bin.readLine())!=null){
			    	String[] strs = sr.split(" ");
			    	System.out.println((strs[0])+" "+ strs[1]+ " " +strs[2]+" " +strs[3]);
			    }
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
}