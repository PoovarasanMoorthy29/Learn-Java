package com.java.dsa.linkedlistdemo;

import java.util.Scanner;

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
    public void insertAtLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;


    }
    public void deleteAtFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    public void deleteAtLast(){
        Node temp=head;
        Node prev=head;
        if(temp==null){
            return ;
        }
        Node currentNode=head;
        while(currentNode.next!=null){
            prev=currentNode;
            currentNode=currentNode.next;
        }
        prev.next=null;

    }
    public void deleteElementByValue(int index){
        Node temp=head;
        Node prev=null;
        int i=1;
        while(index!=i){
            prev=temp;
            temp=temp.next;
            i++;
        }
        assert prev != null;
        prev.next=temp.next;
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
        obj.insertAtLast(10);
        obj.insertAtLast(20);
        obj.insertAtLast(30);

        System.out.println("Before Deletion:");
        obj.display();
        obj.deleteAtLast();
        obj.deleteAtLast();
        System.out.println("\nAfter Deletion:");
        obj.display();

    }
}
