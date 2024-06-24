package ru.mudan.testentity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
//    @ManyToOne
//    @JoinColumn(name = "user_id",referencedColumnName = "id")
//    private User user;
//    меняем
    @Column(name = "user_id")
    private Long userId;
}
