class CompoundInterest {
    double principal, rate;
    int time;

    CompoundInterest(double p, double r, int t) {
        principal = p;
        rate = r;
        time = t;
    }

    void calculate() {
        double amount = principal * Math.pow((1 + rate / 100), time);
        System.out.println("Compound Interest = " + (amount - principal));
        System.out.println("Total Amount = " + amount);
    }

    public static void main(String[] args) {
        CompoundInterest obj = new CompoundInterest(5000, 6.5, 5);
        obj.calculate();
    }
}
