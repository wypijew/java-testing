
public class User {
    static User[] user;
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        int sum = 0;
        int average =0 ;
        int belowAverage = 0;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < user.length; i++) {
            sum = sum + user[i].age;
        }
        System.out.println(sum);

        int average;
        average = sum/user.length;
        System.out.println(average);

        int belowAverage = average;
        for (int i = 0; i < user.length; i++) {
            if (user[i].age < belowAverage) {
                System.out.println(user[i].name + user[i].age);
            }

        }
        return sum / user.length;
    }
}
//    double sumAge = 0;
//    int suma = 0;
//for (int i = 0; i < users.length; i++) {
//        suma = suma + users[i].age;
//        System.out.println(suma);
//        }
//        int srednia;
//        srednia = suma/users.length;
//        System.out.println(srednia);
//
//        int sum = 0;
//        int ponizejSredniej = srednia;
//        for (int i = 0; i < users.length; i++) {
//        if (users[i].age < ponizejSredniej);
//        System.out.println(users);}
//
//        }
//        }

//    public int sum() {
//        int sum = 0;
//        for (int i = 0; i < this.age; i++)
//            sum = sum + users[i].age;
//        result = sum / this.result;
//        return result;
//    }
//
//    public int averageAge() {
//        for (int i = 0; i < User[i].length; i++) {
//            System.out.println(User[i]);
//        }
//        return sum;
//    }
//}


//public int sumNumbers(int[] numbers) {
//        int result = 0;
//        for (int i = 0; i < numbers.length; i++) {
//        result = result + numbers[i];
//        }
//        return result;









//public class User { string int
//konstruktor
//     {talic obietów typu user a nie string

//        String[] users = new String[6];
//        users[0] = "Klapouchy";
//        users[1] = "Prosiaczek";
//        users[2] = "Krzys";
//        users[3] = "Tygrysek";
//        users[4] = "Sowa";
//        users[5] = "Malenstwo";
//

//}
//
//
//
//        }
//    }