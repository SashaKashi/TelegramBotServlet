import TelegramBot.ScheduledTask;
import TelegramBot.TelegramBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

//@WebServlet(name = "servlet", urlPatterns = {"/TelegramBot2-1.0-SNAPSHOT/servlet"})
public class servlet extends HttpServlet {



    public void init() {
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            TelegramBot bot = new TelegramBot();
            telegramBotsApi.registerBot(bot);


            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date;
            try {
                date = dateFormat.parse("2022-09-21 15:17:00");
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            Timer timer = new Timer();
            //timer.schedule(new ScheduledTask(bot),30000L);

            timer.schedule(new ScheduledTask(bot), date, 1740000L);






        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
    }
}
