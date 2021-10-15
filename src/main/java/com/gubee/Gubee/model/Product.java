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

    @ManyToMany(mappedBy = "name",
            cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE})
    private List<Stack> stack;
}
