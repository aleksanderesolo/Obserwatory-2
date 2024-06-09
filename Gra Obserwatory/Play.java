package ZadObserwatoryGra;

public class Play {
    public static void main(String[] args) {
        Equipment equipment = new Equipment();

        Job job = new Job("sword", 10, equipment);
        for (int i = 0; i < 5; i++) {
            equipment.addItem("sword", 1);
        }
        equipment.removeItem("sword", 2);
        for (int i = 0; i < 10; i++) {
            equipment.addItem("sword", 1);
        }
    }
}