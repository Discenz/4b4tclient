package me.discens.fbftclient.module;

import java.util.ArrayList;
import java.util.Arrays;

enum Type {
    SLIDER, CHECKBOX, OPTION
}

public class Setting {
    private String name;
    private Type type;

    private Boolean checked;

    private Double selectedValue;
    private Double minValue;
    private Double maxValue;

    private String selectedOption;
    private ArrayList<String> options;

    private Module parent;

    public Setting(Module parent, String name, String selectedOption, ArrayList<String> options) {
        setNull();
        this.name = name;
        this.parent = parent;
        this.selectedOption = selectedOption;
        this.options = options;
        this.type = Type.OPTION;
    }

    public Setting(Module parent, String name, String selectedOption, String[] options) {
        setNull();
        this.name = name;
        this.parent = parent;
        this.selectedOption = selectedOption;
        this.options = new ArrayList<>(Arrays.asList(options));
        this.type = Type.OPTION;
    }

    public Setting(Module parent, String name, Double selectedValue, Double minValue, Double maxValue){
        setNull();
        this.name = name;
        this.parent = parent;
        this.selectedValue = selectedValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.type = Type.SLIDER;
    }

    public Setting(Module parent, String name, Boolean checked) {
        setNull();
        this.name = name;
        this.parent = parent;
        this.checked = checked;
        this.type = Type.CHECKBOX;
    }

    private void setNull () {
        checked = null;
        selectedValue = null;
        minValue = null;
        maxValue = null;
        selectedOption = null;
        options = null;
    }

    public String getName() {
        return name;
    }

    public Type getType () {
        return type;
    }

    public Boolean isOption() {
        if(type == Type.OPTION) return true;
        return false;
    }

    public Boolean isSlider () {
        if(type == Type.SLIDER) return true;
        return false;
    }

    public Boolean isCheckbox() {
        if(type == Type.CHECKBOX) return true;
        return false;
    }

    public Double getSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(Double selectedValue) {
        this.selectedValue = selectedValue;
    }

    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public Boolean isChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }

    public ArrayList<String> getOptions() {
        return options;
    }
}
