package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class IntakeCommand extends CommandBase{
    private Intake intakeSubsystem;
    public IntakeCommand(Intake intakeSubsystem) {
        this.intakeSubsystem = intakeSubsystem;
        addRequirements(intakeSubsystem);
    }
    public void initialize() {
        intakeSubsystem.setSpeed(0.1);
    }
    @Override
    public void end(boolean interrupted) {
        intakeSubsystem.setSpeed(0);
    }
}
