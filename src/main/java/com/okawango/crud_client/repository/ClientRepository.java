package com.okawango.crud_client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.okawango.crud_client.domain.Client;

public interface ClientRepository  extends JpaRepository<Client, Long>{

}
