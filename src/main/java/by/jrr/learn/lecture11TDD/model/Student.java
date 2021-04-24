package by.jrr.learn.lecture11TDD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Long id;

    private String name;

    private Integer age;

    private String workPlace;

}
