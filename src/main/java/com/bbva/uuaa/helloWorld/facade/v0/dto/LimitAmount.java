package com.bbva.uuaa.helloWorld.facade.v0.dto;


import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter

public class LimitAmount implements Serializable {
    @NotNull(message = "la cantidad no puede ser nula")
    private Integer amount;

    @NotNull(message = "la moneda no puede ser nula")
    @NotBlank(message = "la moneda no puede ser vacía o contener solo espacios")
    private String currency;
}
