public class PriorityInterrupJoin {
    public static void main(String[] args) {

    }


}

class TekSayiSay extends Thread {
    String isim;
    String renk;

    public TekSayiSay(String name) {
        super(name);
        isim = name;
    }

    public void run() { //bu thread artik tek sayilari yazan bir thread
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
