package frc.robot.commands.intake;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;

import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase{
    
    //fields 
    private final CANSparkMax intakeA = new CANSparkMax(Constants.intakeConstants.intakeMotorA, CANSparkMax.MotorType.kBrushless);
    private final CANSparkMax intakeB = new CANSparkMax(Constants.intakeConstants.intakeMotorB, CANSparkMax.MotorType.kBrushless);

  public IntakeSubsystem() {
    intakeA.setInverted(true);
    // intakeB.setInverted(true);
    intakeB.follow(intakeA, true);
    intakeA.setIdleMode(IdleMode.kBrake);
    intakeB.setIdleMode(IdleMode.kBrake);
  }

  public void intakeRun(double speed){
    intakeA.set(speed);
  }

  public void stopIntakeRun(){
    intakeA.set(0);
  }
  
  }

  /**
   * Example command factory method.
   * 
   * Notes:
   * set percent function that calls motor.setpercent(input value) (this is from the SPARK)
   * other file is the command file
   * subsystem file has the functions, these functions are run in the command file
   * Make it so I can't run the command without that subsystem (pass it as a parameter) 
   * 
   *
   * @return a command
   */
  




