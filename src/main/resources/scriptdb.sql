
CREATE TABLE Paciente(
	id_paciente int PRIMARY KEY,
	nombre_completo text,
	edad INT,
	fecha_nacimiento date,
	direccion TEXT,
	telefono varchar(20),
	sexo VARCHAR(2),
	observaciones TEXT
);

select * from paciente p;





create table usuario(
	id_usuario int PRIMARY KEY,
	nombre_completo TEXT,
	tipo TEXT,
	edad INT,
	contrasenha TEXT,
	direccion TEXT,
	telefono varchar(20),
	rol VARCHAR(20),
	sexo VARCHAR(2)
);



CREATE table ficha_clinica(
id_ficha serial PRIMARY key,
id_paciente INT,
id_usuario INT,
fecha TIMESTAMP,
motivo TEXT,
diagnostico TEXT,
observacion TEXT,
FOREIGN KEY (id_paciente) references paciente (id_paciente),
FOREIGN key (id_usuario) references usuario (id_usuario)
);

create table tratamiento (
id_tratamiento serial PRIMARY KEY,
descripcion TEXT,
id_ficha INT,
costo INT,
FOREIGN key (id_ficha) REFERENCES ficha_clinica(id_ficha)
);



CREATE TABLE receta(
id_receta serial PRIMARY KEY,
id_ficha INT,
medicamento TEXT,
indicaciones TEXT,
FOREIGN key (id_ficha) REFERENCES ficha_clinica (id_ficha)
);

INSERT INTO public.usuario (id_usuario, nombre_completo, tipo, edad, contrasenha, direccion, telefono, rol, sexo) VALUES(5031204, '', '', 0, '', '', '', '', '');


INSERT INTO public.paciente (id_paciente, nombre_completo, edad, fecha_nacimiento, direccion, telefono, sexo, observaciones) VALUES(5031217, 'matias nicolas riquelme gabazza', 24, '29/01/2001', '12 ptdas c/ parapiti Nro 922', '0981123456', 'M', 'paciente con caries');

INSERT INTO public.paciente (id_paciente, nombre_completo, edad, fecha_nacimiento, direccion, telefono, sexo, observaciones) VALUES(1091161, 'norma beatriz gabazza sanabria', 57, '21/07/1968', '12 ptdas c/ parapiti Nro 922', '0981246751', 'F', 'tratamiento para conducto');

delete from paciente p where p.id_paciente = '1875649';

select * from paciente p;

