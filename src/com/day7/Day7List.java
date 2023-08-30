/*package com.day7;

public class Day7List {

	public static void main(String[] args) {
		int a[]=new int[10];
		int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of all the elements of an array: "+sum);
	}
}

*/

/*package com.day7;

public class Day7List {

	public static void main(String[] args) {
		int a[]=new int[10];
		int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		double Average=sum/arr.length;
		System.out.println(Average);
	}
}

*/

/*package com.day7;
import java.util.TreeSet;
import java.util.Set;
public class Day7List {

	public static void main(String[] args) {
		Set<Integer> l= new TreeSet<Integer>();
		l.add(10);
		l.add(10);
		l.add(20);
		l.add(50);
		l.add(60);
		l.add(80);
		l.add(60);
		l.add(50);
		
		System.out.println(l);
	}
}

*/

/*package com.day7;
import java.util.LinkedList;
import java.util.List;
public class Day7List {

	public static void main(String[] args) {
		List <Integer>l=new LinkedList<Integer>();
		int a[]= {10,20,30,90,10,10,40,50};
		int c=a.length;
		System.out.println(c);	
	}
}

*/

/*package com.day7;
import java.util.LinkedList;
import java.util.List;
public class Day7List {

	public static void main(String[] args) {
		List <Integer>l=new LinkedList<Integer>();
		int a[]= {100,200,300,400,500,600,700};
		int c=a.length;
		System.out.println("The length of the list is: " +c);	
	}
}

*/

/*package com.day7;
import java.util.List;
import java.util.Vector;
public class Day7List {

	public static void main(String[] args) {
		Vector<Integer> v= new Vector <Integer>();
		int a[]= {105,205,305,405,505,605,705,805};
		int c=a.length;
		System.out.println("The length of the list is: " +c);	
	}
}

*/

/*package com.day7;
import java.util.LinkedList;
import java.util.List;
public class Day7List {

	public static void main(String[] args) {
		List <Integer>a=new LinkedList<Integer>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		a.add(600);
		a.add(700);
		int c=a.size();
		System.out.println("The Size of the list is: " +c);	
	}
}

*/

/*package com.day7;

import java.util.LinkedList;
import java.util.List;

public class Day7List {

	public static void main(String[] args) {
		List<Integer> a = new LinkedList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		int c = a.indexOf(10);
		System.out.println(c);
		int d= a.lastIndexOf(10);
		System.out.println(d);
		int e = a.indexOf(50);
		System.out.println(e);
		int f = a.indexOf(90);
		System.out.println(f);
		int g=a.indexOf(70);
		System.out.println(g);
		}
	}

*/

/*package com.day7;
import java.util.LinkedList;
import java.util.List;

public class Day7List {

	public static void main(String[] args) {
		List<Integer> a = new LinkedList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		Integer b= a.get(2);
		System.out.println(b);
		
	}
}

*/

/*package com.day7;
import java.util.LinkedList;
import java.util.List;

public class Day7List {

	public static void main(String[] args) {
		List<Integer> a = new LinkedList<Integer>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		a.add(600);
		a.add(700);
		Integer c = a.get(4);
		System.out.println(c);
	}
}

*/

/*package com.day7;
import java.util.LinkedList;
import java.util.List;

public class Day7List {

	public static void main(String[] args) {
		List<Integer> a = new LinkedList<Integer>();
		a.add(105);
		a.add(205);
		a.add(305);
		a.add(405);
		a.add(505);
		a.add(605);
		a.add(705);
		a.add(805);
		Integer c = a.get(8);
		System.out.println(c);
	}
}

*/

/*package com.day7;
import java.util.LinkedList;
import java.util.List;

public class Day7List {

	public static void main(String[] args) {
		List<Integer> a = new LinkedList<Integer>();
		a.add(105);
		a.add(205);
		a.add(305);
		a.add(405);
		a.add(505);
		a.add(605);
		a.add(705);
		a.add(805);
		for(int i=0;i<a.size();i++) {
			Integer r=a.get(i);
			System.out.println(r);
		}
		for(Integer g:a) {
			System.out.println(g);
		}
	}
}

*/

/*package com.day7;
import java.util.LinkedList;
import java.util.List;

public class Day7List {

	public static void main(String[] args) {
		List<Integer> a = new LinkedList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.remove(2);
		System.out.println(a);
		
	}
}

*/

/*package com.day7;
import java.util.LinkedList;
import java.util.List;
public class Day7List {

	public static void main(String[] args) {
		List<Integer> a = new LinkedList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.remove(10);
		System.out.println(a);
		}
}

*/

/*package com.day7;
import java.util.LinkedList;
import java.util.List;
public class Day7List {

	public static void main(String[] args) {
		List<Integer> a = new LinkedList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.remove(5);
		System.out.println(a);
		}
}

*/

/*package com.day7;
import java.util.LinkedList;
import java.util.List;
public class Day7List {

	public static void main(String[] args) {
		List<Integer> a = new LinkedList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		
		a.add(2,50);
		System.out.println(a);
		a.add(9,70);
		System.out.println(a);
		a.add(8,80);
		System.out.println(a);
		a.add(11,100);
		System.out.println(a);
	}
}
		
*/

/*package com.day7;
import java.util.LinkedList;
import java.util.List;
public class Day7List {

	public static void main(String[] args) {
		List<Integer> a = new LinkedList<Integer>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		a.add(600);
		a.add(700);
		a.set(2,350);
		System.out.println(a);
	}
}

*/

/*package com.day7;
import java.util.ArrayList;
import java.util.Collections;

public class Day7List {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		a.add(10);
		a.set(7, 90);
		System.out.println(a);

		Collections.replaceAll(a,10,100);
		for(Integer value:a) {
		
			System.out.println(value);
		}
	}
}

*/

/*package com.day7;
import java.util.ArrayList;
import java.util.LinkedList;
public class Day7List {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		LinkedList<Integer>b= new LinkedList<Integer>();
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		b.add(80);
		a.retainAll(b);
		System.out.println(a);
	}
}
		
*/

/*package com.day7;
import java.util.ArrayList;
import java.util.LinkedList;
public class Day7List {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		LinkedList<Integer>b= new LinkedList<Integer>();
		b.add(10);
		b.add(20);
		b.add(60);
		b.add(50);
		b.add(40);
		b.add(70);
		b.add(80);
		b.add(90);
		a.retainAll(b);
		System.out.println(a);
	}
}

*/

/*package com.day7;
import java.util.ArrayList;
import java.util.LinkedList;
public class Day7List {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		LinkedList<Integer>b= new LinkedList<Integer>();
		b.add(100);
		b.add(200);
		b.add(300);
		b.add(400);
		b.add(500);
		b.add(600);
		b.add(700);
		b.add(8000);
		a.retainAll(b);
		System.out.println(a);
	}
}

*/

/*package com.day7;
import java.util.ArrayList;
import java.util.LinkedList;
public class Day7List {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		LinkedList<Integer>b= new LinkedList<Integer>();
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		b.add(80);
		a.removeAll(b);
		System.out.println(a);
	}
}

*/

/*package com.day7;
import java.util.ArrayList;
import java.util.LinkedList;
public class Day7List {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		LinkedList<Integer>b= new LinkedList<Integer>();
		b.add(10);
		b.add(20);
		b.add(60);
		b.add(50);
		b.add(40);
		b.add(70);
		b.add(80);
		b.add(90);
		a.removeAll(b);
		System.out.println(a);
	}
}

*/

package com.day7;
import java.util.ArrayList;
import java.util.LinkedList;
public class Day7List {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		LinkedList<Integer>b= new LinkedList<Integer>();
		b.add(100);
		b.add(200);
		b.add(300);
		b.add(400);
		b.add(500);
		b.add(600);
		b.add(700);
		b.add(8000);
		a.removeAll(b);
		System.out.println(a);
	}
	
}
