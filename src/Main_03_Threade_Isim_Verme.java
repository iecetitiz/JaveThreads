public class Main_03_Threade_Isim_Verme {
    public static void main(String[] args) {
        System.out.println("Program basladi! " + Thread.currentThread().getName()); //bu satiri calistiran thradin ismini getirir
        Isci isci = new Isci();
        isci.setName("THREAD CLASSINDAN THREAD");
        //isci1.run(); //cok ilginc ki hala isci threadim calismiyor, run degil start methodunu kullanmam gerekiyor
        isci.start();
        //The java.lang.Thread.start() method causes this thread to begin execution,
        // the Java Virtual Machine calls the run method of this thread.
        System.out.println("Program bitti!");
    }
}
