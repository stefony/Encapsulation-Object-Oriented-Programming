package P5_Encapsulation_Football_Team_Generator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name.trim();
    }

    public String getName() {
        return name;
    }

    private void setEndurance(int endurance) {
        validateStatus(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        validateStatus(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        validateStatus(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        validateStatus(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        validateStatus(shooting, "Shooting");
        this.shooting = shooting;
    }

    private void validateStatus(int status, String statusName){
        if (status < 0 || status > 100){
            throw new IllegalArgumentException(statusName + " should be between 0 and 100.");
        }
    }

    public double overallSkillLevel(){
        return (this.endurance
                + this.sprint
                + this.dribble
                + this.passing
                + this.shooting) / 5.00;
    }
}
