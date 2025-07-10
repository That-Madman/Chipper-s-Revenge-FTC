package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Arm {
    DcMotorEx left;
    DcMotorEx right;

    public Arm (HardwareMap map) {
        //TODO: FIND OUT NAMES
        left = map.get(DcMotorEx.class, "");
        right = map.get(DcMotorEx.class, "");
    }

}
