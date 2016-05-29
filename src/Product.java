
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Денис on 29.05.2016.
 * @author Denis Drabchuck
 *
 * This class contains information about
 * product, that kept in store
 */
public class Product {

    private String name;
    private String producer;
    private String producerPhone;
    private String provider;
    private String providerPhone;
    private Date dateOfProduction;
    private int shelfLife; //in days
    private double price; //per one unit
    private int quantity;

    //Constructors
    /**
     * Constructor, that need all the field
     * be initialized by parameters*/
    public Product(String name
            , String producer
            , String producerPhone
            , String provider
            , String providerPhone
            , Date dateOfProduction
            , int shelfLife
            , int price
            , int quantity
    ) {
        this.name = name;
        this.producer = producer;
        this.producerPhone = producerPhone;
        this.provider = provider;
        this.providerPhone = providerPhone;
        this.dateOfProduction = dateOfProduction;
        this.shelfLife = shelfLife;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Constructor, that need not date of production
     * in the parameters
     * Date is initialized by current date*/
    public Product(String name
            , String producer
            , String producerPhone
            , String provider
            , String providerPhone
            , int shelfLife
            , int price
            , int quantity
    ) {
        this.name = name;
        this.producer = producer;
        this.producerPhone = producerPhone;
        this.provider = provider;
        this.providerPhone = providerPhone;
        this.shelfLife = shelfLife;
        this.price = price;
        this.quantity = quantity;

        this.dateOfProduction = new Date();
    }

    //Custom methods

    /**
     * Method calculates date of expiration
     *
     * @return dateOfProduction + shelDate (in days)
     * */
    public Date expirationDate() {
        Date d = (Date) this.dateOfProduction.clone();
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.DATE, shelfLife);
        return c.getTime();
    }

    /**
     * Method calculates the total price
     * of the certain product, that kept
     * in storage
     *
     * @return quantity * price (per one unit)*/
    public double totalPrice() {
        return this.quantity * this.price;
    }

    //Object overridden methods

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nproduct");
        sb.append("\nname: ");
        sb.append(name);
        sb.append("\nproducer: ");
        sb.append(producer);
        sb.append("\nproducer phone: ");
        sb.append(producerPhone);
        sb.append("\nprovider: ");
        sb.append(provider);
        sb.append("\nprovider phone: ");
        sb.append(providerPhone);
        sb.append("\ndate of production: ");
        sb.append(dateOfProduction);
        sb.append("\nshelf life: ");
        sb.append(shelfLife);
        sb.append("\nprice: ");
        sb.append(price);
        sb.append("\nquantity: ");
        sb.append(quantity);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return ( 2 * name.hashCode() + producer.hashCode() );
    }

    /**
     * Method equals
     * let products equals if the fields
     * name and producer
     * matches*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Product p = (Product) obj;

        return (this.name == p.getName() && this.producer == p.getProducer());
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducerPhone() {
        return producerPhone;
    }

    public void setProducerPhone(String producerPhone) {
        this.producerPhone = producerPhone;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProviderPhone() {
        return providerPhone;
    }

    public void setProviderPhone(String providerPhone) {
        this.providerPhone = providerPhone;
    }

    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(Date dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
