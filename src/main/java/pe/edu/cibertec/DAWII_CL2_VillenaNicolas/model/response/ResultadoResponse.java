package pe.edu.cibertec.DAWII_CL2_VillenaNicolas.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultadoResponse {
    private Boolean respuesta;
    private String mensaje;
}
