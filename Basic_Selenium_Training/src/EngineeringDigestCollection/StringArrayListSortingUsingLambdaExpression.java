package EngineeringDigestCollection;

import java.util.Arrays;
import java.util.List;

public class StringArrayListSortingUsingLambdaExpression {
	public static void main(String[] args) {
		
		List<String> li = Arrays.asList("Hi","Hello","Bye","Morning","Afternoon");
		System.out.println("Before:"+li);
		
		/*String sorting based on its length in ascending order*/
		li.sort((a,b) -> a.length()-b.length());
		System.out.println("After ascending length sorting:"+li);
		
		/*String sorting based on its length in descending order*/
		li.sort((a,b) ->b.length()-a.length());
		System.out.println("After descending sorting:"+li);
	}
}
