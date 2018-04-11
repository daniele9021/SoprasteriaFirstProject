package com.mcs.be.course.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mcs.be.course.model.CartEntry;

@Repository
public interface CartEntryDao extends JpaRepository<CartEntry, Long> {

}