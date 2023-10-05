// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public final class IntakeConstants {
    public static final int INTAKE_MOTOR_1_ID = 0;
    public static final int INTAKE_MOTOR_2_ID = 1;
    public static final double INTAKE_SPEED = 0.1;
  }

  public final class PivotConstants {
    public static final double MAX_ANGLE = 45;
    public static final int PIVOT_MOTOR_1_ID = 2;
    public static final int PIVOT_MOTOR_2_ID = 3;
  }
}
