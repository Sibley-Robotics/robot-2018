package frc.team3100.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team3100.robot.Robot;
import frc.team3100.robot.subsystems.MainDrive;


public class AutoDriveBackwards extends Command {

    private double targetValue;
    private int time = 0;
    private int checkVal;
    private int currentVal;
    private boolean finished = false;

    public AutoDriveBackwards(double targetVal) {
        super("AutoDriveBackwards");
        requires(Robot.drive);
        targetValue = targetVal;

    }
    private static MainDrive drive = Robot.drive;

    protected void initialize() {
        drive.storedValRight = 0;
        drive.storedValLeft = 0;
    }

    protected void execute() {

        drive.drive(.85, 0);
        if(time == 50) {
            checkVal = Robot.drive.storedValRight;

        }
        if(time == 100) {
            if(checkVal == Robot.drive.storedValRight) {
                time = 0;
                finished = true;
            }
        }
        time += 1;

    }


    protected boolean isFinished() {
        if(Robot.drive.storedValRight <= -targetValue || finished) {
            return true;
        } else {
            return false;
        }
    }


    protected void interrupted(){

    }


    protected void end() {

    }
}

