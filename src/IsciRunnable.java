public class IsciRunnable implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("IsciRunable sinifi calismaya basladi. Thread name: " + Thread.currentThread().getName());
            Thread.sleep(5000); //try catch icine almam gerek, bu satir aslinda 10 saniyelik bir zaman saglayacak bana
            //bu thread current thread'i uyutuyor
            System.out.println("IsciRunable sinifi calismasini bitirdi. Thread name: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
