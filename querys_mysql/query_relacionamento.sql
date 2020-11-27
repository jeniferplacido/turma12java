create database dbaulachaves1;
use dbaulachaves1;

create table tb1_pessoa(
idPessoa integer primary key auto_increment,
nome varchar(255));

create table tb2_carro (
idCarro integer primary key auto_increment,
nomeCarro varchar(255),
marca varchar(255),
idPessoa integer,
foreign key (idPessoa) references tb1_pessoa (idPessoa));

insert into tb1_pessoa (nome) values
('Juliana'),
('Julio'),
('Marcio');

select*from tb1_pessoa;

insert into tb2_carro (nomeCarro, marca, idPessoa) values
('Gol', 'Wolks', 2),
('Palio', 'Fiat', 3);


select*from tb2_carro
inner join tb1_pessoa
where tb1_pessoa.IdPessoa = tb2_carro.idPessoa;