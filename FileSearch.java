
class FileSearch{
	public static void main(String[] args){
	try{
	File f=new File(file.txt);
	FileReader fin = new Filereader(f);
	BufferReader bin  = new Bufferreader(fin);
	String search;
	System.out.println("Enter the word to search ");
	Scanner sc = new Scanner(System.in);
	search=sc.next();
	String sr;
	boolean flag=false;
	System.out.println("the contents of the file are ");
	while(sr=bin.readLine()!=null){
	System.out.print(sr);
	String[] strs= sr.split(" ");
	for(int i=;i<strs.length;i++){
	if(strs[i].equals(search)){
    flag = true;
    break;
	}
	}
	}
	if((sr=bin.readLine())==null && flag==false){
	System.out.print("Not present");
	}
	else{
	System.out.print("present");
	}
	catch(Exception e){
	e.printStackTrace();
	}
}