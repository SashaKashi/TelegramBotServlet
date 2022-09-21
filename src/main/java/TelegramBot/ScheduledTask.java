package TelegramBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.TimerTask;

public class ScheduledTask  extends TimerTask {

    TelegramBot bot;


    public ScheduledTask(TelegramBot bot) {
        this.bot = bot;
    }

    @Override
    public void run() {
        bot.sendRemind();
    }
}