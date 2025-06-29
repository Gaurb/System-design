package Singleton;

public class Logger {
    // 1. private static variable to hold the single instance
    private static Logger instance;

    // 2. private constructor to prevent instantiation
    private Logger(){}

    // 3. Public method to provide access to the instance
    // Synchronized block ensure only one thread can access it at a time
    /*
    public static synchronized Logger getInstance(){
        if(instance==null) {
            instance = new Logger(); //create new instance only if it doesn't exist
        }
        return instance;
    }
     */

    /*
    private static final class InstanceHolder {
        // 1. private static variable to hold the single instance
        private static final Logger instance = new Logger();
    }

    public static Logger getInstance(){
        return InstanceHolder.instance;
    }
    */

    public static Logger getInstance(){
        if(instance==null){
            synchronized (Logger.class){
                if(instance==null){
                    instance= new Logger();
                }
            }
        }
        return instance;
    }
    

    public void log(String message){
        System.out.println("Log: "+message);
    }

}
