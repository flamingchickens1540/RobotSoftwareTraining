package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Intakesub;

public class IntakeCommand extends CommandBase {

  private final IntakeSub intake;
  private final double speed;

  public IntakeCommand(IntakeSub intakesub, double speed) {
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

  }
}
