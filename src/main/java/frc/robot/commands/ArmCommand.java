package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Arm;

public class ArmCommand extends CommandBase
{ 
    private Arm arm;
    private CommandXboxController controller;

    public ArmCommand(Arm arm, CommandXboxController controller)
    {
        this.arm = arm;
        this.controller = controller;

        addRequirements(this.arm);
    }

    @Override
    public void initialize(){}

    @Override
    public void execute()
    {
        this.arm.moveArm(controller.getLeftY() * 0.1);
    }

    @Override
    public void end(boolean interrupted)
    {
        this.arm.moveArm(0);
    }
}