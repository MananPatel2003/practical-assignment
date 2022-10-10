public class Stack_4 {
    public static void main(String[] args) {

        Queue_4 queue = new Queue_4();

        for (int i = 0; i < 20; i++) {
            queue.enqueue(i + 1);
        }

        int queueSize = queue.getSize();
        System.out.println("Values in the queue are: ");
        for (int j = 0; j < queueSize; j++) {
            System.out.printf("Value %d is: %d%n",
                    j + 1, queue.dequeue());
        }
    }
}