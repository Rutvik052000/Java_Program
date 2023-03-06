package QSpider.wrapperclass.Boxing;

public class Boxing {
    public static void main(String[] args) {

        int a = 2000;
        double b = 5554.4656;
       String c= "Rutvik";
        byte d = 54;
        char e='m';
        boolean f = true;
        long j = 83475934;
        short h =554;

// Premative datatype is converted into non- premative datatype it known as Boxing

        Integer i = Integer.valueOf(a);
        Integer i2 = a;         //short-cut or auto- boxing
        System.out.println(i);
        System.out.println(i2);

        Double k = Double.valueOf(b);
        Double g = b;
        System.out.println(k);
        System.out.println(g);

        Byte l = Byte.valueOf(d);
        System.out.println(l);

        Character n = Character.valueOf(e);
        System.out.println(n);

        Long o = Long.valueOf(j);
        System.out.println(o);

        Short s = Short.valueOf(h);
        System.out.println(s);

/// non- premative data type is converted into premative datatype is known as unboxing
        System.out.println();
        System.out.println();

        int x = i.intValue();
        int x1 =i;
        System.out.println(x);

        double y = k.doubleValue();
        double y1 = k;
        System.out.println(y);
        System.out.println(y1);

        long z = o.intValue();
        long z1 = o;
        System.out.println(z);
        System.out.println(z1);

        char t = n.charValue();
        char t1 = n;
        System.out.println(t);
        System.out.println(t1);

        short v = s.shortValue();
        short v1 = s;
        System.out.println(v);
        System.out.println(v1);

        /// If can posible to change string non-premative data change into premative type of datatype by ------------ method
        System.out.println();
        System.out.println();
        String str = String.valueOf(10000);// interger datatype to string datatype
        int r = Integer.parseInt(str); //// string converted into integer datatype
        System.out.println(str);
        System.out.println(r);
    }
}
