package com.springboot.cloud.demos.producer.jpa.entity.pojo;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineCoures {
    @Id
    @GeneratedValue(generator = "productGenerator")
    @GenericGenerator(name = "productGenerator", strategy = "uuid")
    private String id;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;
}
