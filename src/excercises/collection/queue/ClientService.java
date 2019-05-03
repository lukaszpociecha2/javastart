package excercises.collection.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ClientService {

    public static void main(String[] args) {
        Queue<Client> linkedList = new LinkedList<>();
        PriorityQueue<Client> priorityQueue = new PriorityQueue<>();

        Client tom = new Client("Tom");
        Client john = new Client("John");
        Client jessie = new Client("Jessie");

        linkedList.offer(tom);
        linkedList.offer(john);
        linkedList.offer(jessie);

        System.out.println(linkedList.size());
        System.out.println(linkedList.poll());
        System.out.println(linkedList.size());
        System.out.println(((LinkedList<Client>) linkedList).peekLast());
        System.out.println(linkedList.size());






    }

}
