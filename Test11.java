class Shape {
    void display(){ System.out.println("Shape"); }
}

class Circle extends Shape {
    void area(){ System.out.println(78.5); }
}

class Rectangle extends Shape {
    void area(){ System.out.println(20); }
}

class Test11 {
    public static void main(String[] args){
        Circle c=new Circle();
        c.display();
        c.area();
    }
}