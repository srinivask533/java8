package src.com.cognos;

import java.util.concurrent.Callable;

class ThreadC extends  Thread{

}
class ThreadRunnable implements Runnable {
    public void run(){

    }
}

class ThreadCollable implements Callable {
    @Override
    public Object call() throws Exception {
        return 10;
    }
}

public class ThreadCreations {
 public static void main(){
            Thread thread = new Thread();

 }
}
