package frc.robot.commands.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.IntakeConstants;

public class IntakeCommand extends CommandBase{

  public final Intake intake;


  public IntakeCommand(Intake intake) {
    this.intake = intake;
  }

  @Override
  public void initialize() {
    intake.setSpeed(IntakeConstants.intakeSpeed);
  }

  public boolean isFinished() {
    return intake.getSpeed() == 0;

  }

  public void end(boolean interrupted) {
    intake.stop();
  }

    
}
