package frc.robot.commands.PivotSubsystem;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class PivotCommand extends CommandBase{
    public final PivotSubsystem m_PivotSubsystem;

    public PivotCommand(PivotSubsystem subsystem) {
        m_PivotSubsystem = subsystem;
        addRequirements(m_PivotSubsystem);
    }

    @Override
    public void initialize() {
        
    }
}
