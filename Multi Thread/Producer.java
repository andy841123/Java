import java.util.Date;

class Producer implements Runnable{
	private Channal<Date> queue;
	
	public Producer(Channal<Data> queue){
		this.queue = queue;
	}
	
	public void run(){
		Data message;
		
		while(true){
			SleepUtilities.nap();
			
			message = new Date();
			System.out.println("Producer produced" + message);
			queue.send(message);
		}
	}
}