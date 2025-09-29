import java.util.ArrayList;

class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }
    
    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    public void insert(T value){
        list.add(value);
        upHeap(list.size() - 1);
    }

    private void upHeap(int index) {
        if(index == 0) return;
        int parentIndex = parent(index);
        if(list.get(index).compareTo(list.get(parentIndex)) < 0){
            swap(index, parentIndex);
            upHeap(parentIndex);
        }
    }

    public T remove() throws Exception {
        if(list.isEmpty()) throw new Exception("Heap is empty");
        T root = list.get(0);
        T lastElement = list.remove(list.size() - 1);
        if(!list.isEmpty()){
            list.set(0, lastElement);
            downHeap(0);
        }
        return root;
    }

    private void downHeap(int index) {
        int left = leftChild(index);
        int right = rightChild(index);
        int min = index;

        if(left < list.size() && list.get(left).compareTo(list.get(min)) < 0){
            min = left;
        }
        if(right < list.size() && list.get(right).compareTo(list.get(min)) < 0){
            min = right;
        }
        if(min != index){
            swap(min, index);
            downHeap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> sortedList = new ArrayList<>();
        while(!list.isEmpty()){
            sortedList.add(this.remove());
        }
        return sortedList;
    }

}
