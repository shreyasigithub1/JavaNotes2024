/*public class Test {
    public static void main(String[] args) {
        int age = 27;
        double salary = 85000.50;
        String name = "Alice";

        System.out.printf("Name: %s%n", name);               // Prints a string
        System.out.printf("Age: %d%n", age);                 // Prints an integer
        System.out.printf("Salary: %.2f%n", salary);  
        System.out.printf("Name: %10s Age: %5d%n", name, age);
       
    }
}
*/
/*import java.util.*;
class Test{
    public static void main(String[] args){
        System.out.println("Enter the first number");
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();


        System.out.println("Enter the second number");
        //Scanner sc =new Scanner(System.in);
        int n2=sc.nextInt();

        System.out.println("Before swapping n1 is "+n1+" and n2 is  "+n2);

        int temp=0;

        temp=n1;
        n1=n2;
        n2=temp;

        System.out.println("After swapping n1 is "+n1+" and n2 is  "+n2);


    }
}*/

//Linear Search 

/*import java.util.*;

class LinearSearch{
    public static void main(String[] args){
        System.out.println("Enter all numbers");
        Scanner sc=new Scanner(System.in);
        int[] array=new int[8];
        for(int i=0;i<8;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("The array is : "+ Arrays.toString(array));

        System.out.println("Enter the number you want to search");

        int data=sc.nextInt();

        for(int j=0;j<8;j++){
            if(array[j]==data)
            {
                System.out.println("The data is found in the index : "+j);
                break;
            }
            if(j==array.length)
        {
            System.out.println("The element is not found");
        }

        }
        
    }
}
*/

/*import java.util.*;
class BinarySearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter all numbers");
        int[] array=new int[5];
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("The array is :"+Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("The sorted array is :"+Arrays.toString(array));

        System.out.println("Enter the data you want to search");

        int data=sc.nextInt();
        
            int left=0;
            int right=array.length-1;
            int mid=0;

            while(left<=right){

                mid=(left+right)/2;

            if(data==array[mid])
            {
                System.out.println("The data is found in the index :"+mid);
                break;
            }
            if(data<array[mid])
            {
                right=mid-1;
                
            }
            if(data>array[mid])
            {
                left=mid+1;
                
            }
        }


        

    }
}
*/

/*class Test{
    public static void main(String[] args){
        System.out.println(5,5);
    }
}*/


/*abstract class P{
    void m1(){}
    void m2(){}
    void m3(){}
    abstract void m4();
}
class Test
{
    public static void main(String[] args)
    {
        P p=new P();
        p.m1();
    }
}*/


/*abstract class P{
    void m1(){}
    void m2(){}
    void m3(){}
    abstract void m4();
}

class C extends P{
    void m4(){

    }
}
class Test
{
    public static void main(String[] args)
    {
        C c=new C();
        c.m1();
    }
}*/


/*abstract class P{
    abstract void m1();
    abstract void m2();
    }

    abstract class C extends P{
    void m1(){

    }
    }
class C1 extends C {
    void m2(){

    }
}
class Test
{
    public static void main(String[] args)
    {
        C1 c1=new C1();
        c1.m1();
    }
}*/

































