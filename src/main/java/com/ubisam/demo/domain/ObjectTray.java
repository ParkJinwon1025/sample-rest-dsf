package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Id;

public class ObjectTray {

    @Id
    private UUID id;
    private String type;
    private String location;
    
}
