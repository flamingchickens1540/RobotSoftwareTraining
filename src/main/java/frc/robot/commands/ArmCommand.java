package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArmCommand extends CommandBase {

  private final Arm Arm;
  private final double armSpeed;

  public ArmCommand(Arm arm, double armSpeed) {
    Arm = arm;
    this.armSpeed = armSpeed;
    addRequirements(Arm);
  }

  public void initialize() {
    Arm.arm(armSpeed);
    
  }

  public void execute() {





  }

  public void end(boolean interrupted) {

  }
}
