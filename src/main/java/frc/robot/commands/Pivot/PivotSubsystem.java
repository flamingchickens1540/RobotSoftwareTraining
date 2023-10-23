package frc.robot.commands.Pivot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PivotSubsystem extends SubsystemBase {
    private final TalonFX pivot1 = new TalonFX(10);
    private final TalonFX pivot2 = new TalonFX(11);
    


    public PivotSubsystem() {
        pivot2.follow(pivot1);
        pivot2.setInverted(true);
        pivot1.setInverted(false);
        pivot1.configForwardSoftLimitEnable(true);
        pivot1.configReverseSoftLimitEnable(true);
        pivot1.configForwardSoftLimitThreshold(139_000);
        pivot1.configReverseSoftLimitThreshold(-134_500);
    }

    public void motorSpeed(double speed) {
        pivot1.set(ControlMode.PercentOutput, speed);
    }
}
