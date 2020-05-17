import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList node = new LinkedList();

        node.addNode("Nzula");
        node.addNode("Grace");
        node.addNode("Musyoka");
        node.addNode("Daniel");
        node.addNode("Samuel");
        node.addNode("Ngombi");

        Scanner scan = new Scanner(System.in);
        System.out.println("1. Add data after head.");
        System.out.println("2. Add data at the end of list.");
        System.out.println("3. Add data at Specific index.");
        System.out.println("4. Print out existing List.");

        int choice = scan.nextInt();
        if (choice == 1 ) {
            System.out.println("How many do you wish to add?");
            int num = scan.nextInt();
            for (int i = 0; i < num; i++) {
                node.addNode(scan.next());

            }

            node.print();
            node.size();

        }else if (choice == 2){
            System.out.println("How many do you wish to add at the end of the list?");
            int um = scan.nextInt();
            for (int i = 0; i < um; i++){
                node.addNodeLast(scan.next());
            }

            node.print();
            node.size();

        }else if (choice == 4) {
            node.print();
            node.size();
        } else if (choice == 3){
            System.out.println("At what index do you wish to add data?");
            int index = scan.nextInt();
            System.out.println("How many do you wish to add?");
            int num = scan.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.println("Enter the data you wish to add");
                String data = scan.next();
                node.addNodeAnywhere(data, index);
            }
            node.print();
            node.size();
        }else{
            System.out.println("Invalid Choice!!!");
        }

//        System.out.println("Do you wish to exit?");
//        String cho = scan.next();
//        if (cho.equalsIgnoreCase("n") || cho.equalsIgnoreCase("no")){
//
//        }
    }
}
