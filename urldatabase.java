import java.util.Scanner;
import org.json.*;
public class urldatabase {

	public static void main(String[] args) {		 
		 String opt ;
	      String url,url1,url2;
		 do {			 	 
	      System.out.println("\nCommands:\r\n"
	      		+ "a. storeurl \r\n"
	      		+ "b. get \r\n"
	      		+ "c. count \r\n"
	      		+ "d. list\r\n"
	      		+ "e.  exit :");
	      System.out.println("\nSelect one option: ");
	      Scanner sc = new Scanner(System.in);
	       opt = sc.next();
	      
	      
	      switch (opt) {
	      
	         case "a":
	        	 System.out.println("Enter url: ");
	        	 url=sc.next();
	            System.out.println("\nstoreurl:"+url);
	            int count=0;  
	            break;
	         case "b":
	        	 System.out.println("\nEnter url1: ");
	        	  url1=sc.next();
		            System.out.println("\nget:"+url1);
		            int count1=0;  
		            char ch[]= new char[url1.length()];     
		            for(int i=0;i<url1.length();i++)  
		            {  
		                ch[i]= url1.charAt(i);  
		                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
		                    count1++;  
		            }  
		            
	            System.out.println("\nUnique Short key:"+url1.length());
	            break;
	         case "c":
	        	 System.out.println("\nEnter url2: ");
	        	  url2=sc.next();
	           
	            int count2=0;  
	            char ch1[]= new char[url2.length()];     
	            for(int i=0;i<url2.length();i++)  
	            {  
	                ch1[i]= url2.charAt(i);  
	                if( ((i>0)&&(ch1[i]!=' ')&&(ch1[i-1]==' ')) || ((ch1[0]!=' ')&&(i==0)) )  
	                    count2++;  
	            }  
	            
            System.out.println("\nCount is:"+count2);
	            break;
	         case "d":
	        	String a,b,c;
	        	a="www.google.com";
	        	b="www.amazon.com";
	        	c="www.flipkart.com";
	            System.out.println("\nURL AND COUNTS..");
	            int c1=0,c2=0,c3=0;
	            char ch2[]= new char[a.length()];     
	            for(int i=0;i<a.length();i++)  
	            {  
	                ch2[i]= a.charAt(i);  
	                if( ((i>0)&&(ch2[i]!=' ')&&(ch2[i-1]==' ')) || ((ch2[0]!=' ')&&(i==0)) )  
	                    c1++;  
	            }  
	            
	            char ch3[]= new char[b.length()];     
	            for(int i=0;i<b.length();i++)  
	            {  
	                ch3[i]= b.charAt(i);  
	                if( ((i>0)&&(ch3[i]!=' ')&&(ch3[i-1]==' ')) || ((ch3[0]!=' ')&&(i==0)) )  
	                    c2++;  
	            }  
	            
	            char ch4[]= new char[c.length()];     
	            for(int i=0;i<c.length();i++)  
	            {  
	                ch4[i]= c.charAt(i);  
	                if( ((i>0)&&(ch4[i]!=' ')&&(ch4[i-1]==' ')) || ((ch4[0]!=' ')&&(i==0)) )  
	                    c3++;  
	            }  
	            
	            System.out.println(a + " : "+ c1);
	            System.out.println(b + " : "+ c2);
	            System.out.println(c + " : "+ c3);  
	            break;
	         case "e":
	            System.exit(0);
	            break;
	         default:
	            System.out.println(" Not found");
	            
	      }
	      
		 } while (opt!= "e");
	   
	
		// TODO Auto-generated method stub

	}

}
