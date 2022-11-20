public class Pilot extends Person{

    private String rank;
    private String pilotNum;

    public Pilot(String name, String rank, String pilotNum){
        super(name);
        this.rank = rank;
        this.pilotNum = pilotNum;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPilotNum() {
        return pilotNum;
    }

    public void setPilotNum(String pilotNum) {
        this.pilotNum = pilotNum;
    }

    public String flyPlane() {
        return "Take Off!";
    }
}
