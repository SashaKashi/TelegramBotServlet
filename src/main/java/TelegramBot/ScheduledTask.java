package TelegramBot;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.TimerTask;

public class ScheduledTask  extends TimerTask {

    TelegramBot bot;
    Message command;

    public ScheduledTask(TelegramBot bot, Message command) {
        this.bot = bot;
        this.command=command;
    }

    @Override
    public void run() {
        this.bot.sendRemind(command);
    }
}