package Mock.GreaterNo;

public class geater {
    public static int Rutvik(int a,int b, int c)
    {
        if(a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else
            return c;
    }
    public static void main(String[] args) {
        int G = Rutvik(12,65,98);
        System.out.println(G);
    }
}

