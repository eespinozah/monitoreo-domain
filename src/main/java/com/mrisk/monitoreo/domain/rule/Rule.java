package com.mrisk.monitoreo.domain.rule;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rule {

    private Integer normId;
    private String name;
    private Integer compId;
    private Integer csubId;
    private String detail;
    private String description;
    private Integer accoId;
    private Boolean legal;
    private Integer typeId;

    
    
    private Integer tenaId;
    private Boolean alive = Boolean.TRUE;
    private Calendar creationTime = Calendar.getInstance();
    private Calendar modificationTime;
    private Calendar destructionTime;
}
