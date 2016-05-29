import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Product galaxyS6 = new Product(
                "galaxy s6"
                , "samsung"
                , "00-00-00"
                , "citrus"
                , "044-77-77"
                , new Date()
                , 1234
                , 15_999
                , 500
        );

        Product galaxyS6Fake = new Product(
                "galaxy s6"
                , "fake"
                , "00-00-00"
                , "market"
                , "044-755-75"
                , new Date()
                , 1234
                , 5_999
                , 50
        );

        Product iPhone6 = new Product(
                "iPhone 6"
                , "apple"
                , "00-00-00"
                , "citrus"
                , "044-77-77"
                , new Date()
                , 1233
                , 17_999
                , 500
        );

        Product iPhone6Another = new Product(
                "iPhone 6"
                , "apple"
                , "00-00-00"
                , "citrus"
                , "044-77-77"
                , new Date()
                , 1233
                , 17_999
                , 100
        );

        //Show our products
        System.out.println(galaxyS6);
        System.out.println(galaxyS6Fake);
        System.out.println(iPhone6);
        System.out.println(iPhone6Another);

        System.out.println("\ngalaxyS6 expiration date :");
        System.out.println(galaxyS6.expirationDate());
        System.out.println("\nis galaxy S6 (fake = original) ?");
        System.out.println(galaxyS6.equals(galaxyS6Fake));
        System.out.println("because hashCodes are :");
        System.out.println("fake: " + galaxyS6Fake.hashCode()
                        + " \noriginal: " + galaxyS6.hashCode());
        System.out.println("\nis iPhone 6 ( (first batch) = (second batch) ) ?");
        System.out.println(iPhone6.equals(iPhone6Another));

    }
}
