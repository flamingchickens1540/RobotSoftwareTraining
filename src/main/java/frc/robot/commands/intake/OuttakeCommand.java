package frc.robot.commands.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.IntakeConstants;

public class OuttakeCommand extends CommandBase{

  public final Intake intake;


  public OuttakeCommand(Intake intake) {
    this.intake = intake;
  }

  @Override
  public void initialize() {
    intake.setSpeed(IntakeConstants.outtakeSpeed);
  }

  public boolean isFinished() {
    return intake.getSpeed() == 0;

  }

  public void end(boolean interrupted) {
    intake.stop();
  }

    
}
