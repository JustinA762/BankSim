package edu.temple.cis.c3238.banksim;

public class TestThread extends Thread{

    private final Bank bank;

    public TestThread(Bank b) {
        bank = b;
    }

    @Override
    public synchronized void run()
    {
        bank.test();
    }

}
