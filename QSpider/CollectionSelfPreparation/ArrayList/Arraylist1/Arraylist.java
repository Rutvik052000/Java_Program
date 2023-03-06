package QSpider.CollectionSelfPreparation.ArrayList.Arraylist1;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> StudentName = new ArrayList<>(); //This is declearation of ArrayList constuctor of String type

        StudentName.add("Rutvik");//// This is used to add element in List
        StudentName.add("Piyush");
        StudentName.add("Yash");
        StudentName.add("Rushikesh");
        StudentName.add(2, "Rutvik");

        System.out.println(StudentName);

        ArrayList studentinfo = new ArrayList(); // This is declearation of ArrayList constructor of any type data can be added
        studentinfo.add(99);
        studentinfo.add(78);
        studentinfo.add(21);
        studentinfo.add(65);
        studentinfo.add("Jay");

        studentinfo.addAll(StudentName);   /// addAll() method it used to add another ArrayList

        System.out.println(studentinfo);

        System.out.println(StudentName.get(2));  // if you hava any get elemente in array you can used get() method

        StudentName.remove(2);
        System.out.println(StudentName); // remove element according to index number

        studentinfo.removeAll(StudentName);
        System.out.println(studentinfo); /// remove all element in list

        studentinfo.remove(String.valueOf("Jay")); // it is used to remove perticular value
        System.out.println(studentinfo);


        System.out.println(studentinfo);


    }
}
