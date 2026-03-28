class Staff {
    void work(){ System.out.println("Staff work"); }
}

class Doctor extends Staff {
    void work(){ System.out.println("Treat patients"); }
}

class Test16 {
    public static void main(String[] args){
        Staff s=new Doctor();
        s.work();
    }
}