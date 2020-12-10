package com.example.demo.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import javax.persistence.JoinColumn;
import org.hibernate.validator.constraints.NotEmpty;

//@Entity especifica que essa classe se conecta com/cria tabelas no banco de dados
@Entity
public class Usuario implements UserDetails, Serializable {
	//previne erros de versões sobrepostas
	private static final long serialVersionUID = 1L;

	//ATRIBUTOS --------------------------------------
	//@Id classifica como identificador, único de cada elemento
	@Id
	private String login;
	private String nomeCompleto;
	private String senha;
	@ManyToMany
	//@ManytoMany que essa tabela é uma de muitas que se conecta com várias outras. @Inner join cria
	//uma tabela á partir de juntar outras tabelas, pegando somente os elementos selecionados.
	@JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(name = "usuario_id",
				referencedColumnName = "login"), inverseJoinColumns = @JoinColumn
				(name = "role_id", referencedColumnName = "nomeRole"))
	private List<Role> roles;
	//SEGURANÇA-------------------------------------------
	@Override // sobrescreve outro métodos
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return this.roles;  

	}
	@Override
	public String getPassword() 
	{
		return this.senha;   	
	}
	@Override
	public String getUsername() 
	{
		return this.login; 
	}

	@Override
	public boolean isAccountNonExpired() {// a conta não venceu a validade
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() { // o usuário não está bloqueado
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {// se a senha não expirou
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {//o usuário está habilitado
		// TODO Auto-generated method stub
		return true;
	}
	// GETTER E SETTERS ------------------------------------------------------
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
}
