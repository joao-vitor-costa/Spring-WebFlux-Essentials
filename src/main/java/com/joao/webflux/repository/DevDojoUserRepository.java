package com.joao.webflux.repository;

import com.joao.webflux.domain.DevDojoUser;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface DevDojoUserRepository extends ReactiveCrudRepository<DevDojoUser, Integer> {

    Mono<DevDojoUser> findByUsername(String username);
}
