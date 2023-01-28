package java_dsa.Linked_List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Node has been created");
        Singly_linkedList sl = new Singly_linkedList(4);
        System.out.println("element appended to list");
        sl.append(8);
        sl.append(10);
        sl.append(-1);
        sl.append(17);
//        System.out.println("After appending list is :");
//        sl.printList();
//        sl.remove_last();
//        System.out.println("After deletion of last node");
//        sl.printList();
//        sl.prepend(16);
//        System.out.println("After insertion at first position");
//        sl.printList();
//        sl.remove_first();
//        System.out.println("After deletion of first node");
//        sl.printList();
//          sl.get(2);
//          sl.set(2,20);
//          sl.printList();
//          sl.insert(4,56);
//          sl.printList();
//          sl.remove(4);
//          sl.printList();
            sl.printList();
            sl.reverse();
            sl.printList();
    }
}
