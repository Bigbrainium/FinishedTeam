public class Capitan extends UltimatePlayer {
    public boolean type;

    //Constructor
    public Capitan(String firstName, String lastName, String position, int jerseyNumber, boolean type){
        super(firstName, lastName, position, jerseyNumber);
        this.type = type;
    }

    //Accessors
    public boolean getType(){
        return type;
    }

    public int throwDisc(int pow){
        return 5*pow;
    }

    //Mutators
    public String toString(){
        String s = "";
        s += super.toString() + "\n   Jersey #: " + getJerseyNum() + "\n   Position: " + getPosition();
        if (getType()) {
            s += "\n   Captain: Offense";
        } else {
            s += "\n   Captain: Defense";
        }
        return s;
    }
}
