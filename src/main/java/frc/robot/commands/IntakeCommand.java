package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class IntakeCommand extends CommandBase {

  private final Intake intake;
  private final double speed;

  public IntakeCommand(Intake intakesub, double speed) {
    intake = intakesub;
    this.speed = speed;
    addRequirements(intakesub);
  }

  public void initialize() {
    intake.intake(speed);
    
  }

  public void execute() {





  }

  public void end(boolean interrupted) {
    intake.intake(0);
  }
}
