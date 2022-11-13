package org.de.spring.jpa.ex.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name="product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "updated_at", columnDefinition = "DATE")
    private LocalDateTime updatedAt;
    private String contents;
    private int price;
}
