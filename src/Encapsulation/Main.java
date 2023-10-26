import java.util.concurrent.ExecutorCompletionService;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("John", "Smith", (byte)30, 20546, 100000);
        System.out.println(e.speak());
    }
}
