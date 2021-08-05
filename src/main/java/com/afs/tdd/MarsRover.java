package com.afs.tdd;

public class MarsRover {

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }

    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {

    }
}
