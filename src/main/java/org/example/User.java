package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String userName;
    private Role userRole;
}
