package cn.leejean.t1;

/**
 * 1.Ʊ��Ҫʹ��ͬһ����ֵ̬
   2.Ϊ��֤�����������ͬһ��Ʊ����Ҫjava���߳�ͬ������
                      ���˼·��1.����һ��վ̨��Station���̳�Thread����дrun��������run��������ִ����Ʊ������
                      ��ƱҪʹ��ͬ����������һ��վ̨������Ʊʱ������վ̨Ҫ������Ʊ���꣡2.����������������
 * @author Admin
 *
 */
public class T1Main {
	public static void main(String[] args) {
		//ʵ����վ̨���󣬲�Ϊÿһ��վ̨ȡ����
        Station station1=new Station("����1");
        Station station2=new Station("����2");
        Station station3=new Station("����3");
       // ��ÿһ��վ̨������Կ�ʼ����
        station1.start();
        station2.start();
        station3.start();
	}
}
