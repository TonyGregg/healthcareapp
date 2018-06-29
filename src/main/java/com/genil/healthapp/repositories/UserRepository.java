package com.genil.healthapp.repositories;

import com.genil.healthapp.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by genil on 6/17/18 at 09 04
 **/
@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
}
