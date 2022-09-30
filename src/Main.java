public class Main {
    public static void main(String[] args) {
        Flower rosa = new Flower(null, "Голландия", 35.59);
        Flower chrysanthemum = new Flower(null, null, 15, 5);
        Flower peony = new Flower(null, "англия", 69.9, 1);
        Flower gypsophilia = new Flower(null, "турция", 19.5, 10);

    printFlo (rosa);
    printFlo(chrysanthemum);
    printFlo(peony);
    printFlo(gypsophilia);
    printCostOfFlowers(
            rosa, rosa,rosa,
            chrysanthemum, chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,
            gypsophilia);

    }
    private static void printFlo (Flower flower){
    System.out.println(" Цветок " + flower.getFlowerColor()
    +" страна " + flower.getCountry()
    + " стоимость за штуку - " + flower.getCost()
    + " срок стояния цветка " + flower.lifeSpan);

    }

    private static void printCostOfFlowers (Flower...flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printFlo(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок стояния букета: " + minimumLifeSpan):
    }}
