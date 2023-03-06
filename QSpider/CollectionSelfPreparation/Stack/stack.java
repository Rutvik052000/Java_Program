package QSpider.CollectionSelfPreparation.Stack;
import java.util.Stack;
public class stack {
    public static void main(String [] args)
    {
        Stack animal = new Stack();

        animal.push("Lion");
        animal.push("Horse");
        animal.push(3);
        animal.push("kangaroo");
        animal.push("cat");

        System.out.println(animal); /// print stack collection


        System.out.println(animal.peek()); // it is find which element on top

        animal.pop();
        System.out.println("Stack:"+ animal);

        System.out.println(animal.peek());
    }
}
