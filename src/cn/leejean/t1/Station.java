package cn.leejean.t1;

public class Station extends Thread{
	public Station() {
		// TODO Auto-generated constructor stub
	}
	public Station(String name) {
		super(name);
	}
	static int tick = 20;
	 // 创建一个静态钥匙
    static Object ob = "aa";//值是任意的
	@Override
	public void run() {
		while (tick > 0) {
	            synchronized (ob) {// 这个很重要，必须使用一个锁，
	                // 进去的人会把钥匙拿在手上，出来后才把钥匙拿让出来
	                if (tick > 0) {
	                    System.out.println(getName() + "卖出了第" + tick + "张票");
	                    tick--;
	                } else {
	                    System.out.println("票卖完了");
	                }
	            }
	            try {
	                 sleep(1000);//休息一秒
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
		}
	}
}
