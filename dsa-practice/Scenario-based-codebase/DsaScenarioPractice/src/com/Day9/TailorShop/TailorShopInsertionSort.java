package com.Day9.TailorShop;

public class TailorShopInsertionSort {
	
	//order class
	static class Order{
		int orderId;
		String customerName;
		int deliveryDeadline;
		
		Order(int orderId, String cutomerName, int deliveryDeadline){
			this.orderId=orderId;
			this.customerName=customerName;
			this.deliveryDeadline=deliveryDeadline;
			
		}
		void displayOrder() {
			System.out.println("orderid"+orderId+"customer"+customerName+"deadline"+deliveryDeadline);
			
		}
	}
	
	static void insertionSort(Order[] orders) {
		for(int i=1;i<orders.length;i++) {
			Order currentOrder=orders[i];
			int j=i-1;
			
			while(j>=0 && orders[j].deliveryDeadline>currentOrder.deliveryDeadline) {
				orders[j+1]=orders[j];
				j--;
			}
			orders[j+1]=currentOrder;
		}
	}
	public static void main(String [] args) {
	Order[] orders= {
			new Order(101, "Ravi", 5),
            new Order(102, "Amit", 2),
            new Order(103, "Neha", 4),
            new Order(104, "aman", 1),
            new Order(105, "nikhil", 3)
        };
   System.out.println("order before sorting");
   for(Order order:orders) {
	   order.displayOrder();
   }
   insertionSort(orders);

   System.out.println("\nOrders AFTER sorting by delivery deadline:");
   for (Order order : orders) {
       order.displayOrder();
}
}
}