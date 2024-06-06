package Tests;

public class LinkedList {
    
    static Node head;

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    
    public LinkedList insert(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
        }
        else{
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return this;
    }
    
   
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = list.insert(1);
        list = list.insert(9);
        list = list.insert(4);
        list = list.insert(6);
        list = list.insert(3);
        list = list.insert(9);
        
       System.out.println("Before LastDuplicate");

        PrintList(list);
        
        System.out.println();

        LinkedList Newlist = removeLastDuplicate(list);

        System.out.println("ModifiedList");

        PrintList(Newlist);
        
        
    }
    public static LinkedList removeLastDuplicate(LinkedList list){
        LinkedList newList = new LinkedList();
        Node LastNode = head;
        while(LastNode.next!=null){
            LastNode = LastNode.next;
        }
        
        Node Current = head;
        Node Previous = null;
        while(Current!=LastNode){
            if(Current.data == LastNode.data){
                if(Previous!=null){
                    Previous.next = Current.next;
                }
                else{
                    head = Current.next;
                }
                return newList;
            }
            
            Previous = Current;
            Current = Current.next;
        } 
        return newList;  
    }

    public static void PrintList(LinkedList list){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
