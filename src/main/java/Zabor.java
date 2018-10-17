import java.util.Date;

/**
 * Created by sergo on 17.10.2018.
 */
public class Zabor {
    String numberCar;
    Date date;
    double amountOil;
    double price;
    String numberCard;

    public Zabor(String numberCar, Date date, double amountOil, double price, String numberCard) {
        this.numberCar = numberCar;
        this.date = date;
        this.amountOil = amountOil;
        this.price = price;
        this.numberCard = numberCard;
    }

    @Override
    public String toString() {
        return numberCar +
                " " + date +
                " " + amountOil +
                " " + price +
                " " + numberCard;
    }
}
