package com.greg.rover;

public enum Direction {
    NORTH("N" , "E" , "W" ),
    EAST("E" , "S" , "N" ),
    SOUTH("S" , "W" , "E" ),
    WEST("W" , "N" , "S" );

    protected final String value;
    protected final String right;
    protected final String left;

    Direction(String value, String right, String left) {
        this.value = value;
        this.right = right;
        this.left = left;
    }

    public Direction right() {
        return goToDirection(this.right);
    }

    public Direction left() {
        return goToDirection(this.left);
    }

    private Direction goToDirection(String right) {
        for (Direction direction : values()) {
            if (direction.value.equals(right)) {
                return direction;
            }
        }
        return null;
    }
}
