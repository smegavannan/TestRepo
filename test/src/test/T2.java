package test;

public class T2 implements Runnable {
	State s;
	public T2(State s) {
		this.s = s;
	}
	@Override
	public synchronized void run() {
		int i = 4;
		while (i < 50) {
			System.out.println("i value here : "+i);
			System.out.println("s in t2 " + s.getState());
			while (s.getState() != 1) {
				synchronized (s) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			synchronized (s) {
				int j = 1;
				int x = i;
				if (s.getState() == 1)
					for (j = 1; j < 4; j++) {
						System.out.println("t2 " + x);
						x++;
					}
				s.setState(2);
				i = x + 3;
				s.notifyAll();
			}
		}
	}
}
