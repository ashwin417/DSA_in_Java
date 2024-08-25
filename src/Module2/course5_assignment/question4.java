package Module2.course5_assignment;

interface Logger{
    void loginfo(String msg);

    static void logError(String msg) {

    }
}

class DatabaseLogger implements Logger{

    @Override
    public void loginfo(String msg) {
    System.out.println("Database Logger - Info"+msg);
    }

    public void logError(String msg) {
    System.out.println("Database Logger - Error"+msg);
    }
}

 class FileLogger implements Logger{

    @Override
    public void loginfo(String msg) {
        System.out.println("File Logger - Info"+msg);
    }

    public void logError(String msg) {
        System.out.println("File Logger - Error"+msg);
    }
}


class Application {
    private Logger logger;

    public Application(Logger logger) {
        this.logger = logger;
    }

    public void performApplicationTask() {
        logger.loginfo("Application started.");

        try {
            System.out.println("Performing a critical task...");

            if (Math.random() > 0.5) {
                throw new Exception("An unexpected error occurred.");
            }

            logger.loginfo("Task completed successfully.");

        } catch (Exception e) {
            Logger.logError(e.getMessage());
        }

        logger.loginfo("Application finished.");
    }
}

public class question4 {

    public static void main(String[] args) {
        Logger fileLogger = new FileLogger();
        Application filelogapp = new Application(fileLogger);
        filelogapp.performApplicationTask();

        System.out.println("DatabaseLogger on...");

        Logger databaseLogger = new DatabaseLogger();
        Application databaselogapp = new Application(databaseLogger);
        databaselogapp.performApplicationTask();
    }
}
