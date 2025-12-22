package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectRecipe;
import com.ubisam.demo.domain.ObjectRoute;

import jakarta.persistence.Id;
import lombok.Data;

// 13. Recipe 요청 Confirm with RouteID
@Data
public class Event13HostRecipeInfoAck {
    
    @Id
    private Long timestamp;
    private Event12EqpRecipeInfoRequest event12;
    private ObjectRoute objectRoute;
    private ObjectRecipe objectRecipe;
    
    private String ackStatus; // OK/NG 등
    private String reason; // NG이면 이유;
}
