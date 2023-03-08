public class Isci extends Thread{ //Thread sinifindan turettigim bir class olusturdum
    //bu siniftan olusturdugum threadi kullanmak icin Main methodunda bu siniftan bir nesne yaratmam gerekiyor
    //Main_02 classini kullaniyorum

    @Override
    public void run() { //onemli olan method iste bu run methodu, uzun suren islemlerimi bu run methodu icine yazicam
        try {
            System.out.println("Isci sinifi calismaya basladi. Thread name: " + Thread.currentThread().getName());
            Thread.sleep(5000); //try catch icine almam gerek, bu satir aslinda 10 saniyelik bir zaman saglayacak bana
            //bu thread current thread'i uyutuyor
            System.out.println("Isci sinifi calismasini bitirdi. Thread name: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
