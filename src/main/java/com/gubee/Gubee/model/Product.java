package com.gubee.Gubee.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter @Setter @Data @AllArgsConstructor @NoArgsConstructor
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String simpleDescription;
    private String fullDescription;
    private String target;
    private LocalDateTime registerDate;

    @ElementCollection
    private List<String> stack;
}
