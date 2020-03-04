public class Dictionary implements Map<String, Integer> {

    private final static int INITIAL_CAPACITY = 10;
    private final static int INCREMENT = 5;
    private int count;

    private Pair[] elems;

    public int getCount() {
      return count;
    }

    public int getCapacity() {
      return elems.length;
    }

    public Dictionary() {
        elems = new Pair[INITIAL_CAPACITY];
        count = 0;
    }

    @Override
    public void put(String key, Integer value) {
        if (count  == elems.length){
            increaseCapacity();
        }

        elems[count] = new Pair (key,value);
        count++;

    }

    private void increaseCapacity() {
        /* Your code here.  Use this in put() where necessary. */
        Pair[] temp;
        temp = new Pair[elems.length + INCREMENT];
        for (int i=0 ; i< elems.length ;i++){
            temp[i] = elems[i];
        }

        elems = temp;
    }

    @Override
    public boolean contains(String key) {

        boolean flag= false;
        int pointer = count-1;

        while (pointer >=0 && flag== false){
            if ( (elems[pointer]).getKey().equals(key)) {
                flag = true;
            }
            else{
                pointer--;
            }
        }

        return flag;
    }

    @Override
    public Integer get(String key) {

        boolean flag= false;
        int pointer= count-1;

        while (pointer>= 0 && flag ==false){
            if ((elems[pointer]).getKey().equals(key)){
                flag = true;
            }
            else{
                pointer--;
            }
        }

        return elems[pointer].getValue();
    }

    @Override
    public void replace(String key, Integer value) {

        boolean flag= false;
        int pointer= count-1;

        while (pointer>= 0 && flag ==false){
            if ((elems[pointer]).getKey().equals(key)){
                flag = true;
            }
            else{
                pointer--;
            }
        }

        elems[pointer].setValue(value);

    }

    @Override
    public Integer remove(String key) {

        boolean flag = false;
        int pointer = count-1;

        while (pointer>= 0 && flag ==false){
            if ((elems[pointer]).getKey().equals(key)){
                flag = true;
            }
            else{
                pointer--;
            }
        }

        Integer temp = elems[pointer].getValue();

        while (pointer < count-1){
            elems[pointer] = elems[pointer+1];
            pointer++;
        }


        count--;
        elems[count] = null;
        return temp;
    }


    @Override
    public String toString() {
      String res;
      res = "Dictionary: {elems = [";
      for (int i = count-1; i >= 0 ; i--) {
          res += elems[i];
          if(i > 0) {
              res += ", ";
          }
      }
      return res +"]}";
    }

}
