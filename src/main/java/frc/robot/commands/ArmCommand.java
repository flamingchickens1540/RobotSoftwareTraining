package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class ArmCommand extends CommandBase {
  private CommandXboxController controller;
  private final Arm arm;
  
  public double joystick;
  public ArmCommand(Arm arm, CommandXboxController controller) {
    this.arm = arm;
    this.controller = controller;
    
    addRequirements(this.arm);
    
  }

  public void initialize() {

    
  }

  public void execute() {
    
    this.arm.moveArm(controller.getLeftY()*0.1);





  }

  public void end(boolean interrupted) {
    this.arm.moveArm(0);
  }
}
