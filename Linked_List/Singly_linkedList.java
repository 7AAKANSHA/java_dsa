package java_dsa.Linked_List;

public class Singly_linkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node
    {
        int value;//value to be inserted will be stored in it
        Node next;// node type will pint to next one in list

        Node(int value)// constructor to take value when node will be created
        {
            this.value=value;// store value in value variable above
        }
    }

    public Singly_linkedList (int value)
    {
        Node newnode = new Node(value);// newnode obj is created of class Node right side -- runs constructor of Node class
        head = newnode;// pointing to newnode
        tail = newnode;// tail is also pointing to newnode
        length = 1;// right now length is 1 because node will be created for the first time
    }

    public  void printList()
    {
        Node temp = head ;

        while(temp != null)
        {
            System.out.println(temp.value);
            temp=temp.next;

        }
    }
    //--------- INSERTING ELEMENTS TO NODE FROM LAST --------------
    public void append (int value)
    {
        Node newnode = new Node(value);

        // if list is empty
        if(length ==0)
        {
            head = newnode;
            tail = newnode;
        }
        //for nonempty list
        else
        {
            tail.next= newnode;// move tail to new value
            tail = newnode;// storing value in tail
        }
        length++;

    }

    //-- ---------REMOVING LAST NODE FROM LIST----------------------
    public Node remove_last()
    {
            // if list is empty
        if(length ==0) return null;

        // if list is not empty
        Node temp= head;// both temp & pre are pointing to head
        Node pre = head ;
        while(temp.next !=null) // loop will run till temp not gets null value
        {
            pre= temp;// pre will take temp value
            temp=temp.next; // temp will move further, if temp gets null then pre will stop one step before temp
        }
        tail=pre;// then tail will take value from pre
        tail.next=null;// tail will point to null
        length--;// decrement length

//------ edge case if after deleting incase list becomes empty then head & tail will point to null
        if(length==0)
        {
            head=null;
            tail=null;
        }

        return temp;
    }

    //----------INSERTION AT FIRST POSITION IN LIST-----------------
    public void prepend(int value)
    {
        Node newnode = new Node(value);

        //if list is empty
        if(length==0)
        {
            head=newnode;
            tail=newnode;
        }

        // if list is not empty
        else {
            newnode.next=head;// newnode should point to head
            head=newnode;// and store value in head

        }
        length++;
    }

    //-----------REMOVING FIRST NODE FROM LIST--------------

    public Node remove_first()
    {
        // if list is empty
        if(length==0) return null;

        // if list is non-empty
        Node temp = head; // storing head in temp which will be deleted
        head=head.next;// head will be moved to next
        temp.next=null;// then temp will be deleted
        length--;
        //if after decrementing list becomes empty then
        if(length==0) tail=null;

        return temp;
    }

    //----------GET ELEMENT FROM A PARTICULAR INDEX------------------
    public Node get(int index)
    {
        // if length is greater than 0 or index is greater than length itself then null
        if(index <0 || index > length) return null;

        Node temp = head ;
        for(int i =0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;

    }

    //---------------SET ELEMENT AT A PARTICULAR INDEX-------------
    public  boolean set(int index , int value)
    {
        Node temp=get(index);
        if(temp!=null)
        {
            temp.value=value;
            return true;
        }
        return  false;
    }

    //--------------INSERT AT A PARTICULAR INDEX-------------------
    public  boolean insert(int index , int value)
    {
        // if list is out of range
        if(index <0 || index > length) return false;

        // if length is equal to zero then insert values at last
        if(length==0)
        {
            prepend(value);
            return  true;
        }
        // if index matches the given length
        if(index==length)
        {
            append(value);
            return true;
        }

        // if it's in middle then craete new node
        Node newnode = new Node(value);
        Node temp= get(index-1);// set temp to the one step before where index is given
        newnode.next=temp.next;
        temp.next=newnode;
        length++;
        return true;
    }

//    --------REMOVE FROM A PARTICULAR INDEX---------------
    public Node remove(int index )
    {
        if(index < 0 || index > length) return null;

        //if list is has only one element then remove it simply
        if(index==0) return remove_first();

        //if list has elements equal to index
        if(index == length-1) return remove_last();

        // if index is somewhere in the middle
        Node prev=get(index-1);
        Node temp=prev.next;
        prev.next=temp.next;
        temp.next=null;
        length--;
        return temp;
    }

//------------------REVERSE LINKED LIST---------------------
       public void reverse()
       {
           Node temp=head;
           head=tail;
           tail=temp;
           Node after=temp.next;
           Node before=null;

           for(int i=0;i<length;i++)
           {
               after=temp.next;
               temp.next=before;
               before=temp;
               temp=after;
           }
       }
}
