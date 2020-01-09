package cao.application.architecture.poneyhiring.model;

import javax.validation.constraints.NotBlank;

public class PoneyDTO {
    public Long id;
    @NotBlank
    public String name;
    @NotBlank
    public Enum<PoneyType> type;
}
