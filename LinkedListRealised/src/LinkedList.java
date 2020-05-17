public class LinkedList {

    Node head;

    public LinkedList(){
        head = new Node();
        head.data = "";
        head.link = null;

    }

    public boolean addNode(String item){
        Node node = new Node();
        node.link = head;
        node.data = item;
        head = node;
        return true;
    }

    public boolean addNodeLast(String item){
        Node lastNode = new Node();
        Node curret = head;
        while (curret.link != null){
            curret = curret.link;
        }
        curret.data = item;
        curret.link = lastNode;
        return true;
    }

    public boolean addNodeAnywhere(String item, int index) {
        int count = 0;
        Node counter = head;
        while (counter != null){
            count++;
            counter = counter.link;
        }

        Node anywhere = new Node();
        Node hed = head;
        int traverse;
        if (index > count || index < 1){
            System.out.println("No such Index");
            return false;
        } else {
            traverse = 0;
            while (traverse < (index - 1)){
                hed = hed.link;
                traverse++;
            }
            anywhere.link = hed.link;
            hed.link = anywhere;
            anywhere.data = item;

        }
        return true;
    }

    public void size(){
        int count = 0;
        Node counter = head;
        while (counter != null){
            count++;
            counter = counter.link;
        }

        System.out.println("\n There are " + (count - 1) + " Node(s) plus the Head Node available");
    }

    public void print(){
        Node next = head;
        while (next.link != null){
            System.out.print(next.data + " " + " <--> ");
            next = next.link;
        }
    }

    class Node{

        String data;
        Node link;

    }
}
