package com.example.snehaanandyeluguri.myapplication.LinkedList;

import org.w3c.dom.Node;

/**
 * Created by snehaanandyeluguri on 9/15/18.
 */

public class MidLinkedListSneha {

    public Node head;

    public class Node {
        public int data;
        public Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    /* Inserts a new Node at front of the list. */
    public void push(int nextValue) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node newNode = new Node(nextValue);
         /* 3. Make next of new Node as head */
        newNode.next = head;
          /* 4. Move the head to point to new Node */
        head = newNode;
    }

    /* This function prints contents of linked list
          starting from  the given node */


}
