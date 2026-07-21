package src.com.sortingalgos;

import java.util.HashMap;
import java.util.Map;

class Node {
    int key;
    int value;
    Node next;
    Node prev;
    Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

public class LRU {
    int capacity;
    Map<Integer, Node> map;

     Node head;
     Node tail;
    LRU(int capacity){
        this.capacity = capacity;
        map  = new HashMap<>();
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        head.next = tail;
        tail.next = head;

    }

    public void put(int key, int value){
        if(map.containsKey(key)){
           remove(map.get(key));
        }
        Node node = new Node(key, value);
        node.value = value;
        insert(node);

        map.put(key, node);

        if (map.size() > capacity) {

            Node lru = tail.prev;

            remove(lru);

            map.remove(lru.key);
        }
    }
    private void insert(Node node){
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    private void display(){
        Node curr = head.next;
        while(curr != tail ){
            System.out.println("("+curr.key +", "+curr.value + ")");
            curr = curr.next;
        }
        System.out.println();
    }

    private void remove(Node node){
node.prev.next = node.next;
node.next.prev = node.prev;
    }
    private int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        remove(node);
        insert(node);
        return node.value;
    }
    public static void main(String[] args){
        LRU lru  = new LRU(2);
        lru.put(1,10);
        lru.put(2,20);
        lru.display();

        System.out.println(lru.get(1));
        lru.display();

        lru.put(3,30);
        lru.display();
        System.out.println(lru.get(2));
        lru.display();

        lru.put(4,40);
        lru.display();

        System.out.println(lru.get(1));
        System.out.println(lru.get(3));
        System.out.println(lru.get(4));
    }



}
