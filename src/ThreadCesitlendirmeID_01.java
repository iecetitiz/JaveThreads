public class ThreadCesitlendirmeID_01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();


    }
}


    class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(ThreadRenkler.Magenta + "i will start a process that lasts 10 seconds " + Thread.currentThread().getName());
            //dikkat ettiysen object olusturmadan Green attribute'unu kullandim
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(ThreadRenkler.Green + "i will finish a process that lasts 10 seconds " +  Thread.currentThread().getName());
        }
    }

