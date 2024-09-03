package Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Interview {
	
	public static void main(String args[])
	{
		
	/*	Consumer<Integer> squre=i->System.out.println("welcome"+i*i);
		
		squre.accept(8);
		
		Function<Integer,Integer> user=i->i*i;
		Integer apply = user.apply(4);
		
		System.out.println(apply);
		
		Supplier<Date> sup=()->new Date();
		
		Date date = sup.get();
		
		System.out.println(date);*/
		
		
		List<Integer> at=Arrays.asList(1,2,3,45,67,8,3,2,1);
		
		at.stream().filter(i->i%2==0).forEach(t->System.out.println(t));
		
		long count = at.stream().map(i->i*i).count();
		System.out.println(count);
		
		
		Comparator<Integer> com=(i1,i2)->i2.compareTo(i1);
		at.stream().sorted(com).forEach(t->System.out.println(t));
		Integer integer = at.stream().min(com).get();
		Integer integer2 = at.stream().max(com).get();
		System.out.println(integer+" "+integer2);
		
		Integer integer3 = at.stream().reduce((a,b)->a+b).get();
		System.out.println(integer3);
		Set<Integer> s=new HashSet<Integer>();
		at.stream().filter(i->!s.add(i)).forEach(t->System.out.println(t));
		
		
		String str="welcome to code decode code";
		List<String> asList = Arrays.asList(str.split(" "));
		Map<String, Long> collect = asList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		System.out.println(collect);
		
		
		int sum = at.stream().mapToInt(i->i).sum();
		System.out.println(sum);
		
		
		
		
		
	}

}
