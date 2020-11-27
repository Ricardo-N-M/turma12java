create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria (
idCategoria int primary key auto_increment,
nome varchar (255));

create table tb_pizza (
idPizza int primary key auto_increment ,
nome varchar (255),
valor decimal (10,2),
borda_recheada boolean,
massa_fina boolean,
idCat int,
constraint fk_categoria foreign key (idCat) references tb_categoria(idCategoria)
); 

insert into tb_categoria (nome) values
	('Salgada'),
	('Doce'),
    ('Vegana'),
    ('Frutos do mar'),
    ('Especial');
    
insert into tb_pizza (idCat, nome, valor, borda_recheada, massa_fina) values
	(1,'Mussarela',25.99,false,true),
    (4,'Camarão',42.99,true,false),
    (2,'Romeu e julieta',32.49,true,false),
    (4,'Aliche',28.99,false,false),
    (2,'Prestígio',52,true,true),
    (1,'Frango com catupiry', 48.65,true,false),
    (5,'Do chef', 69.78,false,true),
    (5,'Siciliana',42,true,true),
    (3,'Brócolis com tofu',16.99,false,true),
    (1,'4 queijos',56.79,true,false),
    (2,'Banana com chocolate',49.99,true,true);
    
    select * from tb_pizza where valor>45;
    
    select * from tb_categoria
    inner join tb_pizza on tb_categoria.idCategoria = tb_pizza.idCat
    where tb_categoria.idCategoria = 2