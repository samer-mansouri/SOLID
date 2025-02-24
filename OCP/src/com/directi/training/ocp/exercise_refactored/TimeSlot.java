package com.directi.training.ocp.exercise_refactored;

public class TimeSlot implements IResource {
    
    @Override
    public void markSlotBusy(int resourceId){}

    @Override
    public void markSlotFree(int resourceId){}

    @Override
    public int findFreeSlot(){
        return 0;
    }

}