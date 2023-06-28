package OOP_DZ7_FinalTask.logger;



import java.time.LocalDateTime;

public class Log implements Logger {

    public Log() {
    }

    @Override
    public void writeLog(String str) {
        System.out.println(LocalDateTime.now() + ": " + str);
    }
}
