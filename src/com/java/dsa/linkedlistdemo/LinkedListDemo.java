package com.java.dsa.linkedlistdemo;

public class LinkedListDemo {
    Node head;
    public LinkedListDemo(){
        this.head=null;

    }
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
            this.next=null;
        }
    }
    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            if(temp.next==null){
                System.out.print(temp.value);
                temp=temp.next;
            }
            else{
                System.out.print(temp.value+" -> ");
                temp=temp.next;
            }
        }
    }



    public static void main(String[] args) {
        LinkedListDemo obj=new LinkedListDemo();
        obj.insertAtBeginning(10);
        obj.insertAtBeginning(20);
        obj.insertAtBeginning(30);
        obj.display();



    }
}
