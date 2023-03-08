public class Main_05_ReferanssizThread {
    public static void main(String[] args) {
        System.out.println("Program basladi! " + Thread.currentThread().getName()); //bu satiri calistiran thradin ismini getirir
        Isci isci1 = new Isci();
        isci1.setName("THREAD CLASSINDAN THREAD");
        //isci1.run(); //cok ilginc ki hala isci threadim calismiyor, run degil start methodunu kullanmam gerekiyor
        isci1.start();
        //The java.lang.Thread.start() method causes this thread to begin execution,
        // the Java Virtual Machine calls the run method of this thread.

        IsciRunnable isciRunnable = new IsciRunnable();
        Thread isci2 = new Thread(isciRunnable); // Bu class Runnable interface'i implement etmis bir arguman isteyecek
        isci2.setName("ISCI FROM RUNNABLE INTERFACE");
        isci2.start();

        //bu su an anlik bir nesne, buraya baska bir yerden ulasmam soz konusu degil
        new Thread(new Runnable() { //boyle bir kullanim da mumkun
            @Override
            public void run() {
                try {
                    System.out.println("Basi bos bir thread calismaya basladi. Thread name: " + Thread.currentThread().getName());
                    Thread.sleep(5000); //try catch icine almam gerek, bu satir aslinda 10 saniyelik bir zaman saglayacak bana
                    //bu thread current thread'i uyutuyor
                    System.out.println("Basi bos bir thread calismasini bitirdi. Thread name: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        System.out.println("Program bitti! " + Thread.currentThread().getName());
    }
}
