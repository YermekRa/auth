package kz.bcc.balatime.repository;

import kz.bcc.balatime.model.BUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BUserRepository extends JpaRepository<BUser, Integer> {

    BUser findByLoginIgnoreCase(String login);

}
