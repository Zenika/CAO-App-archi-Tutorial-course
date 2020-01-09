package cao.application.architecture.poneyhiring.model;

import javax.validation.constraints.NotBlank;

public class ClientDTO {

    public Long id;
    @NotBlank(message = "First name is mandatory")
    public String firstName;
    @NotBlank(message = "Last name is mandatory")
    public String lastName;

}
