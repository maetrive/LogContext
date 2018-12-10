package top.hardest.logcontext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.security.auth.login.LoginContext;

public class HelloLog {

    private static Logger logger = LogManager.getLogger("module_A");

    private LogContext logContext = new LogContext();

    public static void main(String[] args) {
        logger.info("hello world!");
    }

}
