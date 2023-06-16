public class Vehicle {
    private String name;
    private int speed ;
    private int direction;


    public Vehicle(String name) {
        this.name = name;
        this.direction=0;
        this.speed=0;
    }

    public void move(int speed,int direction){
        this.speed=speed;
        this.direction=direction;
        System.out.println("The "+name+" has started moving at a speed of "+speed+" in the "+direction+" direction");
        System.out.println("\n");
    }
    public void steer(int direction){
        this.direction+=direction;
        System.out.println("the "+name+"has changed direction to "+getDirection());
        System.out.println("\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
    public void stop(){
        this.speed=0;
        System.out.println("the "+getName()+" has stopped");

    }
}
