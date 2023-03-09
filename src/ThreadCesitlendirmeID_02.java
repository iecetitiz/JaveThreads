public class ThreadCesitlendirmeID_02 {
    public static void main(String[] args) {
        //oh my got inanamiyorum, daemon threadin bitmesini beklemedi, 5 saniye bitince program da bitti
        //Eger ikisi de userThread olursa ikisiin de bitmesini bekler
        MyThread2 t1 = new MyThread2("User Thread", ThreadRenkler.Magenta, 5);
        System.out.println("is t1 deamon thread " + t1.isDaemon());
        t1.setName("User Thread"); //artik bu koda ihtiyacim yok zaten constructor icinde yaptim
        t1.start();


        MyThread2 t2 = new MyThread2("Daemon Thread", ThreadRenkler.Yellow, 25);
        t2.setName("Daemon Thread");
        t2.setDaemon(true); //boyle yaparak daemon thread'im olmus oluyor
        t2.start(); //bir threadin start() methodu calistirildiktan sonra artik setDaemon diyemem
    }
}

class MyThread2 extends Thread {
    private String color;
    private int sleepingTime;

    public MyThread2(String name, String color, int sleepingTime) {
        super(name);
        this.color = color;
        this.sleepingTime = sleepingTime;

    }

    @Override
    public void run() {
        System.out.println(color + "i will start a process that lasts 10 seconds " + Thread.currentThread().getName());
        //dikkat ettiysen object olusturmadan Green attribute'unu kullandim
        try {
            Thread.sleep(sleepingTime * 1000); //saniyeyi burda ayarliyorum
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(color + "i will finish a process that lasts 10 seconds " + Thread.currentThread().getName());
    }
}
