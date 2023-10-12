package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@AllArgsConstructor
@Builder
@With
public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String userName;
    private Role userRole;
}
