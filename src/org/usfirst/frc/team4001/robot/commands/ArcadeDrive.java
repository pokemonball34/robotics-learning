package org.usfirst.frc.team4001.robot.commands;

import org.usfirst.frc.team4001.robot.Robot;
import org.usfirst.frc.team4001.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArcadeDrive extends Command {

    public ArcadeDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Starting up Arcade Drive...");
    	Robot.driveTrain.getLeftAxis();
    	Robot.driveTrain.getRightAxis();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	System.out.println("Executing Arcade Drive...");
    	Robot.driveTrain.arcadeDrive(1.0, 0.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.driveTrain.stop();
    }
}
