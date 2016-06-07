package pik.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pik.dto.UserInfo;


import java.math.BigInteger;
import java.util.List;

public interface UserDao {

    UserInfo create(UserInfo user);

    UserInfo getById(String Id);

    UserInfo getByUserName(String username);

    UserInfo read(UserInfo user);

    List<UserInfo> readAll();

    Page<UserInfo> readAll(Pageable pageable);

    UserInfo update(UserInfo user);

    Boolean delete(UserInfo user);

    Boolean idExists(String userId);

    Boolean UserNameExists(String username);

    Boolean subscribe(UserInfo user, BigInteger course);

    Boolean unsubscribe(UserInfo user, BigInteger course);


}
