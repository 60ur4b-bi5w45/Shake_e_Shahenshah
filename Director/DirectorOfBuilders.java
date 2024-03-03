package Shake_e_Shahenshah.Director;

import Shake_e_Shahenshah.Builder.ShakeBuilder;
import Shake_e_Shahenshah.Shakes.Shake;
import Shake_e_Shahenshah.Shakes.ShakeType;

public class DirectorOfBuilders {
    public Shake makeShake(ShakeBuilder shakeBuilder, ShakeType shakeType) {
        shakeBuilder.setShakeType(shakeType);
        shakeBuilder.addMilk();
        shakeBuilder.addSugar();
        shakeBuilder.queryForAddOns();
        return shakeBuilder.build();
    }
}
