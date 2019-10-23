public class Fjord {

    public static void main(String[]args) {
        Cars car1 = new Cars("Takk", "Sedan", 50, 8);
        Cars car2 = new Cars("Beklagger", "Sedan", 40, 7.5);
        Cars car3 = new Cars("Vakker", "SUV", 60, 5);
        Cars car4 = new Cars("Styg", "SUV", 55, 6);
        Cars car5 = new Cars("Vanskellig", "Truck", 65, 4.75);
        Cars car6 = new Cars("Lastebill", "Truck", 70, 5.5);

        double mpg = car1.calculateMpg();
        boolean standard = car1.standard();

        if (standard = true) {
            System.out.println("The car meets the standards with " + mpg);
        } else {
            System.out.println("The car failed to meet the standards with" + mpg);
        }

        mpg = car2.calculateMpg();
        standard = car2.standard();

        if (standard = true) {
            System.out.println("The car meets the standards with " + mpg);
        } else {
            System.out.println("The car failed to meet the standards with" + mpg);
        }

        mpg = car3.calculateMpg();
        standard = car3.standard();

        if (standard = true) {
            System.out.println("The car meets the standards with " + mpg);
        } else {
            System.out.println("The car failed to meet the standards with" + mpg);
        }
        mpg = car4.calculateMpg();
        standard = car4.standard();

        if (standard = true) {
            System.out.println("The car meets the standards with " + mpg);
        } else {
            System.out.println("The car failed to meet the standards with" + mpg);
        }
        mpg = car5.calculateMpg();
        standard = car5.standard();

        if (standard = true) {
            System.out.println("The car meets the standards with " + mpg);
        } else {
            System.out.println("The car failed to meet the standards with" + mpg);
        }
        mpg = car6.calculateMpg();
        standard = car6.standard();

        if (standard = true) {
            System.out.println("The car meets the standards with " + mpg);
        } else {
            System.out.println("The car failed to meet the standards with" + mpg);
        }

       

        
    }
}