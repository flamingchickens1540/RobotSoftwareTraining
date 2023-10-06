package frc.robot.commands.IntakeSubsystem;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;

public class RunIntake extends CommandBase{
    public final IntakeSubsystem m_intake;

    public RunIntake(IntakeSubsystem subsystem) {
        m_intake = subsystem;
        addRequirements(m_intake);
    }

    @Override
    public void initialize() {
        m_intake.runMotors();
    }

    @Override
    public boolean isFinished() {
        return (m_intake.getVelocity() < Constants.IntakeConstants.INTAKE_SPEED);
    }

    @Override
    public void end(boolean interrupted) {
        m_intake.stopMotors();
    }
}
