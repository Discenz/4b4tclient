package me.discens.fbftclient.managers;

import me.discens.fbftclient.module.Category;
import me.discens.fbftclient.module.Module;

import java.util.ArrayList;

public class ModuleManager {

    private ArrayList<Module> modules;

    public ModuleManager () {
        modules = new ArrayList<>();
    }

    public ArrayList<Module> getModules () {
        return modules;
    }

    public ArrayList<Module> getModulesByCategory(Category category) {
        ArrayList<Module> mods = new ArrayList<>();
        for(Module module: modules) {
            if(module.getCategory().equals(category)) mods.add(module);
        }
        return mods;
    }

    public Module getModule (String name) {
        for(Module module: modules) {
            if(module.getName().equals(name)) return module;
        }
        return null;
    }
}
