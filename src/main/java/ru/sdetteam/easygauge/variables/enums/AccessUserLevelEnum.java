package ru.sdetteam.easygauge.variables.enums;


import lombok.Getter;
import lombok.Setter;

public enum AccessUserLevelEnum {

    WATCHER(10, "наблюдатель"),
    AUTHOR(25, "автор"),
    EDITOR(40, "редактор"),
    DEV(55, "разработчик"),
    MANAGER(70, "руководитель"),
    ADMIN(90, "администратор");

    @Getter
    @Setter
    private final int code;
    @Getter
    @Setter
    private final String description;

    AccessUserLevelEnum(final int code, final String description){
        this.code = code;
        this.description = description;
    }
}
