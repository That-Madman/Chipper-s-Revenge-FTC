package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Arm {
    DcMotorEx left;
    DcMotorEx right;

    public Arm (HardwareMap map) {
        //TODO: FIND OUT NAMES
        left = map.get(DcMotorEx.class, "");
        right = map.get(DcMotorEx.class, "");
    }

    public void moveArmSimple (Gamepad gamepad) {
        left.setPower(gamepad.right_trigger - gamepad.left_trigger);
        right.setPower(gamepad.left_trigger - gamepad.right_trigger);
    }
}
