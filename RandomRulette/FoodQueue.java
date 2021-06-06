import java.util.ArrayList;

public class FoodQueue {
    int max;
    ArrayList<String> queue;

    // define queue
    public FoodQueue(int max) {
        this.max=max;
        queue=new ArrayList<>(max);
    }

    // insert queue
    public void enqueue(String e) {
        if(!is_full())
            queue.add(e);
        else
            System.out.println("queue is full!");
    }

    // delete queue
    public String dequeue() {
        if(!is_empty()) {
            String r=queue.get(0);
            queue.remove(0);
            return r;
        }
        else {
            System.out.println("queue is empty!");
            return null;
        }
    }

    public boolean is_empty() {
        if(queue.size()==0)
            return true;
        else
            return false;
    }

    public boolean is_full() {
        if(queue.size()==max)
            return true;
        else
            return false;
    }


    public int size() {
        return queue.size();
    }

    // sending item of queue
    public String[] pass() {
        String[] r=new String[queue.size()];
        for(int i=0; i<queue.size(); i++)
            r[i]=queue.get(i);
        return r;
    }
}
