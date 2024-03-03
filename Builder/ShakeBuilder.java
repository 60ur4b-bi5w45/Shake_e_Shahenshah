package Shake_e_Shahenshah.Builder;

import Shake_e_Shahenshah.Shakes.Shake;
import Shake_e_Shahenshah.Shakes.ShakeType;

public interface ShakeBuilder {
    void setShakeType(ShakeType shakeType);
    void addMilk();

    void addSugar();

    void addAdditionalIngredients();

    void makeLactoseFree();

    void addCandy();

    void addCookies();

    void queryForAddOns();

    Shake build();
}
