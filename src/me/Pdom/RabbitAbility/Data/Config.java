package me.Pdom.RabbitAbility.Data;

import me.Pdom.RabbitAbility.Message;
import me.Pdom.RabbitAbility.RabbitAbility;

import java.util.HashMap;

/**
 * Created by ahb03 on 2015-09-15.
 */
public class Config
{
    private HashMap<String, Integer>    integers  = new HashMap<String, Integer>();
    private HashMap<String, Boolean>    booleans  = new HashMap<String, Boolean>();
    private HashMap<String, String>     strings   = new HashMap<String, String>();

    public Config(RabbitAbility ra)
    {
        Message.sendConsoleMessage("config.yml 파일을 불러오는 중입니다...");

        ra.getConfig().options().copyDefaults(true);
        ra.saveConfig();

        booleans.put("초반 무적", ra.getConfig().getBoolean("초반 무적"));

        Message.sendConsoleMessage("불러오기 완료.");
    }

    public Integer getInt(String key)
    {
        if ( integers.containsKey(key) )
            return integers.get(key);
        else
            return null;
    }

    public Boolean getboolean(String key)
    {
        if ( booleans.containsKey(key) )
            return booleans.get(key);
        else
            return null;
    }

    public String getString(String key)
    {
        if ( strings.containsKey(key) )
            return strings.get(key);
        else
            return null;
    }
}
