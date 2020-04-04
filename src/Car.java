public class Car {

    private String make;
    private int yearOfManufacture;
    private String regNo;
    private int price;

    public Car () {

    }// Car default constructor method

    public Car (String itsMake, int whenBuilt, String regNo, int costPrice ) {

        this.make = itsMake;
        this.yearOfManufacture = whenBuilt;
        this.regNo = regNo;
        this.price = costPrice;
    } //	Alternative Car constructor method

    public void printCarInfo () {
        System.out.println ("The car is a "+make);
        System.out.println("The registration number is "+regNo);
        System.out.println ("It was built in " + yearOfManufacture);
        System.out.println ("It cost £" + price + " to buy");
    }//printCarInfo method

    //this will return the value of the price variable for part b
    public int getPrice(){

        return price;
    }

}// Car Class Definition
