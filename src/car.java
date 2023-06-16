public class car extends Vehicle{
    private int wheel;
    private String type;
    private int door;
    private int gear;
    private boolean ismanual;

    private int currentgear;

    public car(String name,int wheel, String type, int door, int gear, boolean ismanual) {
        super(name);
        this.wheel = wheel;
        this.type = type;
        this.door = door;
        this.gear = gear;
        this.ismanual = ismanual;
        currentgear=0;
    }
    public void change_gear(int newgear){
        this.currentgear=newgear;
        System.out.println("the "+getName()+" gear has been changed to "+newgear);
        System.out.println("\n");
    }
    public void change_speed(int newspeed,int newdirection){

        System.out.println("speed changed");
        move(newspeed,newdirection);
        System.out.println("\n");
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public boolean isIsmanual() {
        return ismanual;
    }

    public void setIsmanual(boolean ismanual) {
        this.ismanual = ismanual;
    }

    public int getCurrentgear() {
        return currentgear;
    }

    public void setCurrentgear(int currentgear) {
        this.currentgear = currentgear;
    }
}
