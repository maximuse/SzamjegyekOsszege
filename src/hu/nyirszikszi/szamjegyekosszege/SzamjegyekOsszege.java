package hu.nyirszikszi.szamjegyekosszege;

public class SzamjegyekOsszege {
    private int n;

    public SzamjegyekOsszege(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getOsszeg() {
        String s = Integer.toString(this.n);
        int l = String.valueOf(this.n).length();
        int r = 0;

        for(int i=0; i<l; i++) {
            char c = s.charAt(i);
            int v = Character.getNumericValue(c);
            r += v;
        }

        return r;
    }
}