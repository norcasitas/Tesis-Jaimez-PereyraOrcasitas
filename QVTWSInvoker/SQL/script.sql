create database qvtwsinvoker;

CREATE  TABLE categories (
  id SERIAL ,
  name VARCHAR(100) NOT NULL ,
  PRIMARY KEY (id) );

CREATE  TABLE wsdls (
  id SERIAL,
  name VARCHAR(100) NOT NULL,
  url VARCHAR(45) NOT NULL,
  category_id INT NOT NULL,
  reputation INT DEFAULT 0,
  response INT DEFAULT 99999,
  availability INT DEFAULT 0,
  PRIMARY KEY (id) );
  
CREATE USER tesis WITH PASSWORD 'tesis';
grant all privileges on database qvtwsinvoker to tesis;