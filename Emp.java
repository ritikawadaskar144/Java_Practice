class Emp {
    static int count=0;
    Emp(){ count++; }

    static void show(){
        System.out.println(count);
    }

    public static void main(String[] args){
        new Emp();
        new Emp();
        Emp.show();
    }
}