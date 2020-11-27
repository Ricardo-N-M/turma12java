create database Skyrim;
use Skyrim;

create table Classes (
nome varchar(255),
PosicaoTierList int,
idClasse int primary key auto_increment
);

create table Personagens (
	nome varchar(255),
	Habilidade int,
	id int primary key auto_increment,
	idClass int,
	constraint fk_classes foreign key(idClass) references Classes(idClasse));

insert into Classes (nome, PosicaoTierList) values
	('Cavaleiro',5),
    ('Mago',3),
    ('Necromante',1),
    ('Arqueiro',2),
    ('Paladino',4);
    
insert into Personagens (nome, Habilidade, idClass) values
	('Victor von Brauenstein',5,1),
    ('Johanna Blach Sydow', 10,5),
    ('Richter "Eagle Eye" Sprangwelle',1,2),
    ('Bachtrish Charlotte Sprengel',9,4),
    ('Ricardo M Frankensteiner', 2,3);
    
select * from Classes
inner join Personagens on Classes.idClasse = Personagens.idClass