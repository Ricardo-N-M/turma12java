create table tb_Funcionarios(
nome varchar(50),
sobrenome varchar(150),
salario decimal (10,2),
id integer primary key auto_increment,
cargo varchar (50));

insert into tb_Funcionarios (nome, sobrenome, salario, cargo) values
	("Juliana","Salomão",6500.50,"Supervisora de Arte"),
    ("Roberto","Felix",1565.79,"Copeiro"),
    ("Amanda","Nunes Conceição",14009.12,"C.E.O"),
    ("João","Rodrigues",900,"Estagiário"),
    ("Robson","Gonçalves",2016.59,"Designer JR");
    
select * from tb_Funcionarios where salario >=2000;

select * from tb_Funcionarios where salario < 2000;

update tb_funcionarios set salario = 12000 where id = 3


    