package behavioral.state.practice;

public class Demo {
    public static void show() {
        var service = new DirectionService(new Walking());
        service.getEta();
        service.getDirection();
    }
}
