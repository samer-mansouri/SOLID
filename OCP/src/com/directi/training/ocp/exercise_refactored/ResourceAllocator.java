package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocator {

    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(IResource resource){
        try {
            int resourceId;
            resourceId = resource.findFreeSlot();
            resource.markSlotBusy(resourceId);
            return resourceId;
        } catch(Exception e) {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            return INVALID_RESOURCE_ID;
        }
        
    }

    public void free(IResource resource, int resourceId){
        resource.markSlotFree(resourceId);
    }

}