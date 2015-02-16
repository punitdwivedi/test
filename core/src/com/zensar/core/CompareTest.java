package com.zensar.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author PD42694
 *
 */
public class CompareTest{
	public static void main(String[] args) {
		List users = new ArrayList();
			users.add(new User(10000, "Punit"));
			users.add(new User(20000, "Aman"));
			users.add(new User(40000, "Shyam"));
			users.add(new User(50000, "Asish"));
			users.add(new User(10000, "Vimal"));
			Collections.sort(users, new UserComparator());
			
	/*	Collections.sort(users, new Comparator<Object>() {
			
			@Override
			public int compare(Object arg0, Object arg1) {
				if(arg0 instanceof User && arg1 instanceof User){
					User user1 = (User) arg0;
					User user2 = (User) arg1;
					int sal1= user1.getSalary();
					int sal2 = user2.getSalary();
					return sal1>sal2?1:sal1<sal2?-1:0;
				}else{
					return 0;
				}
			}
		});*/
		for (Iterator iterator = users.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			System.out.println(user.getName() + " "+ user.getSalary());
			
		}
		System.out.println("************************************************");
		System.out.println("**************Reverse Order*********************");
		Collections.reverse(users);
		
		for (Iterator iterator = users.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			System.out.println(user.getName() + " "+ user.getSalary());
			
		}
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Finalize is called..");
	}

}
