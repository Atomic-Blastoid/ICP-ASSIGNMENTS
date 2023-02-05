import java.util.Scanner;
public class te {


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
						String in= ob.next();
						System.out.println("Enter Additive Cliper :");
						int a=ob.nextInt();
						System.out.println("Enter Multiplitive Cliper :");
						int b=ob.nextInt();
						ob.close();
						//System.out.println(in);
				//encryption part
						
						
						int len=in.length();
						int t, code;
						System.out.print("Your message Cliptext  : ");
						for(int i=0;i<len;i++)
						{
							t=in.charAt(i);
							 code=t-97;
							int en=((code*b)+a)%26;
							char sec=(char)(en+65);
							System.out.print(sec);
						}
					}
					break;
					case 1:
					{
						//input part
						System.out.println("Enter Cliptext text: ");
						String in= ob.next();
						System.out.println("Enter Additive Cliper :");
						int a=ob.nextInt();
						System.out.println("Enter Multiplitive Cliper :");
						int b=ob.nextInt();
						ob.close();
						//changing value of b to multiplaive inverse
						for(int i=0;i<26;i++)
						{
							if((i*b)%26==1)
							{
							   b=i;
								
							break;
							}
						}
						
						//System.out.println(in);
						
						
						
						//System.out.println(in);
						
						//decryption part
						
						int len=in.length();
						int t=0, code=0,en=0;
						System.out.print("Your message Plaintext  : ");
						for(int i=0;i<len;i++)
						{
						
							t=in.charAt(i);
							
							//t for each char check
							//sec for decryption
							 code=t-65;
							 if(code-a<0)
							 {
								 
								  en=((26+(code-a))*b)%26;
								  char sec=(char)(en+97);
								  System.out.print(sec);
							 }
							 else
							 {
								 en=((code-a)*b)%26;
								 char sec=(char)(en+97);
								 System.out.print(sec);
							 }
							
						}	
						
					

					
				}
				
			}

	 }
			

 }


