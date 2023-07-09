public class VirtualPet {
    private String petName;
    private int hunger;
    private int thirst;
    private int boredom;


    public VirtualPet() {
    }

    public VirtualPet(String petName, int hunger, int thirst, int boredom) {
        this.petName = petName;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
    }


    public String getPetName() {
        return this.petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getHunger() {
        return this.hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return this.thirst;
    }
    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getBoredom() {
        return this.boredom;
    }
    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public void tick() {
        hunger ++;
        thirst ++;
        boredom ++;
    }

    public void feed() {
        tick();
        hunger -= 5;
        if (hunger < 0) {
            hunger = 0;
        }
        thirst += 5;
        if (thirst > 100) {
            thirst = 100;
        }
    }

    public void play() {
        tick();
        hunger += 10;
        if (hunger > 100) {
            hunger = 100;
        }
        thirst += 10;
        if (thirst > 100) {
            thirst = 100;
        }
        boredom -= 10;
        if (boredom < 0) {
            boredom = 0;
        }
    }

    public void giveWater() {
        tick();
        thirst -= 5;
        if (thirst < 0) {
            thirst = 0;
        }
    }

    public void updateAttributes() {
        
    }
}