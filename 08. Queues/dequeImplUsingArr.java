public class dequeImplUsingArr {

    public static class dequeArr{
        int[] arr = new int[50];
        int f = -1;
        int r = -1;
        int size = 0;

        void addFirst(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(f==-1){
                f =  r = 0;
                arr[0] = val;
            }else{
                arr[f-1] = val;
                f--;
            }
            size++;
        }

        void addLast(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full!");
                return;
            }
            if(f==-1){
                f =  r = 0;
                arr[0] = val;
            } 
            else{
                arr[r+1] = val;
                r++;
            }
            size++;
        }


        int removeFirst(){
            if(size()==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }

        int removeLast(){
            if(size()==0){
                System.out.println("Queue is empty");
                return -1;
            }
            r++;
            size--;
            return arr[r-1];
        }

       int getFirst(){
            if(size()==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[f];
        }

        int getLast(){
            if(size()==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[r];
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size()==0) return true;
            else return false;
        }

        void display(){
            if(size()==0) System.out.println("Queue is empty!");
            else for(int i=f; i<=r; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        dequeArr d = new dequeArr();
        d.addFirst(5);
        d.addLast(1);
        d.addLast(2);
        d.addLast(3);
        d.addLast(4);
        d.addFirst(6);
        d.addLast(7);
        d.display();
        d.removeFirst();
        d.display();
        d.removeLast();
        d.display();
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        System.out.println(d.size());
    }
}
