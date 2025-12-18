package com.ubisam.demo.domain.HMUW;

import java.util.UUID;

import jakarta.persistence.Id;

public class ObjectBarcode {
    
    @Id
    private UUID id;
    private String location;
}
