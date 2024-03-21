package uoc.tfm.ticketrestaurant.empresas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmpresasDTO {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String email;

}
