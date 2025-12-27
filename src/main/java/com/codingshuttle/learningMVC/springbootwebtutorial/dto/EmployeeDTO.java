package com.codingshuttle.learningMVC.springbootwebtutorial.dto;

import com.codingshuttle.learningMVC.springbootwebtutorial.annotations.PrimeValidation;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long id;
    @NotNull( message = " enter name please ")
    @Size(min = 3 , max = 10 , message = "enter name in between 3 to 10")
    private String name;

    @Email(message = "enter vlid mail")
    private String email;

    @Min(value = 3 , message = "min value is 3")
    @Max(value = 150 , message = "max value is 150")
    @PrimeValidation
    private Integer age;

    @Digits(integer = 6 , fraction = 2 , message = " enter salary in range of xxxxxx:yy")
    private Double salary;

    @PastOrPresent(message = "date of joining cant be in future")
    private LocalDate dateOfJoining;

    @AssertTrue(message = "Employee should be active")
    private Boolean isActive;
}
