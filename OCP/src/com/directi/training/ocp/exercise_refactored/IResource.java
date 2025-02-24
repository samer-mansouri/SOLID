package com.directi.training.ocp.exercise_refactored;

public interface IResource {

    public void markSlotBusy(int resourceId){}

    public void markSlotFree(int resourceId){}

    public int findFreeSlot(){}

}