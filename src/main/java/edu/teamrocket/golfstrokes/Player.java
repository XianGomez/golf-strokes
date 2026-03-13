package edu.teamrocket.golfstrokes;

class Player {

    private final String initials;
    private Byte handicap;
    private Short score = 0;
    private Short points = 0;

    Player (String initials, Byte handicap) {
        this.initials = initials;
        this.handicap = handicap;
    }

    String getInitials() {
        return this.initials;
    }

    Byte getHandicap() {
        return this.handicap;
    }
}
