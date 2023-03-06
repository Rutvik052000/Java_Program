package QSpider.toString;

public class book {
    String name;
    int page;
    book(String name, int page)
    {
        this.name=name;
        this.page=page;
    }

        public String toString()
        {
            return "Name :" + name +", pages " +page;


        }


    public static void main(String[] args) {
        book b1 = new book("java",1000);
        book b2 = new book("python", 5000);
        System.out.println(b1);
        System.out.println(b2);
    }
}
