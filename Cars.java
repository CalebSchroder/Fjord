public class Cars {

    //data
    private String name;
    private String type;
    private int liters;
    private double hours;
    private int type1;
    private double mpg;


    //constructor
    public Cars(String name, String type, int liters, double hours) {
        this.name = name;
        this.type = type;
        this.liters = liters;
        this.hours = hours;
        findType();
    }

    //get+set


    //calculations

    public double calculateMpg() {
        System.out.println("Calculating mpg...");
        mpg = calculateMpg1(liters, hours);
        return mpg;

    }

    private double calculateMpg1(int liters1, double hours1) {
        return (hours1 * 60) / (liters1 * 0.264172);
    }

    private void findType() {
        System.out.println("Finding type");
        if (type.equals("Sedan")) {
            type1 = 0; 
        }
        if (type.equals("SUV")) {
            type1 = 1;
        }
        if (type.equals("Truck")) {
            type1 = 2;
        }
        type1 = 0;
    }

    public boolean standard() {
        System.out.println("Finding if it meets the standard");
        if (type1 == 0 && mpg >= 50) {
            return true;
        }
        if (type1 == 1 && mpg >= 40) {
            return true;            
        }
        if (type1 == 2 && mpg >= 30) {
            return true;
        } 
            return false;
        
    }







}