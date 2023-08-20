package com.techreturners.exercise003;

import java.util.Arrays;
import java.util.Optional;

public class Exercise003 {

    static final IceCreamFlavour [] flavourLookupTable = new IceCreamFlavour[]{
            new IceCreamFlavour("Pistachio", 11),
            new IceCreamFlavour("Raspberry Ripple", 1),
            new IceCreamFlavour("Vanilla", 43),
            new IceCreamFlavour("Mint Chocolate Chip", 3),
            new IceCreamFlavour("Chocolate", 423),
            new IceCreamFlavour("Mango Sorbet", 5)
    };

    int getIceCreamCode(String name) {
        Optional<IceCreamFlavour> foundFlavour = Arrays.stream(flavourLookupTable).filter(flavour -> flavour.getName().equals(name)).findFirst();
        if(foundFlavour.isPresent())
            return foundFlavour.map(IceCreamFlavour::getCode).orElse(-1);
        else
            throw new IllegalArgumentException("Unknown Flavour");
    }

    String[] iceCreamFlavours() {
        return Arrays.stream(flavourLookupTable).map(IceCreamFlavour::getName).toArray(String[]::new);
    }

}
