abstract class Ride {
    int d;
    Ride(int d){ this.d=d; }
    abstract void fare();
}

class BikeRide extends Ride {
    BikeRide(int d){ super(d); }
    void fare(){ System.out.println(d*5); }
}

class Test15 {
    public static void main(String[] args){
        Ride r=new BikeRide(10);
        r.fare();
    }
}