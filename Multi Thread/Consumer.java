import java.util.Date;

class Consumer implements Runnable{
	private Channel<Date> queue;
	
	public Consumer(Channal<Date> queue){
		this.queue = queue;
	}
	
	public void run(){
		Date message;
		
		while(true){
			SleepUtilities.nap();
			
			message = queue.receive();
			
			if(message != null)
				System.out.println("Consumer consumed " + message);
		}
	}
}