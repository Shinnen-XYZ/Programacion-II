package Game2;

public class TablaPuntuacion {

    private Integer tie;
    private Integer wins;
    private Integer losses;

    public TablaPuntuacion() {
        tie = 0;
        wins = 0;
        losses = 0;
    }

    public Integer getTie() {
        return tie;
    }

    public Integer getWins() {
        return wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void incrementWins() {
        wins++;
    }

    public void incrementLosses() {
        losses++;
    }

    public void incrementTie() {
        tie++;
    }
}
