package us.gloo.roster.dto;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String major;
    private List<Course> courses;
}
