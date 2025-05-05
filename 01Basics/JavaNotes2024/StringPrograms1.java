/*
Creating String object with and without new keyword
*/

/*class Test
{
	public static void main(String[] args)
	{
		String str = "Java";
		String str1 = new String("Core Java");
		System.out.println(str);
		System.out.println(str1);
	}
}*/

/*
String class is immutable but StringBuffer is not.
For string it is 'concat' method and for StringBuffer it is 'append' method

*/

/*class Test
{
	public static void main(String[] args)
	{
		String str="Core";
		str.concat("Java");
		str=str.concat("String");
		System.out.println(str);
	}
}*/

/*class Test{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Core");
		sb.append("Java String");
		System.out.println(sb);

	}
}*/



/*
String class overrides the 'equals' method of the object class,but StringBuffer does not override the 'equals'
 method of object class.
 Object class 'equsls' method is for reference comparison but String class 'equals' method is for content comparison

*/

/*class Test
{
	public static void main(String[] args)
	{
		String str1 =new String("Java");
		String str2 =new String("Java");
		System.out.println(str1.equals(str2));
	}
}*/


/*class Test
{
	public static void main(String[] args)
	{
		StringBuffer sb1 =new StringBuffer("Java");
		StringBuffer sb2=new StringBuffer("Java");
		System.out.println(sb1.equals(sb2));
	}
}*/
/*
String class constructors
-------------------------
String class has 16 constructors.Maongthose 8 are important.

1.String str = new String();

It creates an empty string but not a null one.


*/

/*class Test
{
	public static void main(String[] args)
	{
		String str = new String();
		System.out.println(str);

	}
}*/

/*
2.creating string object with direct string literal
and
creating string object with string copy


*/



/*class Test{
	public static void main(String[] args)
	{
		String str1 =new String("Java");
		System.out.println(str1);

		String str2="Python";
		String str3 =new String(str2);
		System.out.println(str3);


	}
}*/

/*
3.String str=new String(StringBuffer sb);
To convert StringBuffer to String object in case some methods are not available for StringBuffer but for String.

4.String str=new String(StringBuilder sb);
To convert StringBuilder to String object in case some methods are not available for StringBuilder but for String.

5.String str=new String(Char[] ch);
To convert character array to String object in case no methods are available for character array but for String.


*/

/*class Test{
	public static void main(String[] args)
	{
		char[] ch={'J','a','v','a'};
		String str=new String(ch);
		System.out.println(str);
	}
}*/


/*
6.String str=new String (Char[] ch,int offset,int count);

Creates a string starting from the offset index and till the count.
Int offset - Starting index from where the string creation will start.(The index starts from 0)


*/


/*class Test{
	public static void main(String[] args)
	{
		char[] ch={'P','Y','T','H','O','N'};
		String str=new String(ch,2,2);
		System.out.println(str);
	}
}*/

/*
7.String str =new String(byte[] b);

Create a string by converting byte numbers to their equivalent ASCII characters.
*/

/*class Test{
	public static void main(String[] args)
	{
		byte[] b={101,102,103,104};
		String str=new String(b);
		System.out.println(str);
	}
}*/

/*
String str =new String(byte[] b,int offset,int count);
create a string by converting byte numbers to equivalent ASCII characters from offset to count.
OFFSET AND COUNT MUST BE IN THE RANGE TO 0 TO (STRING-1)
*/

/*class Test{
	public static void main(String[] args)
	{
		byte[] b={101,102,103,104};
		String str=new String(b,1,1);
		System.out.println(str);
	}
}*/

/*class Test{
	public static void main(String[] args)
	{
		byte[] b={101,102,103,104};
		String str=new String(b,1,4);
		System.out.println(str);
	}
}*/


/*
We can't pass 'null' as a argument in string constructor
It may lead to ambiguity issues
Because
StringBuffer sb1
StringBuilder sb2
Char[] ch
In all of these the value of sb1,sb2,ch can be null
*/

/*class Test{
	public static void main(String[] args) {
		String str =new String(null);
		
	}
}*/

/*we can't perform any operation on null

*/

/*class Test{
	public static void main(String[] args) {
		String str1 =null;
		String str2 =new String(str1);
		System.out.println(str2);
		
	}
}*/

/*class Test{
	public static void main(String[] args)
	{
		String str1= "Java";
		String str2= "Java";

		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));


		String str3= new String("Java");
		String str4= new String("Java");

		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	}
}*/



/*class Test{
	public static void main(String [] args)
	{
		String str1=new String("Spring");
		str1.concat("Summer");

		String str2=str1.concat("winter");
		str1=str1.concat("Fall");

		System.out.println(str1);
		System.out.println(str2);		
	}
}*/


/*
STRING METHODS
--------------
*/

/*
1.Check whether the string is empty or not?
If you give a 'space' and nothoing else,then it will not be considered as an empty string

*/

/*import java.util.*;
class Test{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println(str.isEmpty());
	}
}
*/

/*import java.util.*;
class Test{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println(str.length());
	}
}*/



import java.util.*;
class Test{
	public static void main(String[] args)
	{

		/*
		1 - isEmpty()
		-------------
		*/

		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();

		//Finding the string is empty or not
		System.out.println(str.isEmpty());*/

		String s1="";
		String s2=" ";
		String s3=new String("");

		System.out.println("s1 is empty or not -" + s1.isEmpty());//true
		System.out.println("s2 is empty or not -" + s2.isEmpty());//If you give a space it will not be empty string//false
		System.out.println("s3 is empty or not -" + s3.isEmpty());//true

		/*
		2 - length()
		------------
		*/

		System.out.println("The length of s1 - "+ s1.length());//0
		System.out.println("The length of s2 -"+ s2.length());//1
		System.out.println("The length of s3 -"+ s3.length());//0

		/*
		3 - equals(),equalsIgnoreCase()
		-------------------------------
		*/

		String string1 = new String("abc");
		String string2 = new String("abc");
		String string3 = new String("Abc");

		System.out.println("string1 and string2 using equality operator- " + (string1==string2));//false
		System.out.println("string1 and string2 using equals()- " + (string1.equals(string2)));//true

		/*Equality operator means reference comparison.Reference comaprison mean whether two same reference 
		variables are referring to the same object or not'equals' method is overriden in string method.In object 
		class 'equals'method does reference comparison but in string class 'equals' method does content comparison*/

        System.out.println("string2 and string3 using equality operator - " + (string2==string3));//false
        System.out.println("string2 and string3 using equals() - " + (string2.equals(string3)));//false
        

        /*
        Comparing strings by ignoring cases
        public boolean equalsIgnoreCases(String s);
        */

        System.out.println("string2 and string3 using equalsIgnoreCase - " + (string2.equalsIgnoreCase(string3)));//true

        /*
		4 - compareTo(),comparetoIgnoreCase()
		-----------------------------------
		*/


        /*Comparing string lexicographically
        Unicode values of the uppercase characters(A-Z) starts from 65.
        and lowercase characters(a-z) starts from 97.	
        Value is 0; if two strings are equal
        value is <0 The invoking string is less than str(invoking will 
        come earlier in dictionary order).
        value is >0 The invoking string is greater than str.

        If we compare a string with empty string using the compare() method
        then the method would return length of the invoking string - length of the
        argument string.

        If the two string has some matching alpahbets too,whichever string has
        the more alphabets besides the matching ones will be greater.
        */

        String s4=new String("a");
        String s5=new String("A");

        System.out.println("s4 and s5 using compareTo() - " + (s4.compareTo(s5))); //a=97;A=65 97-65=32
        System.out.println("s4 and s5 using compareToIgnoreCase() - " +(s4.compareToIgnoreCase(s5))); //0

        //Case 1
         String str1="CSE";
         String str2="CSE";
         System.out.println("str1 and str2 compareTo() - " + str1.compareTo(str2));//It's equal so 0

         //Case 2
         String str3="CSE";
         String str4="ECE";
         System.out.println("str3 and str4 compareTo() - " + str3.compareTo(str4));//E is greater than C so -2

         //Case 3
         String str5="";
         String str6="CSE";
         System.out.println("str5 and str6 compareTo() - " +str5.compareTo(str6));// Empty string so 'length of the invoking string - length of the argument string.' (0-3)//-3

         //Case 4
         String str7="CSE2021";
         String str8="CSE";
         System.out.println("str7 and str8 compareTo() - " +str7.compareTo(str8));//str7 has more alphabets besides the matching ones so 4


         /*
		5 - startsWith(),endsWith()
		---------------------------
		*/


         String str9="Java Programming Language";
         System.out.println("str9 startsWith()'Java' or not"+str9.startsWith("Java"));//true
         System.out.println("str9 endsWith()'Language' or not"+str9.endsWith("Language"));//true
         System.out.println("str9 startsWith()'java' or not"+str9.startsWith("java"));//false
         System.out.println("str9 endsWith()'core' or not"+str9.endsWith("core"));//false

         /*
		6 - charAt()
		-------------
		*/

         System.out.println("The character at 10th index is :"+ str9.charAt(10));
         //System.out.println("The character at 10th index is :"+ str9.charAt(-2));//StringIndexOutOfBoundsExxception
         //System.out.println("The character at 10th index is :"+ str9.charAt(23));//StringIndexOutOfBoundsExxception

         /*
         7 - public int indexOf(char ch)
         -------------------------------
         */

         System.out.println("str9 using indexOf(char ch) - " + str9.indexOf("P"));//P is at 5th index

         /*
         8 - concat()
         ------------
         */

         String str10= "Java";
         str10.concat("Core");//It will not be added
         str10=str10.concat("Language");
         System.out.println("str10 using concat - "+str10);


        /*
        9 - toUpperCase(),toLowerCase()
        -------------------------------
        */


        String str11="JaVa";
        System.out.println("str11 usining toUpperCase() is - "+str11.toUpperCase());
        System.out.println("str11 usining toLowerCase() is - "+str11.toLowerCase());

        /*
        10 - int indexOf(int ch)
        ------------------------
        Finds the first occurrence of the character ch in the string.
        Returns: The index of the first occurrence of ch, or -1 if the character is not found.
        */

        String str12 = "hello";
       System.out.println("str12 using indexof(int ch) - "+str12.indexOf('l'));  // Returns 2 (the first 'l' is at index 2)


       /*
       11 - int indexOf(int ch, int fromIndex)
       ---------------------------------------
         Finds the first occurrence of the character ch, starting from the specified fromIndex.

         Parameters:
         ch: The character to find.
         fromIndex: The index from where to start the search.
         Returns: The index of the first occurrence of ch after fromIndex, or -1 if the character is not found.*/

         String str13 = "hello";
         System.out.println("str13 using indexof(int ch,int fromindex) - "+str13.indexOf('l', 3));  // Returns 3 (starts searching from index 3)

         /*
         12 - int indexOf(String str)
         ----------------------------
         Finds the first occurrence of the substring str in the string.

         Parameters: str (the substring to find).
         Returns: The index of the first occurrence of str, or -1 if the substring is not found.
        */
         String str14 = "hello world";
         System.out.println("str14 using indexof(String str) - "+str14.indexOf("world"));  // Returns 6 (first occurrence of "world" starts at index 6)



         /*
         13 - int indexOf(String str, int fromIndex)
         -------------------------------------------
         Finds the first occurrence of the substring str, starting from the specified fromIndex.

         Parameters:
         str: The substring to find.
         fromIndex: The index from where to start the search.
         Returns: The index of the first occurrence of str after fromIndex, or -1 if the substring is not found
         */

         String str15= "hello world, hello universe";
         System.out.println("str15 using indexof(String str,int fromIndex) - "+str15.indexOf("hello", 6));  // Returns 13 (starts searching from index 6 and finds "hello" at index 13)

         /*
         14 - int lastIndexOf(int ch)
         ----------------------------
         Finds the last occurrence of the character ch in the string.

         Parameters: ch (the character to find, given as an int because Java characters are represented by Unicode values).
         Returns: The index of the last occurrence of ch, or -1 if the character is not found
         */
        String str16 = "hello";
        System.out.println("str16 using lastIndexOf(int ch) - "+str16.lastIndexOf('l'));  // Returns 3 (the last 'l' is at index 3)


        /*
        15 - int lastIndexOf(int ch, int fromIndex)
        -------------------------------------------
        Finds the last occurrence of the character ch, searching backward from the specified fromIndex.

        Parameters:
        ch: The character to find.
        fromIndex: The index from where to start searching backward.
        Returns: The index of the last occurrence of ch at or before fromIndex, or -1 if the character is not found.
        */

        String str17 = "hello";
        System.out.println("str17 using lastIndexOf(int ch,int fromIndex) - "+str17.lastIndexOf('l', 2));  // Returns 2 (starts searching backward from index 2 and finds 'l' at index 2)


        /*
        16 - int lastIndexOf(String str)
        --------------------------------
        Finds the last occurrence of the substring str in the string.

        Parameters: str (the substring to find).
        Returns: The index of the last occurrence of str, or -1 if the substring is not found
        */

        String str18 = "hello world, hello universe";
        System.out.println("str18 using lastIndexOf(String str) - "+str18.lastIndexOf("hello"));  // Returns 13 (the last occurrence of "hello" starts at index 13)



        /*
        17 - int lastIndexOf(String str, int fromIndex)
        -----------------------------------------------
        Finds the last occurrence of the substring str, searching backward from the specified fromIndex.

        Parameters:
        str: The substring to find.
        fromIndex: The index from where to start searching backward.
        Returns: The index of the last occurrence of str at or before fromIndex, or -1 if the substring is not found.
        */

        String str19 = "hello world, hello universe";
        System.out.println("str19 using lastIndexOf(String str,int fromIndex) - "+str19.lastIndexOf("hello", 10));  // Returns 0 (starts searching backward from index 10 and finds "hello" at index 0)


        
        //Write a program to check if the given string or cahr available or not

        String str20= "String is immutable";
        if(str20.indexOf("is")!= -1)
        {
        	System.out.println("The specified string is available");
        }
        else
        {
        	System.out.println("The specified string is not available");
        }

        /*
        18 - contains()
        ---------------
       Finds out a string is present or not
       */
        if(str20.contains("immutable"))
        {
        	System.out.println("The specified string is available(using contains())");
        }
        else
        {
        	System.out.println("The specified string is not available (using contains())");
        }

        /*
        19 - public String substring(int begin)
        ----------------------------------------

        The substring(int begin) method in Java is part of the String class and is used to extract 
        a portion of a string starting from the specified index up to the end of the string. It creates
         a new String that contains the substring
         */

         String str21 = "Hello, World!";
         String subStr1 = str21.substring(7);
         //String subStr3 = str21.substring(-6);
        
        System.out.println("str21 using substring(int begin) - " + subStr1);  // Output: "World!"
        //System.out.println("str22 using substring(int begin int end) - " + subStr3);//StringIndexOutOfBoundExceptio

        /*
        20 - public String substring(int begin,int end)
        -----------------------------------------------
        Returns the string from begin index to end-1 index
        */
        String str22 = "Java Programming Language";
        String subStr2 = str22.substring(5,15);
        
        String subStr4 = str22.substring(24,24);
        
        System.out.println("str22 using substring(int begin,int end)- " + subStr2); 

        
        //System.out.println("str22 using substring(int begin int end) - " + subStr4);//It will return empty string

        System.out.println("str22 using substring(int begin,int end)- " + subStr2); 


        String subStr5= str22.substring(str22.indexOf("P"),str22.indexOf("L"));//This is called method chaining

        System.out.println("str22 using substring(int begin,int end)- " + subStr5); 


        String str23="a";
        String str24=str23+ "b";
        System.out.println(str23);
        System.out.println(str24);

        System.out.println(str23==str24);

        String str25="c";
        String str26="d";

        String str27=str25.concat(str26);
        System.out.println(str27);
















	}
}















































