class Employee {
    int empno;
    String ename;
    float basic,hra,da,net;

    float calculate(){
        return basic+hra+da;
    }

    void havedata(int no,String n,float b,float h,float d){
        empno=no; ename=n;
        basic=b; hra=h; da=d;
        net=calculate();
    }

    void display(){
        System.out.println(ename+" "+net);
    }

    public static void main(String[] args){
        Employee e=new Employee();
        e.havedata(1,"Ritika",10000,2000,1500);
        e.display();
    }
}