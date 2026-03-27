class Calc {
    int add(int a,int b){ return a+b; }
    int add(int a,int b,int c){ return a+b+c; }
    double add(double a,double b){ return a+b; }

    public static void main(String[] args){
        Calc c=new Calc();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2,3,4));
        System.out.println(c.add(2.5,3.5));
    }
}