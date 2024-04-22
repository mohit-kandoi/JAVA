package Extra;

import java.util.Scanner;
import java.util.UUID;

public class TicketSoftware {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Customers : ");
        int numberOfCustomers = sc.nextInt();
        Customer customer[] = new Customer[numberOfCustomers];
        System.out.println("Enter customer name and age: ");
        for(int i = 0; i < numberOfCustomers; i++){
            String name = sc.next();
            int age = sc.nextInt();
            customer[i] = new Customer(name,age);
        }
        TicketManager ticketManager = new TicketManager(customer);

    }

    public static void printDetails(Ticket ticket){
        System.out.println("Ticket ID: " + ticket.ticketId);
        for(int i=0; i<ticket.customer.length; i++){
            Customer currentCustomer = ticket.customer[i];
            System.out.println(currentCustomer.getName() + " (" + currentCustomer.getAge() + ")");
        }
        System.out.println("TicketPrice: "+ ticket.ticketPrice);
    }

    static class Customer{
        private String name;
        private int age;
        public Customer(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    static class Ticket{
        private String ticketId;
        private Customer customer[];
        private int ticketPrice;
        public Ticket(String ticketId,Customer customer[],int ticketPrice){
            this.customer = customer;
            this.ticketId = ticketId;
            this.ticketPrice = ticketPrice;
        }

        public String getTicketId() {
            return ticketId;
        }

        public void setTicketId(String ticketId) {
            this.ticketId = ticketId;
        }

        public Customer[] getCustomer() {
            return customer;
        }

        public void setCustomer(Customer[] customer) {
            this.customer = customer;
        }

        public int getTicketPrice() {
            return ticketPrice;
        }

        public void setTicketPrice(int ticketPrice) {
            this.ticketPrice = ticketPrice;
        }
    }

    static class TicketManager{
        private Ticket ticket;
        TicketManager(Customer customer[]){
            int totalPrice = 0;
            String ticketId = UUID.randomUUID().toString();
            for(int i=0; i< customer.length; i++){
                int currentCustomerAge = customer[i].getAge();
                if(currentCustomerAge <= 2){
                    totalPrice = totalPrice + 0;
                }
                else if(currentCustomerAge > 2 && currentCustomerAge < 18){
                    totalPrice = totalPrice + 100;
                }
                else if(currentCustomerAge >= 18 && currentCustomerAge < 60){
                    totalPrice = totalPrice + 500;
                }else {
                    totalPrice = totalPrice + 300;
                }
            }
            Ticket ticket = new Ticket(ticketId,customer,totalPrice);
            printDetails(ticket);
        }
    }
}
