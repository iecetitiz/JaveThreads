public class Main_02 {
    public static void main(String[] args) {
        //Ben simdi islemimi asagidaki gibi yaptigimda main fonksiyonu kisa surecek islemi kendi basina hallediyor, isi bitince de
        //isci threadi calisiyor
        System.out.println("Program basladi! " + Thread.currentThread().getName()); //bu satiri calistiran thradin ismini getirir
        Isci isci1 = new Isci();
        //isci1.run(); //cok ilginc ki hala isci threadim calismiyor, run degil start methodunu kullanmam gerekiyor
        isci1.start();
        System.out.println("Program bitti!");
    }
}
