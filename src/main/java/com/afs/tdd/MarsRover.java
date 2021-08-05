package com.afs.tdd;

public class MarsRover {


    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        if(command.equals("M")){
            move();
        }else if(command.equals("L")){
            turnLeft();
        }else if(command.equals("R")){
            turnRight();
        }
    }



    private void move() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        int newLocationY = locationY;
            if(direction.equals("S")){
                roverStatus = new RoverStatus(locationX, newLocationY - 1, direction);
            } else if(direction.equals("N")){
                roverStatus = new RoverStatus(locationX, newLocationY + 1, direction);
            }

    }

    private void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = direction;

        if(direction.equals("N")){
            newDirection = "W";
        }else if(direction.equals("S")){
            newDirection = "E";
        }


        roverStatus = new RoverStatus(locationX, locationY, newDirection);

    }

    private void turnRight() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = direction;

        if(direction.equals("N")){
            newDirection = "E";
        }


        roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }



    public RoverStatus getRoverStatus() {
        return roverStatus;
    }

}
