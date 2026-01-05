package Linked_List;

class Node {
    private String data;
    private Node next;

    Node (String data){
        this.data = data;
    }

    public void setData (String data){
        this.data = data;
    }

    public void setNext (Node next){
        this.next = next;
    }

    public String getData (){
        return this.data;
    }

    public Node getNext (){
        return this.next;
    }
}

class LinkedList{
    private Node head;
    private Node tail;

    public Node getHead (){
        return this.head;
    }

    public Node getTail (){
        return this.tail;
    }

    public void addAtEnd (String data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = this.tail = node;
        }
        else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public void addAtBeginning(String data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = this.tail = node;
        }
        else {
            node.setNext(this.head);
            this.head = node;
        }
    }

    public void printList() {
        Node current = this.head;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.getData());
            if (current.getNext() != null) System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println();
    }
}

public class AddElement {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addAtEnd("Milan");
        list.addAtEnd("Venice");
        list.addAtEnd("Munich");
        list.addAtEnd("Vienna");
        list.addAtBeginning("Nice");
        list.printList();
    }

}
