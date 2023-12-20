package frc.robot.commands;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    private CANSparkMax motor1 = new CANSparkMax(14, MotorType.kBrushless);
    private CANSparkMax motor2 = new CANSparkMax(15, MotorType.kBrushless);

    public Intake() {
        motor2.setInverted(true);
        motor1.setInverted(false);
        motor2.follow(motor1);
    }

    public void intake(double speed) {
        motor1.set(speed);

    }

}
