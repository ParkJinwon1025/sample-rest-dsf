package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Id;

public class ObjetBuffer {
    
    @Id
    private UUID id;
    private String type; // Unload / load
}
