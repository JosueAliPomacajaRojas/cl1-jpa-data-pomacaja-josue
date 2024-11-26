package pe.edu.i202221222.cl1_jpa_data_pomacaja_josue.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "countrylanguage")
@IdClass(CountryLanguageId.class)
public class CountryLanguage {

    @Id
    private String CountryCode;
    @Id
    private String Language;
    private String IsOfficial;
    private Double Percentage;


}
