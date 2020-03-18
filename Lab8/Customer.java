import java.util.Random;

public class Customer{

    private int arrivalTime;
    private int initialNumberOfItems;
    private int numberOfItems;
    private final int MAX_NUM_ITEMS =25;

    public Customer(int time){
        Random random;
        random = new Random();

        this.numberOfItems = random.nextInt(MAX_NUM_ITEMS-1)+1;

        this.arrivalTime = time;
        this.initialNumberOfItems= numberOfItems;
    }

    public int getArrivalTime(){
        return arrivalTime;
    }

    public int getNumberOfItems(){
        return numberOfItems;
    }

    public int getNumberOfServedItems(){
        return initialNumberOfItems - numberOfItems;
    }

    public void serve(){
        numberOfItems-1;
    }
}
