public class SecurityAgent{

    Combination secret;
    String agent;

    public SecurityAgent(){
        int first = (int) (Math.random()*5) + 1;
        int second = (int) (Math.random()*5) + 1;
        int third = (int) (Math.random()*5) + 1;
        secret = new Combination(first, second, third);
    }

    public static void main(String[] args) {
        Combination[] combinations= new Combination[5];
        //System.out.println(secret);
    }

    public DoorLock getDoorLock() {
        return secret;
    }

    public DoorLock activateDoorLock(){
    }
}
