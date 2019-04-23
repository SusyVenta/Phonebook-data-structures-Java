package com.ventafri.linkedlist;
import java.io.*;

public class PhoneBook {
    private Contact head; // head of list

    // Method to insert a new node
    public static PhoneBook insert(PhoneBook list, int data)
    {
        // Create a new node with given data
        Contact new_node = new Contact(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Contact last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(PhoneBook list)
    {
        Contact currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }


}
