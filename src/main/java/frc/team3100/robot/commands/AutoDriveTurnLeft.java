package frc.team3100.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team3100.robot.Robot;
import frc.team3100.robot.RobotMap;
import frc.team3100.robot.subsystems.MainDrive;


public class AutoDriveTurnLeft extends Command {


    private int targetValue;
    private double gyroTarget;
    public AutoDriveTurnLeft(int targetVal) {
        super("AutoDriveTurnLeft");
        requires(Robot.drive);
        targetValue = targetVal;
    }


    private static MainDrive drive = Robot.drive;

    protected void initialize() {
        drive.storedValLeft = 0;
        drive.storedValRight = 0;
        gyroTarget = RobotMap.gyro.getAngle() - targetValue;

    }

    protected void execute() {
        drive.drive(.4, -.65);
    }


    protected boolean isFinished() {
        if(RobotMap.gyro.getAngle() > gyroTarget) {
            return false;
        } else {
            return true;
        }
    }


    protected void interrupted(){

    }


    protected void end() {
        drive.drive(0,0);
    }
}

