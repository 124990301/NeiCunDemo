public class Demo2 {
    private static People people = new People();
    public static void main(String[] args) throws InterruptedException {

        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1开始");
                for (int i=0;i<1000;i++) {
                    people.toString();
                }
                System.out.println("线程1结束");
            }
        });
        t1.start();
//        Thread.sleep(200);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2开始");
                people.name = "ls";
                people.age = 30;
                System.out.println("线程2结束");
            }
        }).start();

    }

}


class People{
    public String name = "zs";
    public int age = 20;

    public String toString(){
        System.out.println("name:"+this.name+",age:"+this.age);
        return this.name+this.age;
    }
}
