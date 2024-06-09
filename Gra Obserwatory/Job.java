package ZadObserwatoryGra;

public class Job implements Observer {
    String thingName;
    int qtyNeeded;
    Subject equipment;

    public Job(String thingName, int qtyNeeded, Subject equipment) {
        this.thingName = thingName;
        this.qtyNeeded = qtyNeeded;
        this.equipment = equipment;
        equipment.registerObserver(this);
    }

    @Override
    public void update(String item, int qty) {
        if (item.equals(thingName)) {
            System.out.println(thingName + ": " + qty + "/" + qtyNeeded);
            if (qty >= qtyNeeded) {
                System.out.println("You finished your Job " + thingName);
                equipment.removeObserver(this);
            }
        }
    }
}
