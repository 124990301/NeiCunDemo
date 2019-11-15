public class Main {
    private static boolean b = true;
    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1开始");
                while (b){
                    System.out.println("1");
                }
                System.out.println("线程1结束");
            }
        }).start();
        Thread.sleep(2000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2开始");
                b=false;
                System.out.println("线程2结束");
            }
        }).start();

    }

}
