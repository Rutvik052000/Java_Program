package QSpider.Encapsulation.sim;

public class card {
    private String service_provider; // readable
    private long number;               // readable
    private String customer;           // readable/write
    private String color;               // writeble

    public String getservice_provider()
    {
        return service_provider;
    }
    public long getnumber()
    {
        return number;
    }
    public String getcustomer()
    {
        return customer;
    }
    public void setcustomer(String customer)
    {
        this.customer = customer;
    }
    public void setcolor(String color)
    {
       this.color = color;
    }
    //Details of customer
    card(String service_provider, long number, String customer, String color)
    {
        this.service_provider = service_provider;
        this.number = number;
        this.customer = customer;
        this.color= color;
    }
    void detail()
    {
        System.out.println("Sevice Provider of company is :"+service_provider);
        System.out.println("Number of customer is :"+number);
        System.out.println("Name of cutomer is :"+customer);
        System.out.println("Color of customer sim : "+ color);
        System.out.println();
    }
    public static void main(String [] args)
    {
        card s1 = new card("airtel",996073,"Ruvik","Red");
        s1.detail();
        s1.setcolor("black");
        s1.setcustomer("Piyush");

        s1.detail();
        //s1.getnumber(9887);///expected error

    }
}
