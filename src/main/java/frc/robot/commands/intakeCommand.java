package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class intakeCommand extends CommandBase{
    private Intake IntakeSubsystem;
    public intakeCommand(Intake IntakeSubsystem) {
        this.IntakeSubsystem = IntakeSubsystem;
    }
    public void initialize() {
        IntakeSubsystem.setSpeed(0.5);
    }
}
