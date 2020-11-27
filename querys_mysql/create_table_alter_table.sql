create table funcionarios(
id int not null auto_increment primary key ,
nome varchar(30) not null,
peso decimal(5,2),
altura decimal(3,2),
dia_cadastro datetime default current_timestamp,
nacionalidade varchar(20) default 'Brasil');

describe funcionarios;

alter table funcionarios modify column historico char(10) after nome;
alter table funcionarios add column historico varchar(50);
alter table funcionarios drop column historico;