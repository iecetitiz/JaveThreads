public class Main_01 {
    public static void main(String[] args) {
        //Thread olustururken iki tane ana  yontemimiz var:
        //1-Thread sinifindan extend ederek ()
        //2-Runnable Interface'ini implement ederek (Bir sinif olusturursun ve bu sinif runnable interface'ini implement eder)
        //Eger Runnable interface'i ile bir thread olusturursam bu sefer direkt obje yaratarak degil, Thread objectine
        //bu threadi parametre olarak yazarak olusturuyorum

        //Runnable ile implement etmemdeki amacö eger benim classim hali hali hazirda baska bir classi extend ettiyse onu bir de
        //Thread sinifindan implement edemeyecegim icin boyle bir kullanim var
        //Ama tabi o da yine aslinda gunun sonunda Thread sinifini kullaniyor


        System.out.println("Program basladi! " + Thread.currentThread().getName()); //bu satiri calistiran thradin ismini getirir

        try {
            Thread.sleep(5000); //bu threadi calistirarak mevcut thread'i 10 sn uyutmus oldum, yani main threadi
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program bitti!");
    }
}