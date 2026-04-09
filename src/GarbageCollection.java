public class GarbageCollection {
    
    // TODO: Override the finalize() method
    @Override
    protected void finalize() {
        // Inside it, print "Garbage Collected"
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        // TODO: Create an object of GarbageCollection class
        GarbageCollection obj = new GarbageCollection();
        
        // TODO: Make the object eligible for garbage collection
        // Assigning null removes the reference to the object on the heap
        obj = null;
        
        // TODO: Request Garbage Collection using System.gc()
        // This is a request to the JVM, not a command.
        System.gc();
        
        // In some environments, the program might end too fast for GC to run.
        // Calling runFinalization() helps ensure the finalize method is invoked.
        System.runFinalization();
    }
}
