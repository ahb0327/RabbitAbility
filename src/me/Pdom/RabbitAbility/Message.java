package me.Pdom.RabbitAbility;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.logging.Logger;

/**
 * Created by ahb03 on 2015-09-15.
 */
public class Message
{
    private static Logger logger = Logger.getLogger("Minecraft");

    public static void sendConsoleMessage(String message)
    {
        logger.info("[" + RabbitAbility.name + "]" + message);
    }

    public static void sendAllPlayerMessage(String message)
    {
        Player[] online_players = Bukkit.getOnlinePlayers();

        for ( Player player : online_players )
            player.sendMessage("[" + ChatColor.LIGHT_PURPLE + RabbitAbility.name + "]" + ChatColor.WHITE + message);
    }

    public static void sendPlayerMessage(Player player, String message)
    {
        player.sendMessage("[" + ChatColor.LIGHT_PURPLE + RabbitAbility.name + "]" + ChatColor.WHITE + message);
    }
}