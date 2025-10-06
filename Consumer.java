package noticeboard;

public class Consumer extends Thread {
	 private MessageBoard board;

	    public Consumer(MessageBoard b) {
	        this.board = b;
	    }

	    public void run() {
	        String msg;
	        while (!(msg = board.get()).equals("DONE")) {
	        }
	    }
	}

	

	


