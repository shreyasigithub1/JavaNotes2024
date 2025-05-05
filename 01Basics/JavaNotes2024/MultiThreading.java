 /*class MyThread extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}
	}
}
class Test{
	public static void main(String [] args){
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}*/


/*class MyRunnable implements Runnable{
	public void run()
	{
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}
	}
}
class Test{
	public static void main(String [] args){
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);//'r' is Runnable interface implemented class object
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}*/


/*class MyThread extends Thread{

}
class ThreadDemo
{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName());

		MyThread t1=new MyThread();
		System.out.println(t1.getName());

		MyThread t2=new MyThread();
		System.out.println(t2.getName());

		Thread.currentThread().setName("New Name");
		System.out.println(Thread.currentThread().getName());

		//System.out.println(10/0);





		System.out.println(t1.getPriority());

		t1.setPriority(7);

		System.out.println(t1.getPriority());

		//t1.setPriority(70);
		
		//System.out.println(t1.getPriority());


		System.out.println(Thread.currentThread().getPriority());
	}
}*/

/*class MyThread extends Thread{

}
class ThreadDemo{
	public static void main(String[] args){
		System.out.println("Priority of main thread at first - "+Thread.currentThread().getPriority());

		MyThread t1=new MyThread();
		System.out.println("Priority of t1- "+t1.getPriority());

		Thread.currentThread().setPriority(7);
        System.out.println("Priority of main thread after changing - "+Thread.currentThread().getPriority());

        MyThread t2=new MyThread();
		System.out.println("Priority of t2- "+t2.getPriority());
   }
}*/



/*class MyThread extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}
	}
}
class Test{
	public static void main(String [] args){
		MyThread t=new MyThread();
		t.setPriority(10);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}*/


/*class MyThread extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Sita Thread");
			try{
		       Thread.sleep(2000);
	          }catch(InterruptedException ie){}
		}
		
	}
}
class ThreadJoinDemo{
	public static void main(String[] args) throws InterruptedException {
		MyThread t=new MyThread();
		t.start();
		t.join(10000);
		for(int i=0;i<10;i++)
		{
			System.out.println("Ram Thread");
		}

	}
}*/




/*class MyThread extends Thread{
	static Thread mt;
	public void run()
	{
		//Thread.currentThread().join()//Here Thread.currentThread() will be the child thread not the main thread
		try{
          mt.join(); 
      }catch(InterruptedException ie){}
		
		for(int i=0;i<10;i++){
			System.out.println("Sita Thread");
		}
	}

}

class ThreadJoinDemo{
	public static void main(String[] args)
	{
		MyThread.mt=Thread.currentThread();
		MyThread t=new MyThread();
		t.start();

		for(int i=0;i<10;i++){
			System.out.println("Ram Thread");
		}
	}
}*/


/*Join method should be always in a try- cath block or the exception must be thrown from the method calling
 the join method.Here the run method is overriden method and it does not throw any exception originally ,so we can not add 
 or 'throws' exception.
*/



/*class MyThread extends Thread{
	static Thread mt;
	public void run()
	{
		//Thread.currentThread().join()//Here Thread.currentThread() will be the child thread not the main thread
		try{
          mt.join(); 
      }catch(InterruptedException ie){}
		
		for(int i=0;i<10;i++){
			System.out.println("Sita Thread");
		}
	}

}

class ThreadJoinDemo{
	public static void main(String[] args)throws InterruptedException
	{
		MyThread.mt=Thread.currentThread();
		MyThread t=new MyThread();
		t.start();
        t.join();
		for(int i=0;i<10;i++){
			System.out.println("Ram Thread");
		}
	}
}*/



/*class MyThread extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Sita Thread");
			
		}
		
	}
}
class ThreadJoinDemo{
	public static void main(String[] args) throws InterruptedException {
		MyThread t=new MyThread();
		t.start();
		Thread.currentThread().join();
		for(int i=0;i<10;i++)
		{
			System.out.println("Ram Thread");
		}

	}
}*/




/*class SlideRotator{
	public static void main(String[] args) throws InterruptedException{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Slide - "+i);
			Thread.sleep(2000);

		}
	}
}*/




/*class MyThread extends Thread{
	public void run()
	{
		try{
		for(int i=0;i<=10;i++)
		{
			System.out.println("I am a lazy thread");
			Thread.sleep(2000);
		}
	}catch(InterruptedException ie)
	{
		System.out.println("I am Interrupted");
	}
   }
}
class ThreadInterruptDemo{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		t.start();
		t.interrupt();
		System.out.println("End of Main Thread");
	}
}*/



/*class Display{
	public synchronized void Wish(String name)
	{
		for(int i=0;i<2;i++){
		System.out.println("Good morning!");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){}
		System.out.println(name);
	}
	}
}

class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
        this.d=d;
        this.name=name;
	}
	public void run(){
		d.Wish(name);

	}
}

class Test{
	public static void main(String[] args){
		Display d=new Display(); //Creating a object of the Display class and using the Wish method on the same object from two thread
		MyThread t1=new MyThread(d,"Dhoni"); 
		MyThread t2=new MyThread(d,"Yuvraj"); 

		t1.start();
		t2.start();
	}
}*/




/*class Display{
	public synchronized void Wish(String name){
		for(int i=0;i<2;i++){
		System.out.println("Good morning!");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){}
		System.out.println(name);
	}
	}
}

class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
        this.d=d;
        this.name=name;
	}
	public void run(){
		d.Wish(name);

	}
}

class Test{
	public static void main(String[] args){
		Display d1=new Display(); //On two different object synchronisation would not work
		Display d2=new Display(); 

		MyThread t1=new MyThread(d1,"Dhoni"); 
		MyThread t2=new MyThread(d2,"Yuvraj"); 

		t1.start();
		t2.start();
	}
}*/

/*
This class can use 'throws' keyword for the sleep method but it should also delegate the throws keyword to it's caller method and that i run(),but it is overriden and does not use 'throws' keyword.
	

*/

/*class Display{
	public synchronized void Displayn(){
		for(int i=1;i<=10;i++){
			System.out.print(i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}

			}
		}

	
	public  void Displayc(){
		for(int i=65;i<75;i++){
			System.out.print((char)i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}

			}

	}
}

class MyThread1 extends Thread{
	Display d;
	
	MyThread1(Display d)
	{
        this.d=d;
        
	}
	public void run(){
		d.Displayn();

	}
}

class MyThread2 extends Thread{
	Display d;
	
	MyThread2(Display d)
	{
        this.d=d;
     }
	public void run(){
		d.Displayc();

	}
}

class Test{
	public static void main(String[] args){
		Display d=new Display(); 
		

		MyThread1 t1=new MyThread1(d); 
		MyThread2 t2=new MyThread2(d); 

		t1.start();
		t2.start();
	}
}
*/

/*
Creating two method in a single class
Display--Displayn(),Displayc()

Two different thread extending thread class

Mythread1 calling Displayn()
MyThread2 callung Displayc()



*/




/*class Display{
	public void Wish(String name)
	{
		synchronized(this){  //Using synchronized block on current object
		for(int i=0;i<2;i++){
		System.out.println("Good morning!");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){}
		System.out.println(name);
	}
	}
	}
}

class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
        this.d=d;
        this.name=name;
	}
	public void run(){
		d.Wish(name);

	}
}

class Test{
	public static void main(String[] args){
		Display d=new Display(); //Creating a object of the Display class and using the Wish method on the same object from two thread
		MyThread t1=new MyThread(d,"Dhoni"); 
		MyThread t2=new MyThread(d,"Yuvraj"); 

		t1.start();
		t2.start();
	}
}*/





/*class Display{
	public void Wish(String name)
	{
		synchronized(Display.class){  //Using synchronized block on class level lock
		for(int i=0;i<2;i++){
		System.out.println("Good morning!");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){}
		System.out.println(name);
	}
	}
	}
}

class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
        this.d=d;
        this.name=name;
	}
	public void run(){
		d.Wish(name);

	}
}

class Test{
	public static void main(String[] args){
		Display d=new Display(); //Creating a object of the Display class and using the Wish method on the same object from two thread
		MyThread t1=new MyThread(d,"Dhoni"); 
		MyThread t2=new MyThread(d,"Yuvraj"); 

		t1.start();
		t2.start();
	}
}*/



/*
If you are dealing with static synchronized method the you have to use class level lock
For any non static method you can use object level lock
*/



























