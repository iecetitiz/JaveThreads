public class ThreadCesitlendirmeID_03 {
    public static void main(String[] args) {
        System.out.println("where everything is started is this line: " + "name: " + Thread.currentThread().getId() + " id: " + Thread.currentThread().getId());
        //oh my got inanamiyorum, daemon threadin bitmesini beklemedi, 5 saniye bitince program da bitti
        //Eger ikisi de userThread olursa ikisiin de bitmesini bekler
        MyThread3 t1 = new MyThread3("Daemon Thread", ThreadRenkler.Yellow, 5, false);
        System.out.println("is t1 daemon: " + t1.isDaemon());
        System.out.println("t1 id: " + t1.getId()); //id'leri boyle aliyorum
        t1.setName("User Thread");
        t1.start(); //bir threadin start() methodu calistirildiktan sonra artik setDaemon diyemem, ama istersem
        //setName diyebilirim

        //setName kullaniyorum tamam ama bazi durumlarda eger su threadse bunu yap suysa sunu yap demek isteyecegim durumlarda
        //name attribut'unu kullanmak cok kullanisli degildir
        //cunku setName kullanilarak ayni isimde birden fazla thread olusturulmus olabilir


        MyThread3 t2= new MyThread3("Daemon Thread", ThreadRenkler.Cyan, 25, true);
        System.out.println("is t2 daemon: " + t2.isDaemon());
        System.out.println("t2 id: " + t2.getId());
        t2.setName("Daemon Thread");
        t2.start();
    }
}

class MyThread3 extends Thread {
    private String color;
    private int sleepingTime;

    public MyThread3(String name, String color, int sleepingTime, boolean isDaemon) {
        super(name);
        this.color = color;
        this.sleepingTime = sleepingTime;
        setDaemon(isDaemon);
    }

    @Override
    public void run() {
        System.out.println(color + "i will start a process that lasts 10 seconds " + Thread.currentThread().getName());
        //dikkat ettiysen object olusturmadan Green attribute'unu kullandim
        this.setName("new name");
        try {
            Thread.sleep(sleepingTime * 1000); //saniyeyi burda ayarliyorum
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(color + "i will finish a process that lasts 10 seconds " + Thread.currentThread().getName());
    }
}
