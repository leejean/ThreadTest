package cn.leejean.t2;

public class T2Main {
	/**
     * ������ABͨ��һ���˻�A�ڹ�̨ȡǮ��B��ATM��ȡǮ
     * */
    public static void main(String[] args) {
        // ʵ����һ�����ж���
        Bank bank = new Bank();
        // ʵ���������ˣ�����ͬһ�����еĶ���
        PersonA pA = new PersonA(bank);
        PersonB pB = new PersonB(bank);
        // �����˿�ʼȡǮ
        pA.start();
        pB.start();
         
    }
}
