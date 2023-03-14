public class ThreadPriority {
    public static void main(String[] args) { //ben max oncelik vermis olsam da JVM'ye guven olmuyor ve kendi kafasina gore davranmaya devam ediyor
        TekSayiSay t1 = new TekSayiSay("1");
        TekSayiSay t2 = new TekSayiSay("2");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
    }


}

class TekSayiSay extends Thread {
    String isim;
    String renk;

    public TekSayiSay(String name) {
        super(name);
        isim = name;
        if (name.equals("1")) {
            renk = ThreadRenkler.Cyan;
        } else {
            renk = ThreadRenkler.Magenta;
        }
    }

    public void run() { //bu thread artik tek sayilari yazan bir thread
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(renk + i + " " + Thread.currentThread().getPriority()); //TODO istersem bu degerlerin prioritylerini de okuyabilirim
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
