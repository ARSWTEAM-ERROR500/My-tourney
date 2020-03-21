package edu.eci.arsw.mytourney.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN,PLAYER,REFEREE;

    @Override
    public String getAuthority() {
        return name();
    }
}
