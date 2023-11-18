package frc.robot.commands.arm;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class PivotCommand extends CommandBase{

  public final Arm arm;
  public final CommandXboxController controller;

  public PivotCommand(Arm arm, CommandXboxController controller) {
    this.arm = arm;
    this.controller = controller;
    addRequirements(arm);
  }



  @Override
  public void execute() {
    double input = controller.getRightY();
    if (Math.abs(input) > 0.1) {
      arm.setSpeed(input * 0.1);
    } else {
      arm.setSpeed(0);
    }
  }

  
  @Override
  public void end(boolean interrupted) {
    arm.setSpeed(0);
  }
}
