package com.osc.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.osc.user.entities.Session;

public interface SessionRepository extends JpaRepository<Session, Integer>{

}
