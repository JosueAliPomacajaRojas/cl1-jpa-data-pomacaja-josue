package pe.edu.i202221222.cl1_jpa_data_pomacaja_josue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pe.edu.i202221222.cl1_jpa_data_pomacaja_josue.entity.Country;
import pe.edu.i202221222.cl1_jpa_data_pomacaja_josue.entity.CountryLanguage;
import pe.edu.i202221222.cl1_jpa_data_pomacaja_josue.repository.CountryLanguageRepository;
import pe.edu.i202221222.cl1_jpa_data_pomacaja_josue.repository.CountryRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@SpringBootApplication
public class Cl1JpaDataPomacajaJosueApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository;


	public static void main(String[] args) {

		SpringApplication.run(Cl1JpaDataPomacajaJosueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

/**
		Optional<List<CountryLanguage>> optionalLanguagesARG = Optional.ofNullable(
				countryLanguageRepository.findByCountryCode("ARG")
		);

		optionalLanguagesARG.ifPresentOrElse(
				languages -> {
					System.out.println("Lenguajes en Argentina:");
					languages.forEach(language -> System.out.println(language.getLanguage()));
				},
				() -> {

					List<CountryLanguage> languagesPER = countryLanguageRepository.findByCountryCode("PER");
					System.out.println("Lenguajes en Perú:");
					languagesPER.forEach(language -> System.out.println(language.getLanguage()));
				}
		);
 */


         List<String> ids = List.of("COL", "ARG");
		 ids.stream().filter(countryRepository::existsById).collect(Collectors.toList());

		 if (ids.isEmpty()) {
			 countryRepository.deleteAllById(ids);
		 } else {
			 System.out.println("Ids no existen en BD");
		 }


	}
}
