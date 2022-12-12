package les3;

public class Ex1 {

    public final static int BN = 10;

    public int a;

    protected final void sysP() {
        System.out.println(sysP1());
    }

    private int sysP1() {
        int bn = BN;
        bn = 30;

        a = 40;

        return bn;
    }

    public void cE() {
        sysP();
    }

}
