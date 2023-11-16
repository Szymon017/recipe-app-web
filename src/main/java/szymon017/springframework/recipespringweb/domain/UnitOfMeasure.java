package szymon017.springframework.recipespringweb.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
}