package lk.ijse;

class One implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i<=5; i++){
            System.out.println("One");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Two implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i<=5; i++){
            System.out.println("Two");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        One one = new One();
        Two two = new Two();

        Thread threadOne = new Thread(one);
        Thread threadTwo = new Thread(two);

        threadOne.start();
        threadTwo.start();
    }
}