    /*class Test{
	public static void main(String[] args)
	{
		
		//1.replace(char oldChar, char newChar)
		//-------------------------------------
        //Replaces all occurrences of a specific character with a new character.
        
        //public String replace(char oldChar, char newChar)

        //Parameters:

         //oldChar: The character to be replaced.
         //newChar: The character that will replace oldChar.
         

         String str1 = "hello";
         String newStr1 = str1.replace('l', 'p');
         System.out.println("The new String newStr1 is - " + newStr1);  // Output: "heppo"


        
        //2.replace(CharSequence target, CharSequence replacement)
        //--------------------------------------------------------
        //Replaces all occurrences of a sequence of characters (substring) with another sequence.
        
        //public String replace(CharSequence target, CharSequence replacement)
        
        //Parameters:

        //target: The sequence of characters to be replaced.
        //replacement: The sequence that will replace the target
        

         String str2 = "Hello World!";
         String newStr2 = str2.replace("World", "Java");
         System.out.println("The new String newStr2 is - " +newStr2);  // Output: "Hello Java!"


         
         //3.replaceAll(String regex, String replacement)
         //----------------------------------------------
         //Replaces all substrings of this string that match the given regular expression with the specified replacement.

          //public String replaceAll(String regex, String replacement)
          //Parameters:

        //regex: The regular expression to match the substring(s) to be replaced.
         //replacement: The string to replace the matched substring. 
         

          String str3 = "abc123xyz";
          String newStr3 = str3.replaceAll("\\d", "#");
          System.out.println("The new String newStr3 is - " +newStr3);  // Output: "abc###xyz" (replaces all digits)


          
         
         //4.replaceFirst(String regex, String replacement)
         //------------------------------------------------
         //Replaces the first substring of this string that matches the given regular expression with the specified replacement.

         
         //public String replaceFirst(String regex, String replacement)
         //Parameters:

         //regex: The regular expression to match the first substring.
         //replacement: The string to replace the first matched substring.
         

          String str4 = "abc123xyz123";
          String newStr4 = str4.replaceFirst("\\d", "#");
          System.out.println("The new String newStr4 is - " +newStr4);  // Output: "abc#23xyz123" (only the first digit is replaced)


         String str5="Good";
         System.out.println("Before concatenation using concat() - ");
         System.out.println(str5.hashCode());
         str5.concat("Morning");
         System.out.println("After concatenation - ");
         System.out.println(str5.hashCode());


         


         
         //5.String.toCharArray()
         //----------------------
         //Definition: This method converts the entire string into a character array.

         //public char[] toCharArray()
         //Returns: A new character array (char[]) containing the characters of the string in the same order.
         //Use case: It's commonly used when you need to process each character of a string individually, 
         //such as when performing algorithms on characters.
         

         String str = "Hello";
         char[] charArray = str.toCharArray();

         // Output: ['H', 'e', 'l', 'l', 'o']
         for (char ch : charArray) {
         System.out.println("The character is using toChararray() - "+ch);
         }
        
         
         //StringBuilder.toCharArray() (Indirect)
         //There is no direct toCharArray() method in the StringBuilder class, 
         //but you can convert a StringBuilder to a string and then use toCharArray() on the resulting string
         
         StringBuilder sb = new StringBuilder("Hello");
         char[] charArray = sb.toString().toCharArray();

         // Output: ['H', 'e', 'l', 'l', 'o']
         for (char ch : charArray) {
             System.out.println("The characters using StringBuilder - "+ch);
         }
     }
 }*/



         //Take a string input and convert it to character array without using toCharArray() method.
         //Also print each character in the character array.


      /*import java.util.* ;
      class TestCharArray
      {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string"); //Taking a string input
            String strc =sc.nextLine();

            char[] chs =new char[strc.length()]; //Creating a character array with the length of the string

            for(int i=0;i<strc.length();i++)
            {
                chs[i]=strc.charAt(i);  //Taking each character using charAt(i) of the string and putting it to character array
            }

            for(char c : chs)
            {
                System.out.println(c);//printing each character of the character array using for each loop
            }



        }
      }*/



      /*import java.util.* ;

      class Test{
        public static void stringtochar(String str){
        
           char[] chs =new char[str.length()]; 

            for(int i=0;i<str.length();i++)
            {
                chs[i]=str.charAt(i);  
            }

            for(char c : chs)
            {
                System.out.println(c);
            }
        }
    }
      class TestCharArray{
        public static void main(String[] args)
        {
            Test t= new Test();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string"); //Taking a string input
            String strc =sc.nextLine();
            t.stringtochar(strc);
        }

      }*/

     

     //Append a string to the end of the character array

      /*import java.util.* ;
      class Test{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string which will be converted to character array");
            String cstr=sc.nextLine();
            
            System.out.println("Enter a string");
            String str =sc.nextLine();

            //char[] charArray=new char[cstr.length()];

            //for(int i=0;i<cstr.length();i++)
            //{
                //charArray[i]=cstr.charAt(i);

           // }
            char[] charArray1 =cstr.toCharArray();
            //System.out.println("The character array : " + charArray1);
            System.out.println("The character array: " + Arrays.toString(charArray1));//To print character array by converting to string
            
            char[] charArray2 =str.toCharArray();
            //System.out.println("The string converted to character array : " + charArray2);
            System.out.println("The string converted to character array: " + Arrays.toString(charArray2));

            String newStr=cstr.concat(str);
            System.out.println("The concatenated string is - "+ newStr);

            char[] newCharArray= newStr.toCharArray();
            System.out.println("The concatenated character array is - "+ Arrays.toString(newCharArray));
         }
      }*/


      /*import java.util.*;
      class CharArrayAppendString{
        void stringtocharArray(String str,char[] ch)
        {
            int j=0;
            for(int i=5;i<5+str.length();i++){
                ch[i]=str.charAt(j++);
            } 
            System.out.println("The new array is :");
            for (char c:ch)
            {
                System.out.println(c);
            }

        }
      }
      class Test{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string");
            String str=sc.nextLine();

            CharArrayAppendString chas=new CharArrayAppendString();

            char[] ch =new char[5+str.length()];

            System.out.println("Enter value for array : ");
            for(int i=0;i<5;i++)
            {
                ch[i]=sc.next().charAt(0);
            }
            //for(char c:ch)
            //{
              //  System.out.println(c);
            //}
           chas.stringtocharArray(str,ch);


        }
      }*/


      //trim(): Removes whitespace from both ends of a string.



       /*class Test{
        public static void main(String[] args){
       String str = "  Hello World!  ";
       //String str1=str.trim();  // "Hello World!"
       //System.out.println(str1);

       System.out.println(str.trim());//Here the operation is happening in runtime so no string object creation is needed beforehand.
       //During runtime if any operation is done then the object will be created in heap area not in the SCP area.
   }
}*/


//Sort this string :"Learning Java Is Fun"

/*import java.util.*;
class Test{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        
        String[] strA = str.split(" ");//we need to capture the values in a string arrays
        System.out.println("The splited strings are(Before sorting) : ");
        int n=strA.length;

        for(String s:strA)
        {
          System.out.print(s+" ");  
        }
        System.out.println("");
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(strA[j].charAt(0)>strA[j+1].charAt(0)){
                    String tempStr=strA[j+1];
                    strA[j+1]=strA[j];
                    strA[j]=tempStr;
                }
            }
        }
        System.out.println("After sorting - ");
        for(String str1 :strA)
        {
          System.out.print(str1+" ");  
        }



    }
}*/

//Write aprogram to sort string characters in alphabetical order

/*       0123
Example :java =>aajv 

j  a  v  a
----------
a  j  v  a
----------     (By selection sort)
a  a  v  j
----------
a  a  j  v

*/

/*
import java.util.*;

class Test{
    public static void main(String[] args)
    {
       System.out.println("Enter the string : ");
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();//java
       char [] ch=str.toCharArray();
       for(int i=0;i<ch.length-1;i++){
        for(int j=i+1;j<ch.length;j++){
            if(ch[i]>ch[j]){
                char  temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
            }

        }
       } 

       System.out.println("Original string : "+ str);
       System.out.println("String after sorting tghe characters in alaphabetical order : "+ new String(ch));
    }
}*/


//Write a program to sort "Learning Larning Lrning Lning" alphabetically



/*import java.util.*;
class Test{
    public static void main(String[] args){
        System.out.println("Enter the string : ");
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();//Learning Larning Lrning Lning
       String strA[] =str.split(" ");
       System.out.println("Before sorting : ");
       for(String s : strA)
       {
        System.out.println(s + " ");
       }

       for(int i=0;i<strA.length-1;i++){
        for(int j=i+1;j<strA.length;j++){
            if(strA[i].compareTo(strA[j])>0){
                String tempString=strA[i];
                strA[i]=strA[j];
                strA[j]=tempString;
            }
        }
    }
    System.out.println("After sorting : ");
    for(String str1:strA)
    {
        System.out.println(str1+" ");
    }

    }
}*/


//Generate passowrd fron one's first name,middle name,last name and roll number

/*
Name:AB CD EFGH
     -- -- ----
     FN MN LN

Roll number:191128527

password -ACE8527

*/ 

/*import java.util.*;
class Test{
    public static void main(String[] args){
        System.out.println("Enter the name");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String strA[] =str.split(" ");  

        System.out.println("Enter the roll number");
        String roll=sc.nextLine();


        String pwd="";
        for(String str1:strA){
            pwd=pwd+str1.charAt(0);
        }
        for(int i=roll.length()-4;i<roll.length();i++)
            pwd=pwd+roll.charAt(i);
        System.out.println("Password : "+pwd);

    }
}*/










         
 
 






















	
