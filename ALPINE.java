import java.util.Scanner;
public class ALPINE {
	public static String encrypt(String plaintext,int a,int b)
	{	
			String s="";
			int len=plaintext.length();
			int  code=0;
			System.out.print("Your message Cliptext  : ");
			for(int i=0;i<len;i++)
			{
				
				 code=(plaintext.charAt(i))-97;
				int en=((code*b)+a)%26;
				 char sec=(char)(en+65);
				 s=s+Character.toString(sec);
			}
			 return s;
			
		}
	
	public static String decrypt(String chipertext,int a,int b)
	{	
		String s="";
		for(int i=0;i<26;i++)
		{
			if((i*b)%26==1)
			{
			   b=i;
			   break;
			}
		}
		for(int i=0;i<26;i++)
		{
			
			if((i-a)%26==0)
			{
			   a=i;
			   break;
			}
		}
		for(int i=0;i<26;i++)
		{
			if((i+a)%26==1)
			{
			   a=i;
			   break;
			}
		}
		
		//decryption part
		
		int len=chipertext.length();
		int code=0,en=0;
		System.out.print("Your message Plaintext  : ");
		for(int i=0;i<len;i++)
		{
		
			
			
			//sec for decryption
			 code=(chipertext.charAt(i))-65;
			 if(code-a<0)
			 {
				 
				  en=((26+(code-a))*b)%26;
				  s=s+((char)(en+97));
			 }
			 else
			 {
				 en=((code-a)*b)%26;
				 s=s+((char)(en+97));
				 
			 }
			 
			
	}
		return s;
		
	}


			public static void main(String[] args) {
				//input part
			
					
						System.out.println("Enter Plain text: ");
						String plaintext= ob.next();
						System.out.println("Enter Additive Cliper :");
						int a=ob.nextInt();
						System.out.println("Enter Multiplitive Cliper :");
						int b=ob.nextInt();
						ob.close();
						
				//encryption part
						
						String s=encrypt(plaintext,a,b);
						System.out.println("aa");
						System.out.println(s);
				
					
					//decrypt part
						String s=decrypt(chipertext,a,b);
						System.out.println(s);
						
						
						}	
					}
			}
}
