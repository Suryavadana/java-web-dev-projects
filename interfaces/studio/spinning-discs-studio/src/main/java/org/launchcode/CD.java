package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    String diskType;
    String contents;

    public CD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at rate 200-500 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Play a game?");
    }


}
