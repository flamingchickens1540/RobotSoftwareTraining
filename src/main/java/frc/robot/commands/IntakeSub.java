package frc.robot.commands;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSub extends SubsystemBase {
    public CANSparkMax motor1 = new CANSparkMax(0, MotorType.kBrushless);
    public CANSparkMax motor2 = new CANSparkMax(0, MotorType.kBrushless);

    public IntakeSub() {
        motor2.setInverted(true);
        motor1.setInverted(false);
        motor2.follow(motor1);
    }

    public void intake(double speed) {
        motor1.set(speed);

    }

}
