public class UserOne {
    public static void main(String[] args) {

        User klapouchy = new User("Klapouchy", 15);
        User prosiaczek = new User("Prosiaczek", 10);
        User krzys = new User("Krzys", 8);
        User tygrysek = new User("Tygrysek", 12);
        User sowa = new User("Sowa", 20);
        User malenstwo = new User("Malenstwo", 5);

        User[] user = {klapouchy, prosiaczek, krzys, tygrysek, sowa, malenstwo};

        System.out.println(user.length);

        int sum = 0;
        for (int i = 0; i < user.length; i++) {
            sum = sum + user[i].age;
        }
        System.out.println(sum);

        int average;
        average = sum / user.length;
        System.out.println(average);

        int belowAverage = average;
        for (int i = 0; i < user.length; i++) {
            if (user[i].age < belowAverage) {
                System.out.println(user[i].name + user[i].age);
            }

        }
    }
    }