abstract class Payment {
    abstract void pay(double amt);
}

class CreditCard extends Payment {
    void pay(double amt){ System.out.println("CC "+amt); }
}

class UPI extends Payment {
    void pay(double amt){ System.out.println("UPI "+amt); }
}

class Test12 {
    public static void main(String[] args){
        Payment p=new UPI();
        p.pay(500);
    }
}