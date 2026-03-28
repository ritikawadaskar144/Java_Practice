class Book {
    String title,author;
    int price;

    Book(String t,String a,int p){
        title=t; author=a; price=p;
    }

    public static void main(String[] args){
        Book b[]= {
            new Book("Java","James",500),
            new Book("C","Dennis",400)
        };

        for(Book x:b)
            System.out.println(x.title+" "+x.price);
    }
}