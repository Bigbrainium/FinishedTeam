public class UltimatePlayer extends Person{
    int jerseyNum;
    int jerseyNumCounter;
    String position;
    public UltimatePlayer(String firstName, String lastName, String position, int jerseyNum) {
        super(firstName, lastName);
        if (position.equalsIgnoreCase("cutter")) {
            this.position = position;
        } else {
            this.position = "Handler";
        }

        this.jerseyNum = jerseyNum;
    }

    public String getPosition() {
        return position;
    }

    public int getJerseyNum() {
        return jerseyNum;
    }

    public int throwDiscus(int pow) {
        return 4*pow;
    }

    public String toString(){
        String s = "";
        s += super.toString() + "\n   Jersey #: " + getJerseyNum() + "\n   Position: " + getPosition();
        return s;
    }
}
