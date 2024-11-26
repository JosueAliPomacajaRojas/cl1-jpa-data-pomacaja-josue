package pe.edu.i202221222.cl1_jpa_data_pomacaja_josue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.i202221222.cl1_jpa_data_pomacaja_josue.entity.CountryLanguage;
import pe.edu.i202221222.cl1_jpa_data_pomacaja_josue.entity.CountryLanguageId;

import java.util.List;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguageId> {

    List<CountryLanguage> findByCountryCode(String CountryCode);
}