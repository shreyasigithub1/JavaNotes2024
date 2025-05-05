/*class wrapper{
	public static void main(String[] args){
		Integer i1=new Integer(10);
		System.out.println(i1); //creating an object from interger primitive

        //Integer i2=new Integer("Ten");//NumberFormatException
		Integer i2=new Integer("10");
		System.out.println(i2); //creating an object from string

		
        // creating an Integer object from a primitive int and a String using the Integer wrapper class. 
		

      Double d1=new Double(12.34);
      System.out.println(d1);

      Double d2=new Double("12.34");
      System.out.println(d2);

     // Integer i1=new Integer(10);//Invalid

      Float f1=new Float(12.34f);//takes float
      Float f2 =new Float("12.34");//takes string
      Float f3=new Float(12.34);//Valid //takes double

   
    //Float has three constructors
    //1.Float(float value)
    //2.Float(String value)
    //3.Float(double value)
   

      Character c=new Character('a');
      //Character c=new Character("a");//Invalid //doesn't take string

      //
      Character has only one constructor.It does not have the Character(String) constructor
      

    Boolean b1 =new Boolean(true);
    System.out.println(b1);

    Boolean b2 =new Boolean(false);
    System.out.println(b2);


    //Boolean b3 =new Boolean(True); //Error will come
    //System.out.println(b3);



//For the constructor Boolean(Primitive value) only "true" and "false" is allowed otherwise if we give'True' or any other case
//it will be an error .Content and case both are important.

//For string content and case are not important.If you give case insensitive form of 'true' then also it will be true.


Boolean b4=new Boolean("True"); 
    System.out.println(b4);

Boolean b5 =new Boolean("FaLse"); //it will be false
    System.out.println(b5);

Boolean b6 =new Boolean("Java"); //Eit will be false
    System.out.println(b6);


Boolean X=new Boolean("Yes");
Boolean Y=new Boolean("Yes");

System.out.println(X==Y);
System.out.println(X.equals(Y));

	}
}*/

/*valueOf() method
------------------
To convert primitve/String to object.
           ==========================
*/

/*class wrapper{
	public static void main(String[] args){
		Integer i=Integer.valueOf(10);//Form 1
		System.out.println(i);

		Double d=Double.valueOf(10);
		System.out.println(d);

        //Boolean b=new Boolean(true);
        Boolean b=Boolean.valueOf(true);
        System.out.println(b);

        //Character c=new Character('a');
        Character c =Character.valueOf('a');
        //Character c =Character.valueOf("a");//Character can not be applied to string error will come because there is no constructor Character(String)
        System.out.println(c);

        Integer I=Integer.valueOf("10");//Form 2
        System.out.println(I);

	}
}*/


/*
If you create the object in this way
Integer I =new Integer(10);
then it will raise warnings.

Integer I =Integer.valueOf(10);
It does not raise warnings

creating object with 'new' keyword is costly.
So usind valueOf() method is preferred.
*/

/*
Form 1:
-------
Every Wrapper class including character class has a static valueOf() method to convert primitive to object.

Form 2:
-------
Every Wrapper class excluding character class has a static valueOf() method to convert String to objrect.

Form 3:
------
Integer i=Integer.valueOf(1111);
If we give '1111',the JVM will treat it as a decimal number
Integer i=Integer.valueOf(1111,2);
If we give a radix number as 2 JVM will treat it as a binary number
we can give 2,3,8,10,11,16,36   

*/


/*
xxxValue()
----------
To convert wrapper object to primitive
           ===========================
Every number type wrapper class
1.byte
2.short
3.int
4.long
5.float
6.double

public byte byteValue();
public short shortValue();
public int intValue();
public long longValue();
public float floatValue();
public double doubleValue();

*/


/*class wrapper
{
    public static void main(String[] args){
        Integer i=new Integer(130);//created a wrapper object
        System.out.println(i.byteValue());//converting wrapper object to byte primitive
        System.out.println(i.shortValue());
        System.out.println(i.intValue());
        System.out.println(i.longValue());
        System.out.println(i.floatValue());//130.0//there will not be any 'f' afterwards
        System.out.println(i.doubleValue());

    }

}
*/

/*
charValue()
-----------
To get character primitive from given character object
*/


/*class wrapper{
    public static void main(String[] args){
        Character c=new Character('a');
        //System.out.println(c.charValue());//It is not number type primitive so this is invalid
        char c1 =c.charValue();
        System.out.println(c1);

    }
}*/



/*
booleanValue()
-----------
To get character primitive from given boolean object
*/


/*class wrapper{
    public static void main(String[] args){
        Boolean b=new Boolean(true);
        Boolean b1=b.booleanValue();
        System.out.println(b1);

    }
}*/




/*
parseXxx()
----------
to convert string to primitive
Form 1: 
Every wrapper class except Character class contains a parseXxx() merthod to convert string to the corresponding
primitive.
Form 2:
Every integral type wrapper class(Byte,short,Integer,Long) contains the following parseXxx() method to convert 
specified radix string to primitive.
Prototype: public static primitive parseXxx(string s,int radix);
the allowed range is 2 to 36.

*/



/*class wrapper{
    public static void main(String[] args){
        Integer i=Integer.parseInt("10");
       System.out.println(i);

       int i1=Integer.parseInt("1111",2);
       System.out.println(i1);
    
    }
}*/


/*
toString()
----------
wrapper object or primitive to string

form 1 : wrapper object to string

prototype:public string tostring();

It is overriding version of public class toString() method.

Form 2: Every wrapper class contains a static toString() method which converts primitive to string

Form 3:Integer and long classes having this method to convert primitive to specified radix  string.

Form 4: Integer and long classes contains the following toXxxString() methods

public static toBinaryString(primitive p);
public static toHexString(primitive p);
public static toOctalString(primitive p);


*/



/*class wrapper{
    public static void main(String[] args){
        Integer I= new Integer(10);
        String str=I.toString();
        System.out.println(str);

        String str1=Integer.toString(20);
        System.out.println(str1);

        String str2=Integer.toString(15,2);
        System.out.println(str2);

        String str3=Integer.toBinaryString(10);
        System.out.println(str3);

        String str4=Integer.toOctalString(10);
        System.out.println(str4);

   
        String str5=Integer.toHexString(10);
        System.out.println(str5);





    }
}*/

/*
Autoboxing and Autounboxing
---------------------------
AutoBoxing-Automatic conversion of primitive to wrapper object

Autounboxing-Automatic conversion of wrapper object to primitive
*/


/*class Test{
    static Integer I=10; //Autoboxing
    public static void main(String[] args){
        int i=I;//Autounboxing
        m1(i);

    }
    public static void m1(Integer k)//Autoboxing//Integer k=i
    {
    int m=k;//Autounboxing
    System.out.println(m);
    }
}*/



/*class Test{
    static Integer I;//null
    public static void main(String[] args){
        int m=I;//Autounboxing --> I.intValue() --> null.intValue()
        System.out.println(m);
    }
}*/


/*class Test{
     static Integer X=10;//Autoboxing
     static Integer Y=X;//Autoboxing //10
    public static void main(String[] args){
        X++;//Autounboxing
        System.out.println(X);
        System.out.println(Y);
        System.out.println(X==Y);
    }
}*/



/*
Integer X=10;
Means an object is created and X is referring to the object
Integer Y=X means Y is also referring to the same object
X++;
means the object is not increamwnting .Here Autounboxing is happening internally
All wrapper class objects are immutable.Here X++ means a new object will be created
which is 11 and that will be referred by X now.The previous X will be lost.
Now X is referring to 11 and Y is referring to 10
System.out.println(X==Y)
here equality operator means reference comparision
which will be false
*/


/*class Test{
    public static void main(String[] args){
        Integer I1=new Integer(10);
        Integer I2=new integer(10);
        System.out.println(I1==I2);
    }
}
*/

/*
Here I1 and I2 are referring to two seperate objects
So I1==I2 will be false
*/

/*class Test{
    public static void main(String[] args){
        Integer I1=new Integer(10);
        Integer I2=10;//Autoboxing
        System.out.println(I1==I2);
    }
}*/


/*class Test{
    public static void main(String[] args){
        Integer I1=10;
        Integer I2=10;
        System.out.println(I1==I2);//true
    }
}*/

/*
By autoboxing if an object is required to be 
created first it will check if it is already created for autoboxing or not.
If it is already created for autoboxing then existing object will be used.
So in this example both I1 and I2 arev referring to the same object because the object
'10' was already created and I1 was referring ti it.Now I2 alse refferes to the same object.
So the output will true
*/


/*
class Test{
    public static void main(String[] args){
        Integer I1=1000;
        Integer I2=1000;
        System.out.println(I1==I2);//false
    }
}*/


/*class Test{
    public static void main(String[] args){
        Integer I1=127;
        Integer I2=127;
        System.out.println(I1==I2);//true
    }
}*/

/*class Test{
    public static void main(String[] args){
        Double D1=10.0;
        Double D2=10.0;
        System.out.println(D1==D2);//Two different object will be created hence false
    }
}*/

/*class Test{
    public static void main(String[] args){
        Integer I1=new Integer(10);
        Integer I2=new Integer(10);
        System.out.println(I1==I2);//false
    }
}*/


/*class Test{
    public static void main(String[] args){
        Integer I1=10;
        Integer I2=10;
        System.out.println(I1==I2);//true
    }
}*/



/*class Test{
    public static void main(String[] args){
        Integer I1=Integer.valueOf(10);
        Integer I2=Integer.valueOf(10);
        System.out.println(I1==I2);//true
    }
}*/









