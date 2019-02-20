package imooc.Java校招面试Google面试官亲授.第6章编码技巧;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Node{
    private final int value;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class LinkedListCreator {
    /**
     *
     * @param data
     * @return
     */
    public Node createLinkedList(List<Integer> data){

        if(data.isEmpty()){
            return null;
        }

         Node firstNode = new Node(data.get(0));
//         Node secondNode = new Node(data.get(1));
         Node headOfSublist = createLinkedList(data.subList(1,data.size()));
         firstNode.setNext(headOfSublist);
         return firstNode;
    }

    public static void printLinkedList(Node head){
        while (head!=null){
            System.out.print(head.getValue()+" ");
            head = head.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();
        printLinkedList(creator.createLinkedList(new ArrayList<>()));
        printLinkedList(creator.createLinkedList(Collections.singletonList(1)));
        printLinkedList(creator.createLinkedList(Arrays.asList(1,2,3)));
    }
}

