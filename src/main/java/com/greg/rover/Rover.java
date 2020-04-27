package com.greg.rover;


public class Rover {

    private Direction direction = Direction.NORTH;

    public String execute(String commands) {
        for (char command : commands.toCharArray()) {
            if (command == 'R') {
//                rotateRight();
                direction = direction.right();
            } else {
//                rotateLeft();
                direction = direction.left();
            }
        }
        return "0:0:"+ direction.value;
    }

    //    private void rotateRight() {
//        if(direction.equals("N")) {
//            direction = "E";
//            enumDirection = enumDirection.right();
//
//        }
//        else if (direction.equals("E")) {
//            direction =  "S";
//        }
//        else if (direction.equals("S")) {
//            direction = "W";
//        }
//        else direction = "N";
//    }
//
//    private void rotateLeft() {
//        if(direction.equals("N")) {
//            direction = "W";
//        }
//        else if (direction.equals("W")) {
//            direction =  "S";
//        }
//        else if (direction.equals("S")) {
//            direction = "E";
//        }
//        else direction = "N";
//    }
}

