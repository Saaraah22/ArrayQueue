public class ArrayQeue{
	int QSIZE;
	private int[]qeue;
	private int nItems;

	public ArrayQeue(int size){
		this.QSIZE = size;
		this.qeue = new int[this.QSIZE];
	}

	public void showQueue(){
		for (int i=0;i< this.QSIZE ; i++ ) {
			System.out.printf("QUEUE[" + i +"] =" + this.queue[i] + "\n");
			
		}
	}

	public boolean isFull(){
		if(this.nItems == this.QSIZE){
			System.out.println("QUEUE is FULL");
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isEmpty(){
		if(this.nItems == 0){
			System.out.println("QUEUE is Empty");
			return true;
		}
		else {
			return false;
		}

	public boolean enqueue(int num){
		System.out.println("Trying to enqueue " + num + "...");
		if (!this.isFull()) {
			this.queue[nItems] = num;
			System.out.println("\t" + "Added" + num);
			this.nItems++;
			return true;
		}
		else {
			System.out.println("Failed to enqueue" + num);
			return false;
		}

		public int dequeue(){

		}

		private void rearrangeQueue() {

		}

		public int peekRear() {
			return this.queue[this.nItems-1];
		}

			
		}
	}
	}
}