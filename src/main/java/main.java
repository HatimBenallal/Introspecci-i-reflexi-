import java.lang.reflect.*;
import java.util.List;

public class main {
    public static void main(String[] args) {
        User u = new User();
        Class user = u.getClass();

        System.out.println("Name: " + user.getName());
        Method[] method = user.getDeclaredMethods();
        for (Method m: method)
            System.out.println(m.toString());

    }
}
