package EngineeringDigestCollection;

import java.util.ArrayList;
import java.util.List;


public class SortingStudentObjectUsingLambdaExpression {
	public static void main(String[] args) {
		List<Students> li = new ArrayList();
		li.add(new Students("Salman Khan",4.5,12));
		li.add(new Students("Shah rukh Khan",3.5,15));
		li.add(new Students("Aamir Khan",3.8,21));
		li.add(new Students("Saif Ali Khan",4.2,24));
		
		/*//Sorting based on gpa in descending order
		li.sort((obj1,obj2) -> {
			if(obj2.getGpa()-obj1.getGpa()>0)
				return 1;
			else if(obj2.getGpa()-obj1.getGpa()<0)
				return -1;
			else
				return 0;
		});*/
		
		//Sorting based on gpa in ascending order
				li.sort((obj1,obj2) -> {
					if(obj1.getGpa()-obj2.getGpa()>0)
						return 1;
					else if(obj1.getGpa()-obj2.getGpa()<0)
						return -1;
					else
						return 0;
				});
		for(Students s:li)
			System.out.println("Name:"+s.getName()+" Gpa:"+s.getGpa());
	}
}
