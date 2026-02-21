package FinalPrac;

import java.util.*;
import java.util.stream.Collectors;

public class OrderMain {

    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();

        orders.add(new Order(101, "Khasim", "Electronics", 45000, "Hyderabad", "Delivered"));
        orders.add(new Order(102, "Chotu", "Clothing", 3000, "Bangalore", "Pending"));
        orders.add(new Order(103, "Swarna", "Groceries", 3000, "Chennai", "Delivered"));
        orders.add(new Order(104, "Apple", "Electronics", 85000, "Mumbai", "Cancelled"));
        orders.add(new Order(105, "Harika", "Furniture", 25000, "Hyderabad", "Delivered"));
        orders.add(new Order(106, "Ravi", "Clothing", 6000, "Delhi", "Pending"));
        orders.add(new Order(107, "Anu", "Groceries", 900, "Bangalore", "Delivered"));
        orders.add(new Order(108, "Sita", "Electronics", 55000, "Pune", "Delivered"));
        
//        orders.stream().
//        map(Order::getAmount).distinct().forEach(System.out::println);
        
        
        
        
        
//        find second highest order amount
//        double secHigh=orders.stream().
//        		map(Order::getAmount).distinct().
//        		sorted(Comparator.reverseOrder())
//        		.limit(2).skip(1).findFirst().orElse(0.0);
//        System.out.println(secHigh);
        
        Map<String,Double> sum=orders.stream().
        		collect(Collectors.groupingBy(Order::getCategory,Collectors.summingDouble(Order::getAmount)));
        System.out.println(sum);
        
        
        
        
        
        
        
        
        
        
        
        
//        Map<Boolean,List<Order>> parOrder=
//        		orders.stream()
//        		.collect(Collectors.partitioningBy(o->"Delivered".equals(o.getStatus())));
//        System.out.println(parOrder);
        
        
//        Map<Boolean,Long> parCount=
//        		orders.stream().
//        		collect(Collectors.partitioningBy(o->"Delivered".equals(o.getStatus()),Collectors.counting()));
//        System.out.println(parCount);
//        Map<Boolean,Optional<Order>> maxPar=
//        orders.stream().collect(Collectors.partitioningBy(o->"Delivered".equals(o.getStatus()),Collectors.maxBy(Comparator.comparing(Order::getAmount))));
        
        
        
        
        
        
        
        
//        System.out.println(maxPar);
        
        
        
        
        
        
        
        
        
        
        
        
        
        //        Map<String,Double> avgCity=orders.stream().
//        		collect(Collectors.groupingBy(Order::getCity,Collectors.averagingDouble(Order::getAmount)));
//        
//        
//       for( Map.Entry<String,Double> m:avgCity.entrySet()) {
//    	   System.out.println(m.getKey()+" "+m.getValue());
//       }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Map <String,Double> a=orders.stream().
//        		collect(Collectors.groupingBy(Order::getCity,Collectors.summingDouble(Order::getAmount)));
//        Map<String,List<Order>> OrderByCategory=
//        			orders.stream().collect(Collectors.groupingBy(Order::getCategory));
////        System.out.println(OrderByCategory);
//      for(Map.Entry<String,List<Order>> map:OrderByCategory.entrySet()) {  
//    	  System.out.println(map.getKey()+" "+map.getValue());
//      }
//        Map<String,Long> Count=orders.stream().
//        		collect(Collectors.groupingBy(Order::getCategory,Collectors.counting()));
//        
//        System.out.println(Count);
//        Map<String,Double> sumofCategory=
//        		orders.stream().collect(Collectors.groupingBy(Order::getCategory,Collectors.summingDouble(Order::getAmount)));
//        System.out.println(sumofCategory);
//        Map<String,Double> avg=orders.stream().collect(Collectors.groupingBy(Order::getCategory,Collectors.averagingDouble(Order::getAmount)));
//        System.out.println(avg);
//        
        
        
//        Map<String,Optional<Order>> mapMax=
//        		orders.stream().collect(Collectors.groupingBy(Order::getCategory,Collectors.maxBy(Comparator.comparing(Order::getAmount))));
//        		
//        
//        System.out.println(mapMax);
//        Map<String,List<Order>> city=orders.stream().
//        		collect(Collectors.groupingBy(Order::getCity));
//        for(Map.Entry<String,List<Order>> map:city.entrySet()) {
//        	System.out.println(map.getKey()+" "+map.getValue());
//        }
//        
        
        
//        System.out.println(a);
        

        // Display all orders
//        for (Order o : orders) {
//            System.out.println(o);
//        }
//        orders.stream().
//        filter(o->o.getStatus().equals("Delivered")).
//        forEach(System.out::println);
//        long l=orders.stream().
//        		count();
//        System.out.println(l);
//        	double amount=orders.stream().
//        	filter(o->o.getStatus().equals("Delivered")).
//        	mapToDouble(Order::getAmount).
//        	sum();
//        	System.out.println(amount);
//        	double maxAmoun=orders.stream().
//        			mapToDouble(Order::getAmount).max().orElse(0);
//        	System.out.println(maxAmoun);
//        double minAmount=orders.stream().mapToDouble(Order::getAmount).min().orElse(0);
//        System.out.println(minAmount);
//       orders.stream().map(Order::getCustomerName).distinct().forEach(System.out::println);
//        orders.stream().
//        filter(o->o.getAmount()>50000).
//        map(Order::getCustomerName).forEach(System.out::println);
//        	orders.stream().
//        	sorted((o1,o2)->Double.compare(o2.getAmount(), o1.getAmount())).
//        	map(o->o.getCustomerName()+" "+o.getAmount()).forEach(System.out::println);;
//        	orders.stream().sorted((o1,o2)->Double.compare(o2.getAmount(), o1.getAmount())).
//        	limit(3).
//        	map(o->o.getCustomerName()+" "+o.getAmount()).forEach(System.out::println);
//        	orders.stream().
//        	filter(o->o.getAmount()>50000).filter(o->o.getStatus().equals("Cancelled")).
//        	forEach(System.out::println);
        	
    
    }
}
