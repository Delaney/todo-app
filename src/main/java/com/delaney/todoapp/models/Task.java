package com.delaney.todoapp.models;

import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tasks")
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

    @Column
    @CreatedDate
    private LocalDateTime created_at;

    @Column
    @LastModifiedDate
    private LocalDateTime updated_at;
}