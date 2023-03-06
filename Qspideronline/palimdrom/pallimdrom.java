package Qspideronline.palimdrom;

public class pallimdrom {
    public static void main(String[] args) {
        String str = "malayalam";
        String s1= "";
        String store = str;
        for( int i=str.length()-1; i>=0; i--)
        {
            s1 = s1+str.charAt(i);
        }
        if(store.equals(s1))
        {
            System.out.println("yes it is pallimdrom");
        }
        else{
            System.out.println("it is not a pallimdrom");
        }
    }
}
