package com.poker.repository;

import org.springframework.stereotype.Repository;
import com.poker.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface UserstoryDaoRepository  extends JpaRepository<UserStory, Integer> {

}
