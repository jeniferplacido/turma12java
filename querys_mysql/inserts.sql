create database db_fiat;
use db_fiat;

/*drop table funcionarios;*/
CREATE table funcionarios (
		id int not null auto_increment,
		nome varchar(30) NOT NULL,
		nascimento date,
		sexo enum ('M','F'),
		peso decimal(5,2),
		altura decimal(3,2),
		nacionalidade varchar(20) DEFAULT 'Brasil',
		primary key (id)
        )engine=innodb;
        #MyIsan
        #History
Insert into funcionarios values 
(DEFAULT,'alex tenorio da silva', '2018-02-03','M','68.5','2.05', DEFAULT);

Insert into funcionarios values 
(DEFAULT,'alex tenorio da silva', NULL,'M','68.5','2.05', DEFAULT);


insert into funcionarios (nome, nascimento, sexo, peso, altura)values 
			('Gabriela', '1998-02-03','F','58.5', 1.60),
			('João', '1998-02-04','M','68.5', 1.80),
			('Marcio', '1998-02-04','M','69.5', 1.70);
                        
select * from funcionarios;