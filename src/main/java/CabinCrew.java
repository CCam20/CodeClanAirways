public class CabinCrew extends Person{

    private String rank;

    public CabinCrew(String name, String rank){
        super(name);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String message() {
        return "Please fasten your seatbelts";
    }
}
