create database e_commerce;
use e_commerce;

create table produtos(
	id int primary key auto_increment,
	nome varchar (255) not null,
	esgotado boolean,
	preco decimal (10,2),
	desconto boolean
);

insert into produtos (nome,esgotado,preco,desconto) values
	("Tênis",true,150.99,false),
    ("Meia soquete",false,15.12,true),
    ("Meia de cano longo",false,25.56,false),
    ("Bermuda cargo", true, 99.99,false),
    ("Calça de moletom", false, 59.99, true),
    ("Jaqueta esportiva", false, 119.99, false),
    ("Capacete de motocross",true,359.99, false),
    ("Balaclava", false, 79.99, true);
    
select * from produtos where preco > 100;

select * from produtos where preco <= 100