package frc.robot.commands.PivotSubsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class PivotSubsystem extends SubsystemBase {
    public final CANSparkMax motor1 = new CANSparkMax(Constants.PivotConstants.PIVOT_MOTOR_1_ID, MotorType.kBrushless);
    public final CANSparkMax motor2 = new CANSparkMax(Constants.PivotConstants.PIVOT_MOTOR_2_ID, MotorType.kBrushless);

    public PivotSubsystem() {
        motor1.follow(motor2, false); // pls figure out if invert is right, do not hurt robot

        motor1.set(0);
        motor2.set(0);
    }
}
