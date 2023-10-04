package frc.robot.commands.IntakeSubsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase {

    public CANSparkMax motor1 = new CANSparkMax(Constants.IntakeConstants.INTAKE_MOTOR_1_ID, MotorType.kBrushless);
    public CANSparkMax motor2 = new CANSparkMax(Constants.IntakeConstants.INTAKE_MOTOR_2_ID, MotorType.kBrushless);

    public IntakeSubsystem() {
        motor1.follow(motor2, false);
        // motor1.follow(motor2, true);

        motor1.set(0);
        motor2.set(0);
    }
    
    public void runMotors() {
        motor2.set(Constants.IntakeConstants.INTAKE_SPEED);
    }

    public void stopMotors() {
        motor2.stopMotor();
    }

    public double getVelocity() {
        RelativeEncoder encoder = motor2.getEncoder();
        return encoder.getVelocity();
    }

}
