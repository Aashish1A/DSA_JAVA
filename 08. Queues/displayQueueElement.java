import java.util.LinkedList;
import java.util.Queue;

public class displayQueueElement {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Queue <Integer> helper = new LinkedList<>();
        while(q.size()>0){
            helper.add(q.remove());
        }
        while(helper.size()>0){
            int x = helper.remove();
            System.out.print(x + " ");
            q.add(x);
        }
    }    
}
