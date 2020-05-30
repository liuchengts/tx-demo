package com.example.txdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "demo_a_model")
public class DemoAModel implements Serializable {

    @Id
    @Column(name = "id",
            columnDefinition = "bigint(20) COMMENT 'ID,自增'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cc",
            columnDefinition = ("integer(11) COMMENT 'cc'"))
    private Integer cc;
}
