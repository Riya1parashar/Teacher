package com.User.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "teacher")
public class TeacherRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tId;
   @Column(name = "name" , length = 30)
    private String tName;
   @Column(name = "contact" , length = 10)
    private String mobileNumber;
}
