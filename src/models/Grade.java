package models;

class Grade {
    private int courceId;
    private double score;

    public Grade(int courceId, double score) {
        this.courceId = courceId;
        this.score = score;
    }

    public int getCourceId() {
        return courceId;
    }

    public void setCourceId(int courceId) {
        this.courceId = courceId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

}
