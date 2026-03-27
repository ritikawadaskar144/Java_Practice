class Rectangle {
    int l,b;

    Rectangle(int l,int b){
        this.l=l; this.b=b;
    }

    int area(){ return l*b; }

    public static void main(String[] args){
        Rectangle r1=new Rectangle(4,5);
        Rectangle r2=new Rectangle(5,8);
        System.out.println(r1.area());
        System.out.println(r2.area());
    }
}