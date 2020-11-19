import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private int capacity;
    private List<Pet> data;

    public Clinic(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>(0);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void add(Pet pet) {
        if (this.data.size() < this.capacity) {
            this.data.add(pet);
        }
    }

    public boolean remove(String name) {
        for (Pet pet : data) {//TODO OK >>
            if (pet.getName().equals(name)) {
                data.remove(pet);
                return true;
            }
        }
        return false;
    }
    public Pet getPet(String name, String owner) {
        Pet thisPet;
        for (Pet pet : data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                thisPet = pet;
                return thisPet;
            }
        }
        return null;
    }
    public Pet getOldestPet() {
        if (data.size() == 0) {
            return null;
        } else {
            int petYear = 0;
            Pet winner = null;//TODO put in the last position

            for (Pet datum : data) {
                if (petYear < datum.getAge()) {
                    winner = datum;
                    petYear = winner.getAge();
                }
            }
            return winner;
        }
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("The clinic has the following patients:").append(System.lineSeparator());
        for ( Pet pt : data){
            sb.append(pt.getName()).append(" ").append(pt.getOwner()).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
