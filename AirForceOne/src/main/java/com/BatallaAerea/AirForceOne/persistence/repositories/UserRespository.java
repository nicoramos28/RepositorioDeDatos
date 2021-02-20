package com.BatallaAerea.AirForceOne.persistence.repositories;

import com.BatallaAerea.AirForceOne.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRespository extends JpaRepository<User, Long> {
                                            //ENTIDAD, TIPO DE DATO DEL ID

    /*
        @Query(value = "SELECT * FROM quote q WHERE q.quote = ?",
           nativeQuery = true)
    Quote findByQuote(String quote);
}
     */

    @Query(value = "SELECT * FROM gonza_se_la_come g WHERE " +
            "g.nombre_pute = ?",
            nativeQuery = true)
    User findByNombrePute(String nickname);


}
