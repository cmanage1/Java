public class Cashier{

    private static Queue<Customer> queue;
    private static Customer currentCustomer;
    private int totalCustomerWaitTime;
    private int customersServed;
    private int totalItemsServed;

    public Cashier(){
        this.queue = new ArrayQueue<Customer>();

        this.totalCustomerWaitTime=0;
        this.customersServed = 0;
        this.totalItemsServed= 0;
    }

    public void addCustomer(Customer c){
        queue.enqueue(c);
    }

    public int getQueueSize(){
        return queue.size();
    }

    public void serveCustomers(int currentTime){

        if (currentCustomer == null && queue.isEmpty()) {
            return;

        }

        if (currentCustomer == null){
            currentCustomer = queue.dequeue();
            totalCustomerWaitTime += (currentTime - currentCustomer.getArrivalTime());
            customersServed++;
        }

        currentCustomer.serve();

        if (currentCustomer.getNumberOfItems() ==0 ){
            totalItemsServed+= currentCustomer.getNumberOfServedItems();
            currentCustomer=null; //scrubbing the queue
        }

    }

    public int getTotalCustomerWaitTime(){
        return totalCustomerWaitTime;
    }

    public int getTotalCustomersServed(){
        return customersServed;
    }

    public int getTotalItemsServed(){
        return totalItemsServed;
    }

}
