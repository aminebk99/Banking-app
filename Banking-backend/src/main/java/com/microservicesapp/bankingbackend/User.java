package com.microservicesapp.bankingbackend;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "_users")
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String email;
    private String password;

}
