public class CircularQueueImpLL {

    public static class Node{
        int data;
        Node next;
        Node prev;
        
        Node(int data){
            this.data = data;
        }
    }

    public static class Cql{
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int val){

        }

        int remove(){

        }

        int peek(){

        }

        int size(){

        }

        boolean isEmpty(){
            if(size()==0) return false;
            else return true;
        }
    }


    public static void main(String[] args) {
        Cql cl = new Cql();
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
    }
}
