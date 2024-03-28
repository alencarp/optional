package hashcode;

public class MainUser {

    public static void main(String[] args) {

        User user = new User(1, "Patricia", "patricia@mail.com");
        User user2 = new User(2, "Maria", "maria@mail.com");

        User user3 = new User(1, "Patricia", "patricia@mail.com");

        System.out.println(user.equals(user3));
    }
}
