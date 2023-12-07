package com.note.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.note.model.UserDetails;

public interface IUserDetailsRepo extends JpaRepository<UserDetails, Integer>{

}
