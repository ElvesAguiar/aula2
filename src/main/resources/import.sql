INSERT INTO funcao ( autoridade) VALUES ('Admin');
INSERT INTO funcao ( autoridade) VALUES ('Cliente');

INSERT INTO usuario ( nome,email,senha) VALUES ('Gabriel','biel@gmail.com','123456');
INSERT INTO usuario ( nome,email,senha) VALUES ('Marcus','magrao@gmail.com','123456');
INSERT INTO usuario ( nome,email,senha) VALUES ('Felipe','felps@gmail.com','123456');

INSERT INTO usuario_funcao (usuario_id,funcao_id) VALUES (1,1);
INSERT INTO usuario_funcao (usuario_id,funcao_id) VALUES (2,1);
INSERT INTO usuario_funcao (usuario_id,funcao_id) VALUES (2,2);
INSERT INTO usuario_funcao (usuario_id,funcao_id) VALUES (3,2);