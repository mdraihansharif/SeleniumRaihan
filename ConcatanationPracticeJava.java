package First_program_sits;
// putting comments
public class ConcatanationPracticeJava {

	public static void main(String[] args) {
		String x1="Hello"; String y1 ="to java";
		System.out.println("printing x+y :" + x1+y1);
		System.out.println("printing with space in between:" +x1+" "+y1);
		// Note: After a string literal, all the + will be treated as string concatenation operator.
		   String s = 50+30+"Raihan"+40+40;  
		   System.out.println(s);
		//The String concat() method concatenates the specified string to the end of current string.
		   String s1 = "Sharif";  
		   System.out.printlm("test")
		   System.out.println(s.concat(s1));
		//Intger.parseInt(String string-to-be-converted
		   int i = Integer.parseInt("123");
		   System.out.println("i:" + i);
		//Int to String in Java using "+" operator
		   String price = "" + 123;
		   System.out.println("price is in string: " + price);
 //Byte 		   * Min: -128 		   * Max: 127 		   * Default: 0
		   byte myByte;
		   myByte =120;
		   System.out.println("Byte Value @120: " + myByte);
		   byte myByte1 = 100;
		   System.out.println("Byte Value: " + myByte1);
// Short * Min: -32,76  * Max: 32,76 * Default: 0
		   short myShort = 10000;
		   System.out.println("Short Value: " + myShort);
// int Min: -2,147,483,648  * Max: 2,147,483,647
		   int MyInt = 10000000;
		   System.out.println("Int Value: " + MyInt);
// long    * Min: -2^6   * Max: 2^63 -1
		   long myLong = 100000000000000000L;
		   System.out.println("Long Value: " + myLong);
// float float * Default: 0.0f
		   float myFloat = 20.0f;
		   System.out.println("Float Value: " + myFloat);
// * double		   * Default: 0.0d
		   double myDouble = 21.0;
		   System.out.println("Double Value: " + myDouble);
//* char * Min: 0   * Max: 65,535
		   char myChar = 'a';
		   System.out.println("Char Value: " + myChar);
		   String mysting= "welcome to java";
		   System.out.println("String value Value: " + mysting);

		//System.out.println("printing x+y as int :" + x+y);
	/*	 String x = "Hello";
		String y = "to java";
		//add the two strings x and y
		System.out.println(x+y);
		System.out.println(x+ " "+y);

		int a = 10;
		int b=49;
		System.out.println(a+b);
		System.out.println(a+b+x+y);
		System.out.println(a+b+ " "+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+" "+(a+b)); */
	}//end of main method
}//end of class
