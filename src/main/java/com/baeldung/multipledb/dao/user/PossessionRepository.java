package com.baeldung.multipledb.dao.user;

import com.baeldung.multipledb.model.user.Possession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PossessionRepository extends JpaRepository<Possession, Long> {

}