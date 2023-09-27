package org.firstinspires.ftc.teamcode.util;

public class RobotConstants {
    // Put all the constants we need across opmodes here. Don't forget to make them public and static!

    // gobilda 312 rpms apparently have 537.7 ppr at the output shaft and 28 counts on the actual motor shaft like most other motors

    // the slides are on a 4 to 1 gearbox, so their 28 encoder counts at end of motor are actually 28*4
    // max lift extension should be around 640 encoder ticks, probably a bit less, so let's go with 620.
    public static final int
    LIFT_MAX = 620,
    TOP_LINE_POSITION = 0,
    MIDDLE_LINE_POSITION = 0,
    BOTTOM_LINE_POSITION = 0,
    INTAKE_VELOCITY = 2776; // this is 850 rpm for the gobilda 312 rpm motor. 850/60/2.744 * 537.7;

    public static final double
    //TODO: set the intake and outtake servo positions as well as claw positions later
    LEFT_INTAKE_OUT_POSITION = 0.8525,
    RIGHT_INTAKE_OUT_POSITION = -LEFT_INTAKE_OUT_POSITION,
    LEFT_INTAKE_IN_POSITION = 0.4,
    RIGHT_INTAKE_IN_POSITION = -LEFT_INTAKE_IN_POSITION,
    LEFT_INTAKE_DROP_POSITION = 0,
    RIGHT_INTAKE_DROP_POSITION = -LEFT_INTAKE_DROP_POSITION,
    // for the intake, 0.31 servo position change means 90 degrees forward change
    // so, 0.00344444444 servo position change is a 1 degree change

    INTAKE_SERVO_TO_DEGREES = 1/0.003444444444444444444444444444444444444444,
    INTAKE_DEGREES_TO_SERVO = 0.003444444444444444444444444444444444444444,

    LEFT_OUTTAKE_OUT_POSITION = 0,
    RIGHT_OUTTAKE_OUT_POSITION = -LEFT_OUTTAKE_OUT_POSITION,
    LEFT_OUTTAKE_IN_POSITION= 0,
    RIGHT_OUTTAKE_IN_POSITION = -LEFT_OUTTAKE_IN_POSITION,
    LEFT_OUTTAKE_AVOID_POSITION = 0,
    RIGHT_OUTTAKE_AVOID_POSITION = -LEFT_OUTTAKE_AVOID_POSITION,

    OUTER_CLAW_CLOSE_POSITION = 0.65,
    INNER_CLAW_CLOSE_POSITION = 0.913,
    OUTER_CLAW_OPEN_POSITION = 0.57, //adjust later
    INNER_CLAW_OPEN_POSITION = 0.943;


}
