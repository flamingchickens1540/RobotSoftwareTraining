package frc.robot.commands.IntakeSubsystem;

import edu.wpi.first.wpilibj2.command.CommandBase;

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
        return (m_intake.getVelocity() < 0.1);
    }

    @Override
    public void end(boolean interrupted) {
        m_intake.stopMotors();
    }
}
