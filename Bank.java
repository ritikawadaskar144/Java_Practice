class Bank {
    final float rate=5;

    void calc(double amt){
        System.out.println(amt*rate/100);
    }

    public static void main(String[] args){
        Bank b=new Bank();
        b.calc(1000);
    }
}