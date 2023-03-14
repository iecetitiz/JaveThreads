public class ThreadInterrupt {
    public static void main(String[] args) { //ben max oncelik vermis olsam da JVM'ye guven olmuyor ve kendi kafasina gore davranmaya devam ediyor
        CiftSayiSay t1 = new CiftSayiSay("1");

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

    }


}

class CiftSayiSay extends Thread {
    String isim;
    String renk;

    public CiftSayiSay(String name) {
        super(name);
        isim = name;
        if (name.equals("1")) {
            renk = ThreadRenkler.Cyan;
        } else {
            renk = ThreadRenkler.Magenta;
        }
    }

    public void run() { //bu thread artik cift sayilari yazan bir thread
        for (int i = 0; i < 20; i++) {
            if(i == 6) {
                interrupt();
            }
            if (i % 2 == 0) {
                System.out.println(isInterrupted()); //todo interrupted exception throw edilmesi icin sleep halde beklemesine gerek yok, eger interruptedken sleep cagrilirsa yine
                //exception throw edilir
                System.out.println(renk + i + " " + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                    return; //todo return demek o anki methodu sonlandir anlamina geliyor
                }
            }
        }
    }
}
