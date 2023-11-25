package product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class LocationData {
    public static void main(String[] args) {

        // initialize the graph base on the Romania map
        Node n1 = new Node("Hà Nội");
        Node n2 = new Node("Hải Phòng");
        Node n3 = new Node("Nam Định");
        Node n4 = new Node("Ninh Bình");
        Node n5 = new Node("Huế");
        Node n6 = new Node("Đà Nẵng");
        Node n7 = new Node("Quảng Nam");
        Node n8 = new Node("TP. Hồ Chí Minh");
        Node n9 = new Node("Cần Thơ");
        Node n10 = new Node("Long Xuyên");
        Node n11 = new Node("Rạch Giá");
        Node n12 = new Node("Vũng Tàu");
        Node n13 = new Node("Biên Hòa");
        Node n14 = new Node("Vĩnh Long");
        Node n15 = new Node("Hạ Long Bay");
        Node n16 = new Node("Phong Nha");
        Node n17 = new Node("Mui Ne");
        Node n18 = new Node("Da Lat");
        Node n19 = new Node("Sa Pa");
        Node n20 = new Node("Hội An");
        Node n21 = new Node("Tam Đảo");
        Node n22 = new Node("Côn Đảo");
        Node n23 = new Node("Bạc Liêu");
        Node n24 = new Node("Cao Bằng");
        Node n25 = new Node("Vịnh Hạ Long");
        Node n26 = new Node("Điện Biên Phủ");
        Node n27 = new Node("Nha Trang");
        Node n28 = new Node("Phú Quốc");
        Node n29 = new Node("Buôn Ma Thuột");
        Node n30 = new Node("Rach Gia");

        n1.adjacencies = new Edge[] { new Edge(n2, 75), new Edge(n4, 140), new Edge(n8, 118) };

        n2.adjacencies = new Edge[] { new Edge(n1, 75), new Edge(n3, 71) };

        n3.adjacencies = new Edge[] { new Edge(n2, 71), new Edge(n4, 151) };

        n4.adjacencies = new Edge[] { new Edge(n1, 140), new Edge(n5, 99), new Edge(n3, 151), new Edge(n6, 80), };

        n5.adjacencies = new Edge[] { new Edge(n4, 99), new Edge(n13, 211) };

        n6.adjacencies = new Edge[] { new Edge(n4, 80), new Edge(n7, 97), new Edge(n12, 146) };

        n7.adjacencies = new Edge[] { new Edge(n6, 97), new Edge(n13, 101), new Edge(n12, 138) };

        n8.adjacencies = new Edge[] { new Edge(n1, 118), new Edge(n9, 111) };

        n9.adjacencies = new Edge[] { new Edge(n8, 111), new Edge(n10, 70) };

        n10.adjacencies = new Edge[] { new Edge(n9, 70), new Edge(n11, 75) };

        n11.adjacencies = new Edge[] { new Edge(n10, 75), new Edge(n12, 120) };

        n12.adjacencies = new Edge[] { new Edge(n11, 120), new Edge(n6, 146), new Edge(n7, 138) };

        n13.adjacencies = new Edge[] { new Edge(n7, 101), new Edge(n14, 90), new Edge(n5, 211) };

        n14.adjacencies = new Edge[] { new Edge(n13, 90) };

        n15.adjacencies = new Edge[] { new Edge(n16, 50), new Edge(n17, 80), new Edge(n20, 120) };

        n16.adjacencies = new Edge[] { new Edge(n15, 50), new Edge(n17, 40) };

        n17.adjacencies = new Edge[] { new Edge(n15, 80), new Edge(n16, 40), new Edge(n18, 60) };

        n18.adjacencies = new Edge[] { new Edge(n17, 60), new Edge(n19, 75) };

        n19.adjacencies = new Edge[] { new Edge(n18, 75), new Edge(n20, 90), new Edge(n21, 110) };

        n20.adjacencies = new Edge[] { new Edge(n15, 120), new Edge(n19, 90), new Edge(n21, 60) };

        n21.adjacencies = new Edge[] { new Edge(n19, 110), new Edge(n20, 60), new Edge(n22, 70) };

        n22.adjacencies = new Edge[] { new Edge(n21, 70), new Edge(n23, 80) };

        n23.adjacencies = new Edge[] { new Edge(n22, 80), new Edge(n24, 100) };

        n24.adjacencies = new Edge[] { new Edge(n23, 100), new Edge(n25, 120) };

        n25.adjacencies = new Edge[] { new Edge(n24, 120), new Edge(n26, 90), new Edge(n27, 110) };

        n26.adjacencies = new Edge[] { new Edge(n25, 90), new Edge(n28, 80) };

        n27.adjacencies = new Edge[] { new Edge(n25, 110), new Edge(n28, 70) };

        n28.adjacencies = new Edge[] { new Edge(n26, 80), new Edge(n27, 70), new Edge(n29, 60) };

        n29.adjacencies = new Edge[] { new Edge(n28, 60), new Edge(n30, 50) };

        n30.adjacencies = new Edge[] { new Edge(n29, 50) };

        UniformCostSearch(n28, n1);

        List<Node> path = printPath(n13);

        System.out.println("Path: " + path);

    }

    public static void UniformCostSearch(Node source, Node goal) {

        source.pathCost = 0;
        PriorityQueue<Node> queue = new PriorityQueue<Node>(20, new Comparator<Node>() {

            // override compare method
            public int compare(Node i, Node j) {
                if (i.pathCost > j.pathCost) {
                    return 1;
                }

                else if (i.pathCost < j.pathCost) {
                    return -1;
                }

                else {
                    return 0;
                }
            }
        }

        );

        queue.add(source);
        Set<Node> explored = new HashSet<Node>();
        boolean found = false;

        // while frontier is not empty
        do {

            Node current = queue.poll();
            explored.add(current);

            if (current.value.equals(goal.value)) {
                found = true;

            }

            for (Edge e : current.adjacencies) {
                Node child = e.target;
                double cost = e.cost;
                child.pathCost = current.pathCost + cost;

                if (!explored.contains(child) && !queue.contains(child)) {

                    child.parent = current;
                    queue.add(child);

                    System.out.println(child);
                    System.out.println(queue);
                    System.out.println();

                }

                else if ((queue.contains(child)) && (child.pathCost > current.pathCost)) {

                    child.parent = current;
                    current = child;

                }

            }
        } while (!queue.isEmpty());

    }

    public static List<Node> printPath(Node target) {
        List<Node> path = new ArrayList<Node>();
        for (Node node = target; node != null; node = node.parent) {
            path.add(node);
        }

        Collections.reverse(path);

        return path;

    }

}