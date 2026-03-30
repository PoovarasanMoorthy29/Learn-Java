package com.java.dsa.linkedlistdemo;

public class LinkedListDemo {
    class Node{
        int data;
        Node next;
        Node(int val){
            this.data=val;
            this.next=null;
        }
    }
    Node head;
    public void insertAtBeginning(int element){
        Node newNode=new Node(element);
        head=newNode;
        newNode.next=null;

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
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
