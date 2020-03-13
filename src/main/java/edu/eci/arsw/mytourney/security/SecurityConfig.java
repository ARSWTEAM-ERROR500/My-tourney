package edu.eci.arsw.mytourney.security;

import edu.eci.arsw.mytourney.model.Usuario;
import edu.eci.arsw.mytourney.persistence.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.NoOp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(new BCryptPasswordEncoder());
        return provider;
    }

    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        //en el primer ant matchers van las paginas de acceso libre (separadas por coma si hay mas de una)
        //en el segundo van las que solo requieren alguna autenticación
        //en el tercero van los que requieren ser capitan
        //en el cuarto van los que requieren ser capitan o jugador
        http
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/index2.html").authenticated()
                .antMatchers("/index3.html").hasRole("Capitan")
                //.antMatchers("/index3.html").hasAnyRole("Capitan","Jugador")
                .and()
                .httpBasic();
    }

    /*
    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        List<UserDetails> userDetails = new ArrayList<>();
        userDetails.add(User.withDefaultPasswordEncoder().username("prueba").password("prueba").roles("Capitan").build());
        return new InMemoryUserDetailsManager(userDetails);
    }

     */
}
