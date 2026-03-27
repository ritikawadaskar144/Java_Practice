interface Bank {
    float rate();
}

class SBI implements Bank {
    public float rate(){ return 6.5f; }
}
class HDFC implements Bank {
    public float rate(){ return 7.0f; }
}

class TestBank {
    public static void main(String[] args){
        Bank b=new SBI();
        System.out.println(b.rate());
    }
}