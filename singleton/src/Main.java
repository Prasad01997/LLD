import com.Samosa;

public class Main {
    public static void main(String[] args) {

        Samosa instance1 = Samosa.getInstance();
        System.out.println(instance1.hashCode());

        Samosa instance2 = Samosa.getInstance();
        System.out.println(instance2.hashCode());

    }
}