public class Application {

    public double age = 40.5;
    public double height = 178;
    public String name = "Adam";


    public Application() {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        Application application = new Application();
        System.out.println(application.name);

        if (application.name != null) {
            if (application.age > 30 && application.height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

    //    public static void main(String[] args) {
//        String name = "Adam";
//        double age = 40.5;
//        double height = 178;
//

//    }


}
