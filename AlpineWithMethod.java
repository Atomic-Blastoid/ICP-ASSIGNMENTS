import java.util.Scanner;
public class AlpineWithMethod {
	public static String encrypt(String plaintext,int a,int b)
	{	


		
			
			int a;
			int b;
			String s="";
			int len=plaintext.length();
			int t=0, code=0;
			System.out.print("Your message Cliptext  : ");
			for(int i=0;i<len;i++)
			{
				t=;
				 code=(plaintext.charAt(i))-97;
				int en=((code*b)+a)%26;
				 char sec=(char)(en+65);
				 s=s+Character.toString(sec);
			}
			System.out.println(s);
			
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
		
		//decryption part
		
		int len=chipertext.length();
		int t=0, code=0,en=0;
		System.out.print("Your message Plaintext  : ");
		for(int i=0;i<len;i++)
		{
		
			
			
			//sec for decryption
			 code=(in.charAt(i))-65;
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
		System.out.println(s);
		
	}


			public static void main(String[] args) {
				//input part
				Scanner ob=new Scanner(System.in);
				System.out.println("Enter 0 if you want to encryption");
				System.out.println("              OR");
				System.out.println("Enter 1 if you want to decryption");
				int c=ob.nextInt();
				switch (c)
				{
					case 0:
					{
						System.out.println("Enter Plain text: ");
						String plaintext= ob.next();
						System.out.println("Enter Additive Cliper :");
						int a=ob.nextInt();
						System.out.println("Enter Multiplitive Cliper :");
						int b=ob.nextInt();
						ob.close();
						//System.out.println(in);
				//encryption part
						encrypt(plaintext,a,b);
					}
						
					break;
					case 1:
					{
						//input part
						System.out.println("Enter Cliptext text: ");
						String chipertext= ob.next();
						System.out.println("Enter Additive Cliper :");
						int a=ob.nextInt();
						System.out.println("Enter Multiplitive Cliper :");
						int b=ob.nextInt();
						ob.close();
						decrypt(chipertext,a,b)
						
						
						}	
					}
				
			}

		}
			

	
