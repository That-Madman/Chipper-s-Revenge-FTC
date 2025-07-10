package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Arm {
    DcMotorEx left;
    DcMotorEx right;

    DcMotorEx forward;

    public Arm (HardwareMap map) {
        //TODO: FIND OUT NAMES
        left = map.get(DcMotorEx.class, "l");
        right = map.get(DcMotorEx.class, "r");
        forward = map.get(DcMotorEx.class, "f");
    }

    public void moveArmSimple (Gamepad gamepad) {
        left.setPower(gamepad.right_trigger - gamepad.left_trigger);
        right.setPower(gamepad.left_trigger - gamepad.right_trigger);
        forward.setPower((gamepad.dpad_up? 1 : 0) - (gamepad.dpad_down? 1 : 0));
    }
}
