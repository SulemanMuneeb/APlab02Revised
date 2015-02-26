import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class arithmatic {

	public static void main(String[] args) {
		String [][] term= new String[2][2];
		  
		String [] torres = new String[2];
		torres[0]="";
		torres[1]="";
		String [] torres_value = new String[2];
		torres_value[0]="";
		torres_value[1]="";
		//String [ ] values2 = new String[10];
		String [ ] operators= new String[10];
		int [] result = new int[10];
		
		 String vari=null;
		 String  checker1="";
		 String checker2="";
		 String eq=null;
		 String inttempe="";
		 int inte1=0;
		 int inte2=0;
		 String opLook="";
		 int spaceloca =0;
		 int length=0;
		 int row=0;
		 int col=0;
		 File file = new File("D:/labs/APlab02/file.txt");
		 FileInputStream fis = null;
		 BufferedInputStream bis = null;
		 DataInputStream dis = null;
		 String var1="";
     	String var2="";
     	int count = 0;
     	int count1 = 0;
     	String value1="";
     	String value2="";
    try {
        fis = new FileInputStream(file);

        // Here BufferedInputStream is added for fast reading.
        bis = new BufferedInputStream(fis);
        dis = new DataInputStream(bis);
        int variable_loc=0;
        
        // dis.available() returns 0 if the file does not have more lines.
        while (dis.available() != 0) {
        	int i=0;
        	String exp="";
        	String variable="";
        	 // this statement reads the line from the file and print it to
          // the console.
      	  String temp=dis.readLine();
      	//Unit test for file read is ok!
      	 //  System.out.println(temp);
      	   if(temp.contains(" "))
      	   {
      	  spaceloca=temp.indexOf(" ");
      	  length=temp.length();
      	  eq=temp.substring(spaceloca+1,length);
      	//unit test for eq extraction
      	//System.out.println(eq);
      	  variable_loc=0;
    	   variable_loc = eq.indexOf("=");
    	   length=eq.length();
    	  
    	 variable =eq.substring(0,variable_loc);
    	 byte[] bytes3= variable.getBytes("US-ASCII");
     	//	System.out.println("byte1 "+ bytes1);
     	if((bytes3[0]>=48 && bytes3[0]<=57)){
     		System.out.println("Wrong Declaration! " );
         		
     	}
    	 exp=eq.substring(variable_loc+1, length);
    	 torres[row]=variable; 
    	 term[row][col]=variable;
    	  col++;
    	  term[row][col]=exp;
    	  torres_value[row]=exp;
    	  row++;
    	  col=0;
    	  
    
    	//System.out.println(variable);
    	//System.out.println(exp);
      	   }
      	   
      	   
      		eq=temp;
      		 variable_loc=0;
      	   	variable_loc = eq.indexOf("=");
      	   	length=eq.length();
      	   	variable =eq.substring(0,variable_loc);
      	  	exp=eq.substring(variable_loc+1, length);
      	 // 	System.out.println(variable);
      	//	System.out.println(exp);
      	   
      	  	if(exp.contains("+"))
      	  	{
      	   //String add="+";
      	   int plus_loca=0;
      	   plus_loca=exp.indexOf("+");
      	   length=exp.length();
      	   checker1=exp.substring(0,plus_loca);
      	   checker2=exp.substring(plus_loca+1,length);
      		//System.out.println("checker1:"+checker1);
          	//System.out.println(checker2[0]);
      		String var3= torres[0];
      	  	String var4= torres[1];
      	
    	  
    	 if(checker1!="") {
    	byte[] bytes= checker1.getBytes("US-ASCII");
    	//	System.out.println("byte "+ bytes);
    	byte[] bytes1= checker2.getBytes("US-ASCII");
    	//	System.out.println("byte1 "+ bytes1);
    	if((bytes[0]>=48 && bytes[0]<=57) && (bytes1[0]>=48 && bytes1[0]<=57) ){
    		//System.out.println("byte "+ bytes[0]);
    		//System.out.println("byte1 "+ bytes1[0]);
    		value1=checker1;
    		value2=checker2;
    	
    	}
    	else{
    		if((bytes[0]>=48 && bytes[0]<=57) ){
    			
    			value1=checker1;
    		}
    		else if(var3.equals(checker1)  ){
      		count++;
      		//System.out.println("count: "+count);
      		value1= torres_value[0];
      	//	System.out.println("var3 _value(checker1): "+value1);
          	
      	    }
    		else if(var3.equals(checker2)){
      		count++;
      		//System.out.println("var3 checker2 count: "+count);
      		value1=torres_value[0];
      	//	System.out.println("var3_value(checker2): "+value2); 	
      	}
      	else 
      	{
      			
      		if (var3.equals(checker1))
          	{
          		//System.out.println("var4 checker2 count1: ");
          		value1=torres_value[0];
          	//System.out.println("var3_value(checker1): "); 	
          	}
      		else if(var3.equals(checker2)){
      			
          		//System.out.println("var4 checker1 count1: "+count1);
          		value1=torres_value[0];
          	//	System.out.println("var4 checker2 count1: ");
          	//	System.out.println("var3_value(checker2): "); 	
          		
          	}
      		else if(var4.equals(checker1)){
      			
          		//System.out.println("var4 checker1 count1: "+count1);
          		value1=torres_value[1];
          		//System.out.println("var4 checker2 count1: ");
          	//	System.out.println("var4_value(checker1): "); 	
          		
          	}
      		else if(var4.equals(checker2)){
      			
          		//System.out.println("var4 checker1 count1: "+count1);
          		value1=torres_value[0];
          	//	System.out.println("var4 checker2 count1: ");
          //		System.out.println("var4_value(checker2): "); 	
          		
          	} else{
          		
          		value1=checker1;
              		
          	}     		
      		//value1=torres_value[1];
      			
      			//System.out.println("var3_value(checker1): "); 
      		//the one odd number	
      		
      		
      	}
      	if((bytes1[0]>=48 && bytes1[0]<=57)){
      		value2=checker2;
      		
      	}
      	else if (var4.equals(checker2))
      	{
      		//System.out.println("var4 checker2 count1: "+count1);
      		value2=torres_value[1];
     	//	System.out.println("var4_value(checker2): "); 	
      	}else if(var4.equals(checker1)){
      		
      		//System.out.println("var4 checker1 count1: "+count1);
      		value2=torres_value[1];
      	//	System.out.println("var4_value(checker1): "); 	
      	}
      	else 
      	{
      		
      		value1=checker1;
      		
      
      	}
      	if(!(bytes[0]>=48 && bytes[0]<=57) || (bytes1[0]>=48 && bytes1[0]<=57)){
      		
      		//value1=torres_value[0];
      		//value2=torres_value[1];
      	}
      	
    	}
    	 
    	 }
    		System.out.println("value1: "+value1 + " + " + "value2: "+value2); 
    		//System.out.println("value2: "+value2);
    		 int ju1 = Integer.parseInt(value1);
    		 int ju2 = Integer.parseInt(value2);
    		 int res=0;
    		res =ju1+ju2;
    		System.out.println(" Result: "+ " "+variable+" " + " = " + res);
    		
    		System.out.println();
    		
      	  	}
      	  
      	  	/////////////////////////////
      	  	
      		if(exp.contains("-"))
      	  	{
      	   //String add="+";
      	   int plus_loca=0;
      	   plus_loca=exp.indexOf("-");
      	   length=exp.length();
      	   checker1=exp.substring(0,plus_loca);
      	   checker2=exp.substring(plus_loca+1,length);
      		//System.out.println("checker1:"+checker1);
          	//System.out.println(checker2[0]);
      		String var3= torres[0];
      	  	String var4= torres[1];
      	
    	  
    	 if(checker1!="") {
    	byte[] bytes= checker1.getBytes("US-ASCII");
    	//	System.out.println("byte "+ bytes);
    	byte[] bytes1= checker2.getBytes("US-ASCII");
    	//	System.out.println("byte1 "+ bytes1);
    	if((bytes[0]>=48 && bytes[0]<=57) && (bytes1[0]>=48 && bytes1[0]<=57) ){
    		//System.out.println("byte "+ bytes[0]);
    		//System.out.println("byte1 "+ bytes1[0]);
    		value1=checker1;
    		value2=checker2;
    	
    	}
    	else{
    		if((bytes[0]>=48 && bytes[0]<=57) ){
    			
    			value1=checker1;
    		}
    		else if(var3.equals(checker1)  ){
      		count++;
      		//System.out.println("count: "+count);
      		value1= torres_value[0];
      		//System.out.println("var3 _value(checker1): "+value1);
          	
      	    }
    		else if(var3.equals(checker2)){
      		count++;
      		//System.out.println("var3 checker2 count: "+count);
      		value1=torres_value[0];
      		//System.out.println("var3_value(checker2): "+value2); 	
      	}
      	else 
      	{
      			
      		if (var3.equals(checker1))
          	{
          		//System.out.println("var4 checker2 count1: ");
          		value1=torres_value[0];
          	//System.out.println("var3_value(checker1): "); 	
          	}
      		else if(var3.equals(checker2)){
      			
          		//System.out.println("var4 checker1 count1: "+count1);
          		value1=torres_value[0];
          	//	System.out.println("var4 checker2 count1: ");
          		//System.out.println("var3_value(checker2): "); 	
          		
          	}
      		else if(var4.equals(checker1)){
      			
          		//System.out.println("var4 checker1 count1: "+count1);
          		value1=torres_value[1];
          		//System.out.println("var4 checker2 count1: ");
          		//System.out.println("var4_value(checker1): "); 	
          		
          	}
      		else if(var4.equals(checker2)){
      			
          		//System.out.println("var4 checker1 count1: "+count1);
          		value1=torres_value[0];
          	//	System.out.println("var4 checker2 count1: ");
          		//System.out.println("var4_value(checker2): "); 	
          		
          	} else{
          		
          		value1=checker1;
              		
          	}     		
      		//value1=torres_value[1];
      			
      			//System.out.println("var3_value(checker1): "); 
      		//the one odd number	
      		
      		
      	}
      	if((bytes1[0]>=48 && bytes1[0]<=57)){
      		value2=checker2;
      		
      	}
      	else if (var4.equals(checker2))
      	{
      		//System.out.println("var4 checker2 count1: "+count1);
      		value2=torres_value[1];
     		//System.out.println("var4_value(checker2): "); 	
      	}else if(var4.equals(checker1)){
      		
      		//System.out.println("var4 checker1 count1: "+count1);
      		value2=torres_value[1];
      		//System.out.println("var4_value(checker1): "); 	
      	}
      	else 
      	{
      		
      		value1=checker1;
      		
      
      	}
      	if(!(bytes[0]>=48 && bytes[0]<=57) || (bytes1[0]>=48 && bytes1[0]<=57)){
      		
      		//value1=torres_value[0];
      		//value2=torres_value[1];
      	}
      	
    	}
    	 
    	 }
    		System.out.println("value1: "+value1 +" - "+ " value2: "+value2); 
    	//	System.out.println("value2: "+value2);
    		 int ju1 = Integer.parseInt(value1);
    		 int ju2 = Integer.parseInt(value2);
    		 int res=0;
    		res =ju1-ju2;
    		System.out.println(" Result: "+ " "+variable+" " + " = " + res);
    		
      	  	}
      	  
      	
      	  //////////////////////////////
      		
      		if(exp.contains("*"))
      	  	{
      	   //String add="+";
      	   int plus_loca=0;
      	   plus_loca=exp.indexOf("*");
      	   length=exp.length();
      	   checker1=exp.substring(0,plus_loca);
      	   checker2=exp.substring(plus_loca+1,length);
      		//System.out.println("checker1:"+checker1);
          	//System.out.println(checker2[0]);
      		String var3= torres[0];
      	  	String var4= torres[1];
      	
    	  
    	 if(checker1!="") {
    	byte[] bytes= checker1.getBytes("US-ASCII");
    	//	System.out.println("byte "+ bytes);
    	byte[] bytes1= checker2.getBytes("US-ASCII");
    	//	System.out.println("byte1 "+ bytes1);
    	if((bytes[0]>=48 && bytes[0]<=57) && (bytes1[0]>=48 && bytes1[0]<=57) ){
    		//System.out.println("byte "+ bytes[0]);
    		//System.out.println("byte1 "+ bytes1[0]);
    		value1=checker1;
    		value2=checker2;
    	
    	}
    	else{
    		if((bytes[0]>=48 && bytes[0]<=57) ){
    			
    			value1=checker1;
    		}
    		else if(var3.equals(checker1)  ){
      		count++;
      		//System.out.println("count: "+count);
      		value1= torres_value[0];
      		//System.out.println("var3 _value(checker1): "+value1);
          	
      	    }
    		else if(var3.equals(checker2)){
      		count++;
      		//System.out.println("var3 checker2 count: "+count);
      		value1=torres_value[0];
      		//System.out.println("var3_value(checker2): "+value2); 	
      	}
      	else 
      	{
      			
      		if (var3.equals(checker1))
          	{
          		//System.out.println("var4 checker2 count1: ");
          		value1=torres_value[0];
          	//System.out.println("var3_value(checker1): "); 	
          	}
      		else if(var3.equals(checker2)){
      			
          		//System.out.println("var4 checker1 count1: "+count1);
          		value1=torres_value[0];
          	//	System.out.println("var4 checker2 count1: ");
          		//System.out.println("var3_value(checker2): "); 	
          		
          	}
      		else if(var4.equals(checker1)){
      			
          		//System.out.println("var4 checker1 count1: "+count1);
          		value1=torres_value[1];
          		//System.out.println("var4 checker2 count1: ");
          		//System.out.println("var4_value(checker1): "); 	
          		
          	}
      		else if(var4.equals(checker2)){
      			
          		//System.out.println("var4 checker1 count1: "+count1);
          		value1=torres_value[0];
          	//	System.out.println("var4 checker2 count1: ");
          		//System.out.println("var4_value(checker2): "); 	
          		
          	} else{
          		
          		value1=checker1;
              		
          	}     		
      		//value1=torres_value[1];
      			
      			//System.out.println("var3_value(checker1): "); 
      		//the one odd number	
      		
      		
      	}
      	if((bytes1[0]>=48 && bytes1[0]<=57)){
      		value2=checker2;
      		
      	}
      	else if (var4.equals(checker2))
      	{
      		//System.out.println("var4 checker2 count1: "+count1);
      		value2=torres_value[1];
     		//System.out.println("var4_value(checker2): "); 	
      	}else if(var4.equals(checker1)){
      		
      		//System.out.println("var4 checker1 count1: "+count1);
      		value2=torres_value[1];
      		//System.out.println("var4_value(checker1): "); 	
      	}
      	else 
      	{
      		
      		value1=checker1;
      		
      
      	}
      	if(!(bytes[0]>=48 && bytes[0]<=57) || (bytes1[0]>=48 && bytes1[0]<=57)){
      		
      		//value1=torres_value[0];
      		//value2=torres_value[1];
      	}
      	
    	}
    	 
    	 }
    		System.out.println("value1: "+value1 +" * "+ " value2: "+value2); 
    	//	System.out.println("value2: "+value2);
    		 int ju1 = Integer.parseInt(value1);
    		 int ju2 = Integer.parseInt(value2);
    		 int res=0;
    		res =ju1*ju2;
    		System.out.println(" Result: "+ " "+variable+" " + " = " + res);
    		
      	  	}
      	  
      	   }	
      		///////////////////////////
        
        
      	// dispose all the resources after using them.
          fis.close();
          bis.close();
          dis.close();

        } 
        
        catch (FileNotFoundException e) {
          e.printStackTrace();
        } 
        
        catch (IOException e) {
          e.printStackTrace();
        }
	}
    
}


