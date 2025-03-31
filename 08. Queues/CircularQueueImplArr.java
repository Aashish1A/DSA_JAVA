public class CircularQueueImplArr {

    public static class Cqa{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[8];

        void add(int val) throws Exception{
            if(size==arr.length) 
                throw new Exception("Queue is Full!");
            else if(size==0){
                f=r=0;
                arr[0] = val;
            }
            else if(r<arr.length-1) 
                arr[++r] = val;
            else if(r==arr.length-1){
                r = 0;
                arr[0] = val;
            }
            size++;
        }

        int remove() throws Exception{
            if(size==0) 
                throw new Exception("Queue is empty");
            else{
                int val = arr[f];
                if(f==arr.length-1) f = 0;
                else f++;
                size--;
                return val;
            }
        }

        int peek() throws Exception{
            if(size==0) 
                throw new Exception("Queue is empty");
            else return arr[f];
        }

        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }

        void display(){
            if(size==0) {
                System.out.println("QUeue is empty");
                return;
            }
            else if(f<=r){
                for(int i=f; i<=r; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            else{ // rear < front
                for(int i=f; i<arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i=0; i<=r; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Cqa q = new Cqa();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }   
}
