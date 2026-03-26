class CarRental {
    int id;
    String type;
    float rent;

    void getCar(int i, String t) {
        id = i; type = t;
    }

    float getRent() {
        if(type.equals("Small")) rent = 1000;
        else if(type.equals("Van")) rent = 800;
        else rent = 2500;
        return rent;
    }

    void show() {
        System.out.println(id + " " + type + " " + getRent());
    }

    public static void main(String[] args) {
        CarRental c = new CarRental();
        c.getCar(1,"SUV");
        c.show();
    }
}