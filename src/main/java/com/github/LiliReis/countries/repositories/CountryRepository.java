package com.github.LiliReis.countries.repositories;

import com.github.LiliReis.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
