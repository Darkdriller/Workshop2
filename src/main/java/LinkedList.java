public class LinkedList <T>{

    /*
        @Author Dhruvjyoti Swain
        Class: Linked List
     */
    Node<T> head;
    //add Element at the end of linkedList
    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if (this.head == null){
            //Empty LL make head NewNOde
            this.head = newNode;
        }
        else{
            //traverse to end of LL
            Node<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void removeDuplicates(){
        Node<T> current = head;
        //Initial traversal goes till last node
        while (current != null && current.next != null){
            Node<T> temp = current;
            //second traversal (o(n^2))
            while(temp.next != null){
                if(current.data.equals(temp.next.data)){
                    temp.next = temp.next.next;
                }
                else{
                    temp = temp.next;
                }
            }
            current = current.next;
        }
    }
    public void printList(){
        Node<T> current = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }


}
