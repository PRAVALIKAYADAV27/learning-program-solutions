public class Main {
    public static void main(String[] args) {
        
        Logger logger1 = Logger.getInstance(); //creating the logger
        Logger logger2 = Logger.getInstance(); //reuses the same logger

        // log some messages
        logger1.log("Starting the application...");
        logger2.log("Application is running.");

        // checking if both are the same
        if (logger1==logger2){
        System.out.println("Both logger instances are the same (Singleton works).");
        } 
        else {
            System.out.println("Different instances (Singleton failed).");
        }
    }
}


    