import java.util.LinkedList;
import java.util.NoSuchElementException;

public class multiThread extends Thread{
	
	public static void main(String[] args) {
		Store store = new Store();
		(new Thread(new Producer(store))).start();
		(new Thread(new Producer(store))).start();
		(new Thread(new Producer(store))).start();
		(new Thread(new Producer(store))).start();
		
		(new Thread(new Consumer(store,1))).start();
		(new Thread(new Consumer(store,2))).start();
		(new Thread(new Consumer(store,3))).start();
		(new Thread(new Consumer(store,4))).start();
	}
}
class Store {
		private LinkedList<Integer> products = new LinkedList<Integer>();
		private int items = 0;
		public void add(Integer product) {
			products.addLast(product);
			items++;
			System.out.println("produce " + items + " items");
			//notifyAll();
		}
		public Integer get() {
			Integer product;
			try{
				product = products.removeFirst();
			}catch(NoSuchElementException e){
				try{
					Thread.sleep((int) (Math.random() * 3000));
				}catch(InterruptedException ie){
				ie.printStackTrace();
				}
				try{
					product = products.removeFirst();
				}catch(NoSuchElementException ne){
					try{
						Thread.sleep((int) (Math.random() * 3000));
					}catch(InterruptedException iie){
						iie.printStackTrace();
					}
					product = products.removeFirst();
				}
			}
			//notifyAll();
			return product;
		}
		public void init(){
			items = 0;
		}
	} 

class Producer implements Runnable {
	private Store store;   
	Producer(Store store) {
		this.store = store;
	}
	public void run() {
		for(int product = 1; product <= 10; product++) {
			try {
				
				Thread.sleep((int) (Math.random() * 2000));
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("Productors ");
			store.add(product);
			
		}      
	}
} 
class Consumer implements Runnable {
	private Store store;
	private int num;
	   
	Consumer(Store store,int num) {
		this.store = store;
		this.num = num;
	}
	   
	public void run() {
		for(int i = 1; i <= 10; i++) {
			try {
				// wait for a random time
				Thread.sleep((int) (Math.random() * 3000));
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Consumer "+num+" consumed "+store.get()+" items");
		}
	}
} 