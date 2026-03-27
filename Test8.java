interface Filterable {
    void applyFilter();
    void resetFilter();
}

class ImageProcessor implements Filterable {
    public void applyFilter(){ System.out.println("Image filter"); }
    public void resetFilter(){ System.out.println("Reset image"); }
}

class DataAnalyzer implements Filterable {
    public void applyFilter(){ System.out.println("Data filter"); }
    public void resetFilter(){ System.out.println("Reset data"); }
}

class Test8 {
    public static void main(String[] args){
        Filterable f=new ImageProcessor();
        f.applyFilter();
        f.resetFilter();
    }
}