package edu.eci.arsw.mytourney.services.impl;

import edu.eci.arsw.mytourney.model.Usuario;
import edu.eci.arsw.mytourney.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserDetailsServicesImpl implements UserDetailsService {
    @Autowired
    UserServices userServices;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario user = userServices.findUserByEmail(username);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>(Collections.singleton(user.getRole()));
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
                true, true, true, true, grantedAuthorities);
    }
}
