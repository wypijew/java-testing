import java.util.Random;

public class RandomNumbers {
    Random random = new Random();

    private int max;
    private int min;
    int result = 0;
    int limit = 5000;

//    public static void main(String[] args) {
//
//        int limit = 5000;
//
//        Random random = new Random();
//        for (int i = 0; i < limit; i++) {
//            System.out.println(random.nextInt(31));
//        }

    public void chance() {
        int sum = 0;
        int temp = 0;
        this.min = 30;
        this.max = 0;
        while (sum < limit) {
            temp = random.nextInt(31);
            sum = sum + temp;
            if (temp > this.max) {
                this.max = temp;
            }
            if (temp < this.min) {
                this.min = temp;
            }
        }

    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    public static void main(String[] args) {
        RandomNumbers chance = new RandomNumbers();
        chance.chance();
        System.out.println("Min: " + chance.getMin());
        System.out.println("Max: " + chance.getMax());
    }

}
//    }
//    public void getMax(int max) {
//        this.max = max;
//        for (int i =0; i<=max; i++) {
//            if (temp > max)
//        }
//    }
//    Utwórz klasę RandomNumbers, w której będzie istnieć metoda losująca liczby
//    z zakresu 0-30, tak długo, aż ich suma przekroczy 5000.
//    Napisz dwie metody zwracające największą i najmniejszą wylosowaną wartość.