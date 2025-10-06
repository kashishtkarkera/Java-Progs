package noticeboard;

public class ProducerConsumerDemo {
	public static void main(String[] args) {
		 MessageBoard board = new MessageBoard();
	        Producer p = new Producer(board);
	        Consumer c = new Consumer(board);

	        p.start();
	        c.start();

	        try {
	            p.join();
	            c.join();
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }
	}
		
	


