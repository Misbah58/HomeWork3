package Homework3;

public class mortgageValue {
    public static void main(String[] args) {
        double rate= 4.5;
        int price = 200000;
        if (rate>4.5) {
            System.out.println("User will not buy a house ");
        }else{
            System.out.println("Otherwise user will consider buying");
            if(price>200000) {
                System.out.println("User will take a loan");
            }else{
                System.out.println("Otherwise user will pay cash");
            }
        }
    }
}
