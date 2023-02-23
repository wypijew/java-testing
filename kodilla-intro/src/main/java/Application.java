public class Application {

    public double age;
    public double height;
    public String name;


    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void check() {
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
    public static void main(String[] args) {
        Application application = new Application("Adam", 40.5, 178.0);
        System.out.println(application.name);
        application.check();

    }

    //    public static void main(String[] args) {
//        String name = "Adam";
//        double age = 40.5;
//        double height = 178;

}
