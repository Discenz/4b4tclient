package me.discens.fbftclient.module;

import me.discens.fbftclient.FbftClient;
import me.zero.alpine.listener.Listenable;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Module implements Listenable {
    private String name, description;
    private Category category;
    private boolean toggled, hidden;
    private int key;
    private Color color;
    private ArrayList<Setting> settings;

    public Module(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.toggled = false;
        this.hidden = false;
        this.key = 0;
        this.color = new Color((int)(Math.random() * 0x1000000));
        settings = null;
    }

    public Module(String name, String description, Category category, Setting... setting) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.toggled = false;
        this.hidden = false;
        this.key = 0;
        this.color = new Color((int)(Math.random() * 0x1000000));
        settings = new ArrayList<>(Arrays.asList(setting));
    }

    public ArrayList<Setting> getSettings () {
        return settings;
    }

    public Setting getSetting (String name) {
        if (settings == null || settings.isEmpty()) return null;

        for(Setting setting: settings) {
            if(setting.getName().equalsIgnoreCase(name)) return setting;
        }

        return null;
    }


    public void onEnable () {
        FbftClient.eventBus.subscribe(this);
    }

    public void onDisable() {
        FbftClient.eventBus.unsubscribe(this);
    }

    public void toggle () {
        toggled = !toggled;
        if(toggled) onEnable();
        else onDisable();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isToggled() {
        return toggled;
    }

    public void setToggled(boolean toggled) {
        this.toggled = toggled;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
