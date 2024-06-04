public class linkedlist {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static linkedlist insert(linkedlist list, int data) {
        Node mynode = new Node(data);

        // no data is inside the linked list
        if(list.head == null) {
            list.head = mynode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = mynode;
        }

        return list;
    }

    public static void printList(linkedlist list) {
        Node currNode = list.head;

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list = insert(list, 10);
        list = insert(list, 20);
        list = insert(list, 0);
        list = insert(list, 70);

        printList(list);
    }
}