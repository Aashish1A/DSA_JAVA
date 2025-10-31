import java.util.*;

class ShapeCount {

    static class Segment {
        int start, end, fixed;

        Segment(int p1, int p2, int p3) {
            start = Math.min(p1, p2);
            end = Math.max(p1, p2);
            fixed = p3;
        }

        boolean contains(int point) {
            return point >= start && point <= end;
        }
    }

    private static boolean intersects(Segment hor, Segment ver) {
        return hor.contains(ver.fixed) && ver.contains(hor.fixed);
    }

    private static int findRectangles(List<Segment> horizontal, List<Segment> vertical) {
        int total = 0;

        for (int idx1 = 0; idx1 < horizontal.size(); idx1++) {
            for (int idx2 = idx1 + 1; idx2 < horizontal.size(); idx2++) {

                Segment h1 = horizontal.get(idx1);
                Segment h2 = horizontal.get(idx2);

                int vCount = 0;

                for (Segment v : vertical) {
                    if (intersects(h1, v) && intersects(h2, v)) {
                        vCount++;
                    }
                }

                if (vCount > 1) {
                    total += (vCount * (vCount - 1)) / 2;
                }
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lineCount = input.nextInt();

        List<Segment> horList = new ArrayList<>();
        List<Segment> verList = new ArrayList<>();

        for (int k = 0; k < lineCount; k++) {
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();

            if (y1 == y2) {
                horList.add(new Segment(x1, x2, y1));
            } else if (x1 == x2) {
                verList.add(new Segment(y1, y2, x1));
            }
        }

        int result = findRectangles(horList, verList);
        System.out.print(result);
        input.close();
    }
}