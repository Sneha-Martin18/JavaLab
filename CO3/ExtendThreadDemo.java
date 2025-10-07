// MyThread class extends Thread to create a custom thread
class MyThread extends Thread // Fixed: should extend Thread, not itself
{
    // This method is called when the thread starts
    public void run()
    {
        // Print the name of the current thread
        System.out.println("Hello from " + this.getName()); 
    }
}

public class ExtendThreadDemo
{
    public static void main(String[] args)
    {
        // Create an instance of MyThread
        MyThread t1 = new MyThread();
        
        // Start the thread, which calls the run() method
        t1.start();
    }
}