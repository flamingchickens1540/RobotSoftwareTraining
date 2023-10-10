package frc.robot.commands.PivotSubsystem;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.StatorCurrentLimitConfiguration;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class PivotSubsystem extends SubsystemBase {
    public final TalonFX motor1 = new TalonFX(Constants.PivotConstants.PIVOT_MOTOR_1_ID);
    public final TalonFX motor2 = new TalonFX(Constants.PivotConstants.PIVOT_MOTOR_2_ID);

    public PivotSubsystem() {
        motor1.configStatorCurrentLimit(new StatorCurrentLimitConfiguration(true, 60, 60, 0));
        motor2.configStatorCurrentLimit(new StatorCurrentLimitConfiguration(true, 60, 60, 0));
        motor1.setInverted(false);
        motor1.configForwardSoftLimitThreshold(139_000);
        motor1.configForwardSoftLimitEnable(true);
        motor1.configReverseSoftLimitThreshold(-134_500);
        motor1.configReverseSoftLimitEnable(true);
        motor2.setInverted(true);
        motor2.follow(motor1);
        motor1.set(ControlMode.PercentOutput, 0);
    }

    public void runMotors(double speed) {
        motor1.set(ControlMode.PercentOutput, speed);
    }
}
