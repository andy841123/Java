import java.util.Date;

public class Factory{
	public static void main(String args[]){
		Channal<Date> queue = new MessageQueue<Date>();
		
		Thread producer = new Thread(new Producer(queue));
		Thread consumer = new Thread(new Consumer(queue));
		
		producer.start();
		consumer.start();
	}
}