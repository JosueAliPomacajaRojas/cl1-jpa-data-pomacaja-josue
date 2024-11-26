package pe.edu.i202221222.cl1_jpa_data_pomacaja_josue.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "city", indexes = {
        @Index(name = "idx_country_code", columnList = "CountryCode")
})


public class City {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer ID;
    private String Name;
    private String CountryCode;
    private String District;
    private Integer Population;

}
