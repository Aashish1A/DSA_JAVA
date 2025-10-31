import java.util.*;

public class MinChairReq {

    private static boolean swap(int[] a, int[] b) {
        if (a[2] != b[2]) return a[2] < b[2];
        if (a[0] != b[0]) return a[0] > b[0];
        return a[1] > b[1];
    }

    private static void arrangeOrders(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (swap(arr[i], arr[j])) {
                    int[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void sortEvents(int[] times, int[] types, int len) {
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (times[j] > times[j + 1] || 
                    (times[j] == times[j + 1] && types[j] > types[j + 1])) {
                    
                    int t1 = times[j];
                    times[j] = times[j + 1];
                    times[j + 1] = t1;
                    
                    int t2 = types[j];
                    types[j] = types[j + 1];
                    types[j + 1] = t2;
                }
            }
        }
    }

    private static int findMax(int[][] ranges, int size) {
        if (size == 0) return 0;
        
        int[] times = new int[size * 2];
        int[] types = new int[size * 2];
        
        for (int i = 0; i < size; i++) {
            times[i * 2] = ranges[i][0];
            types[i * 2] = 1;
            times[i * 2 + 1] = ranges[i][1];
            types[i * 2 + 1] = -1;
        }
        
        sortEvents(times, types, size * 2);
        
        int running = 0;
        int peak = 0;
        
        for (int i = 0; i < size * 2; i++) {
            running += types[i];
            if (running > peak) {
                peak = running;
            }
        }
        
        return peak;
    }

    private static int processOrders(int[][] orders) {
        int[][] periods = new int[orders.length][2];
        int count = 0;
        int nextTime = 0;
        
        for (int i = 0; i < orders.length; i++) {
            int come = orders[i][0];
            int work = orders[i][1];
            int go = nextTime > come ? nextTime : come;
            
            if (go > come) {
                periods[count][0] = come;
                periods[count][1] = go;
                count++;
            }
            
            nextTime = go + work;
        }
        
        return findMax(periods, count);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] data = new int[n][3];
        for (int k = 0; k < n; k++) {
            data[k][0] = sc.nextInt();
            data[k][1] = sc.nextInt();
            data[k][2] = sc.nextInt();
        }
        
        arrangeOrders(data);
        
        int result = processOrders(data);
        System.out.print(result);
        sc.close();
    }
}