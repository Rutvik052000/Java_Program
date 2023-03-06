//replace is l and o character in hello world string without used any replace method

package Qspideronline.helloworldreplace;

public class helloworld {
    public static void main(String[] args) {
        {
            String str = "Hello World";
            String s1="";
            for(int i=0; i<=str.length()-1;i++)
            {
                if(str.charAt(i)=='o'|| str.charAt(i)=='l')
                {
                    s1=s1+'x';
                }else {
                    s1=s1+str.charAt(i);
                }

            }
            System.out.println("New String is :"+s1);
        }
    }
}
