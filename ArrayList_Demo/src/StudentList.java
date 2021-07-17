import java.util.ArrayList;
import java.util.Iterator;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;



public class StudentList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> l=new ArrayList<Student>(2);
		l.add(new Student("Ghanu", 545));
		l.add(new Student("Hari", 534));
		l.add(new Student("Krushna", 345));
		
		//System.out.println(l);
		//System.out.println("Exit main");
		l.stream().filter(s->s.getId()>500).forEach(System.out::println);
		System.out.println("***********************************");
		/*
		 * Iterator itr=l.iterator(); while(itr.hasNext()) {
		 * //1System.out.println(itr.next()); Student student=(Student)itr.next();
		 * System.out.println("Id : "+student.getId());
		 * System.out.println("Name : "+student.getName());
		 * System.out.println("========================================");
		 * 
		 * 
		 * }
		 */
		
		//  l.sort((s1,s2)->s1.getId()-s2.getId()); System.out.println(l);
		  
		 // System.out.println(l.get(2));
		  
		  Student student=new Student();
		  student.setName("Hari");
		 
		System.out.println(l.remove(student));
		System.out.println(l);
		
		System.out.println(l.removeIf(s->s.getName().equals("Hari")));
		System.out.println(l);
		
		java.util.Collections.sort(l);
		
	}

}
