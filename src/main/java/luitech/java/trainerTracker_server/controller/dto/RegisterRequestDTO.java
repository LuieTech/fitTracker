package luitech.java.trainerTracker_server.controller.dto;

import lombok.Data;

@Data

public class RegisterRequestDTO {

    private String name;
    private String email;
    private String password;

}
