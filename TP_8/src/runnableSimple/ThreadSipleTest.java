package runnableSimple;

import java.util.ArrayList;
import java.util.List;


public class ThreadSipleTest {
	public static void main (String[] args) throws InterruptedException {
		
		List<Thread> hilos = new ArrayList<Thread>();
		
		for (int i = 0; i < 10; i++) {
			hilos.add(new Thread(new RunnableSimple("Pais"+i)));
		}

		for(Thread t : hilos) {
			t.start();
		}

		for(Thread t : hilos) {
			t.join();
		}		
		
		System.out.println("FINALIZO EL PROGRAMA");
	}
}

