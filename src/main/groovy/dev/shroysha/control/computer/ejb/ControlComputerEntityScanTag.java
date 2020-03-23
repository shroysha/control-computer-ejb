package dev.shroysha.control.computer.ejb;

public interface ControlComputerEntityScanTag {

    String BASE_URL = "http://localhost:8080";

    String SUCCESS_CODE = "success";
    String SHOW_HELP = "help";

    String QUEUE_ADD = "/queue/add";
    String QUEUE_EXECUTE = "/queue/execute";
    String POPUP_TEXT = "/popup/text";
    String POPUP_ANSWER = "/popup/answer";
    String WEB_OPEN = "/web/open";
    String SYS_CMD = "/sys/cmd";
    String SYS_TASKKILL = "/sys/taskkill";
    String SYS_RESTART = "/sys/restart";
    String SERVER_QUIT = "/server/quit";
    String CLIENT_QUIT = "/client/quit";


    static void main(String[] args) {

    }
}
