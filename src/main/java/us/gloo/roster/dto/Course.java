package us.gloo.roster.dto;

import lombok.Data;

@Data
public class Course {
    private int id;
    private String name;
    private String courseNumber;
    private String teacher;
}
