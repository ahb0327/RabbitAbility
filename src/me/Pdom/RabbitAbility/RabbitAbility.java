package me.Pdom.RabbitAbility;

import me.Pdom.RabbitAbility.Data.Config;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by ahb03 on 2015-09-15.
 */
public class RabbitAbility extends JavaPlugin
{
    public final static String    name            = "RabbitAbility";
    public final static int       build_number    = 150915;

    public static Config config;

    @Override
    public void onEnable()
    {
        //config.yml 파일 읽어오기
        config = new Config(this);
    }

    @Override
    public void onDisable()
    {

    }
}