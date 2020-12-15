package com.example.demo.Seguranca;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;


@Repository
@Transactional //Leva o banco de dados de um estado consistente a outro
public class ImplementsUserDetailsService implements UserDetailsService{
	//UserDetailsService recupera os dados de um usuario dado seu username

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByLogin(login);
		
		if(usuario == null){
			throw new UsernameNotFoundException("Usuario(a) não encontrado(a)!");
		}
		return new User(usuario.getUsername(), usuario.getPassword(), true, true, true, true, usuario.getAuthorities());
	}

}