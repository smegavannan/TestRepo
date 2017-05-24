package test;

public class T1 implements Runnable {
	State s;
	public T1(State s) {
		this.s = s;
	}

	@Override
	public void run() {
		int i = 1;
		while (i < 50) {
			System.out.println("i value here : "+i);
			System.out.println("s in t1 " + s.getState());
			while (s.getState() != 3) {
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
				int z = i;
				if (s.getState() == 3)
					for (j = 1; j < 4; j++) {
						System.out.println("t1 " + z);
						z++;
					}
				s.setState(1);
				i = z + 3;
				System.out.println("i set here : "+i);

				s.notifyAll();
			}
		}
	}
}
