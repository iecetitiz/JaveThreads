public class Main_04_RunnableThread {
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


        System.out.println("Program bitti! " + Thread.currentThread().getName());
    }
}
