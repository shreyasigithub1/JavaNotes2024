/*boolean add(Object obj)
-------------------------
*/


/*import java.util.*;

class Test{
	public static void main(String[] args){
		List<String> list =new ArrayList<>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		System.out.println(list.add("AAA"));//Here duplication is allowed so it will return true
		System.out.println("ArrayList : "+list);//Insertion order will be maintained

		Set<String> set=new HashSet<>();
		set.add("XXX");
		set.add("YYY");
		set.add("ZZZ");
		System.out.println(set.add("XXX"));//Here duplication is not allowed so it will return false
		System.out.println("Set: "+set);//Insertion order will not be maintained
	}
}*/



/*
boolean addAll(Collection c)
----------------------------
*/


/*import java.util.*;

class Test{
	public static void main(String[] args){
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println("First ArrayList:"+al);
		for(Integer num:al)
			System.out.println(num);

		ArrayList<Integer>all=new ArrayList<>();
		all.add(100);
		all.add(200);
		all.add(300);
		all.add(400);
		System.out.println("Second ArrayList:"+all);
		for(Integer num:all)
			System.out.println(num);

		al.addAll(all);
		System.out.println("First ArrayList:"+al);
		for(Integer num:al)
			System.out.println(num);



	}
}*/



/*
boolean remove(Object obj)
--------------------------
*/

/*import java.util.*;

class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");

		System.out.println("Before Removal :"+al);
		System.out.println(al.remove("BBB"));//true

		System.out.println("After Removal :"+al);
		System.out.println(al.remove("BBB"));//false
    }
}*/



/*
boolean removeAll(Collection c)
-------------------------------
*/



/*import java.util.*;

class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		al.add("FFF");
		System.out.println("Before Removal :"+al);
		
		ArrayList<String> all=new ArrayList<>();
		all.add("BBB");
		all.add("CCC");
		all.add("DDD");
		
		System.out.println(al.removeAll(all));//It is going to remove the objects from al,which are specified in all//true
        System.out.println("After Removal :"+al);

        System.out.println(al.removeAll(all));//false
		
    }
}*/


/*
public boolean contains(Object obj)
-----------------------------------
*/


/*import java.util.*;

class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		al.add("FFF");
		System.out.println("Before Removal :"+al);
		
		System.out.println(al.contains("BBB"));//true

		System.out.println(al.contains("YYY"));//false
		
    }
}*/


/*
public boolean containsAll(collection c)
----------------------------------------
*/


/*import java.util.*;

class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		al.add("FFF");
		System.out.println(al);

		ArrayList<String> all=new ArrayList<>();
		all.add("BBB");
		all.add("CCC");
		all.add("DDD");
		System.out.println(all);
		
		System.out.println(al.containsAll(all));
		all.add("XXX");
		all.add("YYY");

		System.out.println(al.containsAll(all));
		
    }
}*/



/*
public boolean retainAll(coolection c)
--------------------------------------
*/


/*import java.util.*;

class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		al.add("FFF");
		System.out.println(al);

		ArrayList<String> all=new ArrayList<>();
		all.add("BBB");
		all.add("CCC");
		all.add("DDD");
		System.out.println(all);
		
		System.out.println(al.retainAll(all));
		System.out.println(al);

		System.out.println(al.retainAll(all));
		
    }
}*/

/*
public int size()
-----------------
*/



/*import java.util.*;

class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		al.add("FFF");
		System.out.println(al);

		
		System.out.println(al.size());

		
		
    }
}*/

/*
public void clear()
-------------------
*/

/*import java.util.*;

class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		al.add("FFF");
		System.out.println(al);

		
		al.clear();
		System.out.println("After clear : " +al);
   }
}*/

/*
public boolean isEmpty()
------------------------
*/

/*import java.util.*;

class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		al.add("FFF");
		System.out.println(al.isEmpty());

		
		al.clear();
		System.out.println("After clear : " +al);
		System.out.println(al.isEmpty());
   }
}*/


/*
public Object[] toArray()
-------------------------
*/



import java.util.*;

class Test{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		al.add("EEE");
		al.add("FFF");
		System.out.println(al);

		Object[] obj=al.toArray();
		for(Object o:obj)
			System.out.println(o);
		
   }
}























