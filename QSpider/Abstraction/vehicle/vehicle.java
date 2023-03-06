package QSpider.Abstraction.vehicle;
abstract class vehicle1
{
    abstract void start();
    abstract void stop();
}
abstract class car extends vehicle1
{
    abstract void shiftgear();
}
class mustang extends car
{
    @Override
    void start() {
        System.out.println("Start");
    }

    @Override
    void stop() {
        System.out.println("Stop");
    }

    @Override
    void shiftgear() {
        System.out.println("Shifting a gear");
    }

}
public class vehicle {
    public static void main(String[] args) {
        mustang m1 = new mustang();
        m1.start();
        m1.stop();
        m1.shiftgear();
    }
}
