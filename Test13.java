abstract class Employee {
    abstract void bonus();
}

class Manager extends Employee {
    void bonus(){ System.out.println("20%"); }
}

class Developer extends Employee {
    void bonus(){ System.out.println("10%"); }
}

class Test13 {
    public static void main(String[] args){
        Employee e=new Manager();
        e.bonus();
    }
}