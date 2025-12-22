package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectUser;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event39HostProcessEndConfirm {

    @Id
    private Long timestamp;
    private ObjectUser objectUser;
    
}
