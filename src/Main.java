public class Main {
    public static void main(String[] args) {

        int age = 18;
        int temperature = -30;

        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            System.out.println("Mozhno idti guliat");
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            System.out.println("Mozhno idti guliat");
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            System.out.println("Mozhno idti guliat");
        } else {
            System.out.println("Ostavaites doma");
        }

    }
}