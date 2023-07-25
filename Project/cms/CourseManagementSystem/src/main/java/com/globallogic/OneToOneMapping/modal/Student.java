package com.globallogic.OneToOneMapping.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;
    private String course;
    private String studentaddress;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private List<Course> courses;

    @OneToOne(cascade = CascadeType.PERSIST)
    private FinalProject project;

}
