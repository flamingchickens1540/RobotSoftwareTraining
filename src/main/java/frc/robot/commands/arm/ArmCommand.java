// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.arm;
import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class ArmCommand extends CommandBase{
    public final ArmSubsystem m_armSubsystem;
    public final CommandXboxController copilotController;


    public ArmCommand(ArmSubsystem subsystem, CommandXboxController controller){
        m_armSubsystem = subsystem;
        copilotController = controller;

        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(subsystem);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

      // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        double deadZoneControlledValue = MathUtil.applyDeadband(copilotController.getLeftX(), 0.1);
        m_armSubsystem.pivotArm(deadZoneControlledValue * 0.1);
    }

    @Override
    public void end(boolean interrupted) {
        m_armSubsystem.pivotArm(0);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
