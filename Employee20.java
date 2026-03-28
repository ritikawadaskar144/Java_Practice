class Employee20 {
    String name;
    int salary;

    Employee20(String name,int salary){
        this.name=name;
        this.salary=salary;
    }

    void display(){
        System.out.println(name+" "+salary);
    }

    public static void main(String[] args){
        Employee20 e=new Employee20("Ritika",20000);
        e.display();
    }
}