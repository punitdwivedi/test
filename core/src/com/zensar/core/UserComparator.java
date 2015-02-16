package com.zensar.core;

import java.util.Comparator;

public class UserComparator implements Comparator<Object>{

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


}
