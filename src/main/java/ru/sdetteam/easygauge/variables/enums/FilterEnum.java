package ru.sdetteam.easygauge.variables.enums;

import lombok.Getter;
import lombok.Setter;

public enum FilterEnum {

    ASSIGNED("assigned", "Ответственный"),

    MONITORED("monitored", "Отслеживают"),
    UNASSIGNED("unassigned", "Неназначенный");

    @Getter
    @Setter
    private final String apiName;
    @Getter
    @Setter
    private final String webInterfaceName;


    FilterEnum(final String apiName, String webInterfaceName) {
        this.apiName = apiName;
        this.webInterfaceName = webInterfaceName;
    }

}
