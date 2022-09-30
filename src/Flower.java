public class Flower {

    private String flowerColor;
private String country;
private double cost;
public int lifeSpan;

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null) {
            this.flowerColor = " белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }}
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;

    }

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
       if(flowerColor==null) {
           this.flowerColor = " белый";
       } else {
           this.flowerColor = flowerColor;
       }
       if (country == null) {
           this.country = "Россия";
       } else {
           this.country = country;
       }
           if (cost <=0) {
           } else {
               this.cost = Double.parseDouble("1");
                this.cost = cost;
        this.lifeSpan = lifeSpan;
    }}
           public Flower(String flowerColor, String country, double cost) {
               this(flowerColor, country, cost, 3);

           }


    }






