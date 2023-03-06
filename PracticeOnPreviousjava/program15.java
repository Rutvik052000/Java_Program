package PracticeOnPreviousjava;
class university
{   int clg_id = 88787;
    int clg_idP = 87998;
    int clg_idR= 8759;
    int clg_idH= 8765;

    void under_clg()
    {
        System.out.println("College Id provide by university to under university");

    }
}
class P_C extends university
{
    void info1()
    {
        System.out.println("College name : "+"P.R.Pote patil institute of managment Amravati");
        System.out.println("College Id provide by univarsity is :" + clg_idP);
    }
}
class R_C extends university
{
    void info2()
    {
        System.out.println("College name : "+"Ram meghe college Amravati");
        System.out.println("College Id provide by univarsity is :" + clg_idR);
    }
}
class H_C extends university
{
    void info3()
    {
        System.out.println("College name : "+"Hanuman vyam shala Amravati");
        System.out.println("College Id provide by univarsity is :" + clg_idH);
    }
}
class S_C extends university
{
    void info4()
    {
        System.out.println("College name : "+"Shree shivaji science college amravati");
        System.out.println("College Id provide by univarsity is :" + clg_id);
    }
}
public class program15 {
    public static void main(String[] args) {
        S_C obj = new S_C();
        obj.info4();
        System.out.println();

        P_C obj1 = new P_C();
        obj1.info1();
        System.out.println();

        H_C obj2 = new H_C();
        obj2.info3();
        System.out.println();

        R_C obj3 = new R_C();
        obj3.info2();
        System.out.println();



    }
}
