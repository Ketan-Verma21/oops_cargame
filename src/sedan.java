public class sedan extends car{
    public sedan(String name, boolean ismanual) {
        super(name,4, "Sedan", 2, 6, ismanual);
    }
    public void accelerate(int rate){
        int newspeed=getSpeed()+rate;
        if(newspeed==0){
            change_gear(0);
        } else if (newspeed>0 && newspeed<=10) {
            change_gear(1);
            
        } else if (newspeed>10 && newspeed<=30) {
            change_gear(2);
        } else if (newspeed>30 && newspeed<=60) {
            change_gear(3);
        } else if (newspeed>60 && newspeed<90) {
            change_gear(4);
        } else if (newspeed>90) {
            change_gear(5);
        }
        if(newspeed>0){
            change_speed(newspeed,getDirection());
        }
    }
}
