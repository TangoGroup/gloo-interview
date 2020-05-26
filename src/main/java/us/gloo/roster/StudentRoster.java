package us.gloo.roster;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.ResourceUtils;
import us.gloo.roster.dto.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentRoster {
    private final List<Student> studentRoster;

    public StudentRoster() {
        studentRoster = Arrays.asList(deserializeJson("classpath:student-roster.json"));
    }

    public List<String> step1() {
        // TODO implement me
        return Collections.emptyList();
    }

    public List<String> step2() {
        // TODO implement me
        return Collections.emptyList();
    }

    public double step3() {
        // TODO implement me
        return 0.0;
    }

    private Student[] deserializeJson(String filePath) {
        try {
            File file = ResourceUtils.getFile(filePath);
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(file, Student[].class);
        } catch (IOException e) {
            throw new RuntimeException("Error loading file " + filePath);
        }
    }
}