package seminars.third.hw;

public class NumberMy {
    public NumberMy() {
    }

    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval(int i) {
        if (i >=25 && i <= 100){
            return true;
        } else return false;
    }
}
