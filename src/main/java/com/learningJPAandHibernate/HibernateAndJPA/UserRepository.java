package com.learningJPAandHibernate.HibernateAndJPA;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
