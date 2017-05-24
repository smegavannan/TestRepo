package test;

public class T3 implements Runnable {
	State s;
	public T3(State s) {
		this.s = s;
	}
	@Override
	public synchronized void run() {
		int i = 7;
		while (i < 50) {
			System.out.println("i value here : "+i);
			System.out.println("s in t3 " + s.getState());
			while (s.getState() != 2) {
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
				int y = i;
				if (s.getState() == 2)
					for (j = 1; j < 4; j++) {
						System.out.println("t3 " + y);
						y++;
					}

				i = y + 3;
				s.setState(3);
				s.notifyAll();
			}
		}
	}
}