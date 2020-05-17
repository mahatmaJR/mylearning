package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DrinkTable")
@NamedQueries(@NamedQuery(name = "Drink.getAll", query = "SELECT d FROM Drink d"))
public class Drink implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "drinkId")
    private int drinkId;
    @Column(name = "drinkName")
    private String drinkName;
    @Column(name = "price")
    private double price;
    @Column(name = "drinkNumber")
    private int drinkNumber;

    public Drink() {
    }

    public Drink(int drinkId, String drinkName, double price, int drinkNumber){
        this.drinkId = drinkId;
        this.drinkName = drinkName;
        this.price = price;
        this.drinkNumber = drinkNumber;
    }

    public int getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(int drinkId) {
        this.drinkId = drinkId;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDrinkNumber() {
        return drinkNumber;
    }

    public void setDrinkNumber(int drinkNumber) {
        this.drinkNumber = drinkNumber;
    }
}
