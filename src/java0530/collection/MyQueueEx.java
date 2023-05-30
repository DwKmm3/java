package java0530.collection;

public class MyQueueEx {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
