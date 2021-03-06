package com.cg.apps.userappsecurity.service;

import com.cg.apps.userappsecurity.entities.User;

public interface IUserService {

   User findById(Long id);

   User register(User user);

   User update(User user);

}
