package com.delaney.firstrest.task;

import lombok.*;
import java.time.LocalDate;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column
    private LocalDate endDate;

    @DateTimeFormat(pattern = "HH:mm")
    @Column
    private LocalTime endTime;
}