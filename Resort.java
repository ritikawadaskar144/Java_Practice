class Resort {
    int rno, days;
    String name;
    float charges;

    void getinfo(int r,String n,float c,int d){
        rno=r; name=n; charges=c; days=d;
    }

    float compute(){
        float amt=days*charges;
        if(amt>11000) amt*=1.02;
        return amt;
    }

    void display(){
        System.out.println(name+" "+compute());
    }

    public static void main(String[] args){
        Resort r=new Resort();
        r.getinfo(1,"Ritika",2000,6);
        r.display();
    }
}