package src.com.cognos;

public sealed class AB implements Add {
    @Override
    public int add(int a, int b) {
        return 0;
    }

    final class ABC extends  AB {

    }
//    @Override
//    public void substract() {
//
//    }
}
