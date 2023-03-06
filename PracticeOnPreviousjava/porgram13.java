//Multilevel inheritance
// class A is in

package PracticeOnPreviousjava;
class BackEnd {
    public void BackEnd()
    {
        System.out.println("bankend : My Sql");
    }

}
class FrontEnd extends BackEnd
{
    public void FrontEnd()
    {
        System.out.println("FrontEnd : HTML, CSS,");
    }

}
class Language extends FrontEnd
{
    public void Showlanguage()
    {
        System.out.println("Language : java");
    }
}
public class porgram13 {

    public static void main(String[] args) {

        Language l1 = new Language();
        l1.Showlanguage();
        l1.BackEnd();


    }
}
