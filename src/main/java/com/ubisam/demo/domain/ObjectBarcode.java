package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Id;

public class ObjectBarcode {
    
    @Id
    private UUID id;
    private String location;
}
