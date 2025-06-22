        public class Logger {
            // Static variable to hold the one and only instance
            private static Logger instance;

            // Private constructor to avoid external object creation
            private Logger() {
                System.out.println("Logger initialized.");
            }
            //giving access to get single instance
            public static Logger getInstance() {
                //creates a new instance only if it doesn't already exist 
                if (instance == null) {
                    instance = new Logger(); 
                }
           return instance; //if created already then its time to return it
            }
        public void log(String message) {
                System.out.println("Log: " + message); //display purpose
            }
        }