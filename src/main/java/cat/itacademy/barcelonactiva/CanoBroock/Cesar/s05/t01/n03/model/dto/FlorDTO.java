package cat.itacademy.barcelonactiva.CanoBroock.Cesar.s05.t01.n03.model.dto;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class FlorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /*private List<String> floresUE = new ArrayList<>(Arrays.asList("Alemania", "Belgica", "Croacia", "España", "Francia", "Irlanda",
            "Letonia", "Luxemburgo", "Paises Bajos", "Suecia", "Bulgaria", "Eslovaquia", "Estonia", "Grecia", "Malta",
            "Polonia", "Republica Checa", "Austria", "Chipre", "Eslovenia", "Finlandia", "Hungria", "Italia",
            "Lituania", "Portugal", "Rumania"));*/

    private int pk_FlorID;
    private String nomFlor;
    private String paisFlor;
    private String tipoFlor;

}
