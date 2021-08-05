package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {


    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        String[] singleCommands = command.split("");
        for (String singleCommand : singleCommands) {
            executeSingleCommand(singleCommand);
        }
    }

    private void executeSingleCommand(String command) {
        if (command.equals("M")) {
            move();
        } else if (command.equals("L")) {
            turnLeft();
        } else if (command.equals("R")) {
            turnRight();
        }
    }

    private void move() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        int newLocationY = locationY;
        int newLocationX = locationX;
        if (direction.equals("S")) {
            roverStatus = new RoverStatus(locationX, newLocationY - 1, direction);
        } else if (direction.equals("N")) {
            roverStatus = new RoverStatus(locationX, newLocationY + 1, direction);
        } else if (direction.equals("E")) {
            roverStatus = new RoverStatus(newLocationX + 1, locationY, direction);
        } else if (direction.equals("W")) {
            roverStatus = new RoverStatus(newLocationX - 1, locationY, direction);
        }

    }

    private void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = direction;

        if (direction.equals("N")) {
            newDirection = "W";
        } else if (direction.equals("S")) {
            newDirection = "E";
        } else if (direction.equals("E")) {
            newDirection = "N";
        } else if (direction.equals("W")) {
            newDirection = "S";
        }


        roverStatus = new RoverStatus(locationX, locationY, newDirection);

    }

    private void turnRight() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = direction;

        if (direction.equals("N")) {
            newDirection = "E";
        } else if (direction.equals("S")) {
            newDirection = "W";
        } else if (direction.equals("E")) {
            newDirection = "S";
        } else if (direction.equals("W")) {
            newDirection = "N";
        }

        roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
