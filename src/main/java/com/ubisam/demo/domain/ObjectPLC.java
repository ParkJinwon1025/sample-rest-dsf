package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Id;

public class ObjectPLC {
    
    @Id
    private UUID id;
    private String name;
    private String location;
    private boolean EQAlarm;
    private boolean EQFireStatus;
    private boolean EQPause;
    private boolean EQManual;
    private boolean EQAutoWait;
    private boolean HasTrouble;
    private boolean ForceOut;
    private boolean InTrayIDUp;
    private boolean OutTrayIDUp;
    private boolean NGTrayIDUp;
    private boolean AutoInput;
    private boolean HandInput;
    private boolean GradeReq;
    private boolean InTrayIDOutputUp;
    private boolean OutTrayIDOutputUp;
    private boolean NGTrayIDOutputUp;
}
