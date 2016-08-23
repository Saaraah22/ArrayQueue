package arrqueue;

public class ArrQueue {

    private int QSIZE;
    private int[] queue;
    private int nItems;
    
    public ArrQueue(int size){
        QSIZE = size;
        queue = new int[QSIZE];
    }

    public void showQueue(){
        int i;
        System.out.println("| Q U E U E|");
        for(i = 0; i < QSIZE; i++){
            System.out.printf("Queue[%d] = %d\n", i, queue[i]);
        }   
    }

    private boolean isEmpty(){
        if(nItems == 0){
        System.out.println("QUEUE is EMPTY");
        
        return true;
        
        } else {
            
        return false;
        }
    }

    private boolean isFull(){
        if(nItems == QSIZE){
            System.out.println("Queue is FULL");
            return true;
        } else {
            
        return false;
        }
    }

    public boolean enqueue(int num){
        System.out.println("Trying to enqueue " + num + "... ");
        if(! isFull()){
            queue[nItems] = num;
            System.out.println("..." + num + " succesfully added.");
            nItems++;
            return true;
        } else {
            System.out.println("Failed to enqueue " + num);
            return false;
        }
    }

    public void dequeue(){
        System.out.println("Dequeuing... ");
        if(! isEmpty()){
            int num = queue[0];
            System.out.println("... " + num + "sucessfully removed");
            rearrangeQueue();
        } else {
            System.out.println("Failed to dequeue");
        }
    }

    private void rearrangeQueue(){
        System.out.println("Rearranging Queue");
        int[] temp = new int[nItems];
        int i;
        for(i = 0; i < (nItems - 1); i++){
            temp[i] = queue[i + 1];
        }
        nItems--;
        for(i = 0; i < QSIZE; i++){
            if(i <= nItems){
            queue[i] = temp[i];
        } else {
            queue[i] = 0;
            }
        }
    }

    public int peekFront(){
        return queue[0];
    } 

    public int peekRear(){
        return queue[nItems];
    }
   
    public static void main(String[] args) {
        ArrQueue storage = new ArrQueue(11);
        
        storage.isEmpty();
        System.out.println();
        
        storage.enqueue(0);
        storage.showQueue();
        System.out.println();
        storage.enqueue(1);
        storage.showQueue();
        System.out.println();
        storage.enqueue(2);
        storage.showQueue();
        System.out.println();
        storage.enqueue(3);
        storage.showQueue();
        System.out.println();
        storage.enqueue(4);
        storage.showQueue();
        System.out.println();
        storage.enqueue(5);
        storage.showQueue();
        System.out.println();
        storage.enqueue(6);
        storage.showQueue();
        System.out.println();
        storage.enqueue(7);
        storage.showQueue();
        System.out.println();
        storage.enqueue(8);
        storage.showQueue();
        System.out.println();
        storage.enqueue(9);
        storage.showQueue();
        System.out.println();
       
        
        storage.showQueue();
        
        
         System.out.println("\nR E A R: " + storage.peekRear());
         System.out.println("F R O N T: " + storage.peekFront() + "\n");
         
        storage.enqueue(10);
        storage.showQueue();
        System.out.println();
        storage.enqueue(11);
        storage.showQueue();
        System.out.println();
        
        storage.isFull();
        
        storage.dequeue();
        storage.showQueue();
        System.out.println();
        storage.dequeue();
        storage.showQueue();
        System.out.println();
        storage.dequeue();
        storage.showQueue();
        System.out.println();
        storage.dequeue();
        storage.showQueue();
        System.out.println();
        storage.dequeue();
        storage.showQueue();
        System.out.println();
        storage.dequeue();
        storage.showQueue();
        System.out.println();
        storage.dequeue();
        storage.showQueue();
        System.out.println();
        storage.dequeue();
        storage.showQueue();
        System.out.println();
        storage.dequeue();
        storage.showQueue();
        System.out.println();
        storage.dequeue();
        storage.showQueue();
        System.out.println();
        storage.dequeue();
        storage.showQueue();
        System.out.println();
        
        System.out.println("\nR E A R: " + storage.peekRear());
        System.out.println("F R O N T: " + storage.peekFront() + "\n");
        
        storage.isEmpty();
       
        
    }
}
    

    

