package br.com.rd.queroserdev.mvc.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.mvc.loja.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);

}