package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Lift {
    DcMotor lift;

    public Lift (HardwareMap hardwareMap) {
        lift = hardwareMap.get(DcMotor.class, "lift");
    }

    public void useLift (Gamepad gamepad) {
        lift.setPower((gamepad.right_bumper ? 1 : 0) - (gamepad.left_bumper ? 1 : 0));
    }
}
