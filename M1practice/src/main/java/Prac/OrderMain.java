package Prac;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderMain {

    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();

        orders.add(new Order(101, "Khasim", "Electronics", 45000, "Hyderabad", "Delivered"));
        orders.add(new Order(102, "Chotu", "Clothing", 3000, "Bangalore", "Pending"));
        orders.add(new Order(103, "Swarna", "Groceries", 1200, "Chennai", "Delivered"));
        orders.add(new Order(104, "Apple", "Electronics", 85000, "Mumbai", "Cancelled"));
        orders.add(new Order(105, "Harika", "Furniture", 25000, "Hyderabad", "Delivered"));
        orders.add(new Order(106, "Ravi", "Clothing", 6000, "Delhi", "Pending"));
        orders.add(new Order(107, "Anu", "Groceries", 900, "Bangalore", "Delivered"));
        orders.add(new Order(108, "Sita", "Electronics", 55000, "Pune", "Delivered"));
        Map<String, List<Order>> byCategory =
        		orders.stream()
        		      .collect(Collectors.groupingBy(Order::getCategory));
        for(Map.Entry<String,List<Order>> li: byCategory.entrySet()) {
        	System.out.println(li.getKey()+" "+li.getValue());
        }
        // Display all orders
//        for (Order o : orders) {
//            System.out.println(o);
//        }
//        orders.stream().filter(e->e.getStatus()=="Delivered").forEach(System.out::println);
//        long l=orders.stream().count();
//        System.out.println(l);
//        double totalAmount=orders.stream().filter(e->e.getStatus().equals("Delivered")).mapToDouble(Order::getAmount).sum();
//        System.out.println(totalAmount);
//        double amount=orders.stream().
//        		filter(i->i.getStatus().equals("Delivered")).
//        		mapToDouble(Order::getAmount).max().orElse(0);
//        System.out.println(amount);
//        double amount=orders.stream().
//        		mapToDouble(Order::getAmount).min()
//        		.orElse(0);
//    System.out.println(amount);
//        orders.stream().map(Order::getCustomerName).distinct().forEach(System.out::println);
////        orders.stream().filter(i->(i.getAmount()>50000)).forEach(System.out::println);
//        orders.stream().
//        sorted((o1,o2)->Double.compare(o2.getAmount(),o1.getAmount()))
//        .map(o->o.getCustomerName()+" : "+o.getAmount())
//        .forEach(System.out::println);
//        orders.stream().
//        sorted((o1,o2)->Double.compare(o2.getAmount(), o1.getAmount())).
//        map(o->o.getCustomerName()+" "+o.getAmount()).forEach(System.out::println);
//        orders.stream().
//        sorted((o1,o2)->Double.compare(o2.getAmount(),o1.getAmount())).limit(3).forEach(System.out::println);
//        Map<String,List<Order>> bycategory=orders.stream().collect(Collectors.groupingBy(Order::getCategory));
//        System.out.println(bycategory);
//        Map<String,Long> count=
//        		orders.stream().collect(Collectors.groupingBy(Order::getCategory,Collectors.counting()));
//        System.out.println(count);
}
}