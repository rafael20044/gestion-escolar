-- Crear tabla de estudiantes
CREATE TABLE estudiantes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    identificacion VARCHAR(100) UNIQUE NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    direccion VARCHAR(225),
    contacto VARCHAR(225)
);

-- Crear tabla de profesores
CREATE TABLE profesores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    identificacion VARCHAR(100) UNIQUE NOT NULL,
    contacto VARCHAR(225),
    materias VARCHAR(255)
);

-- Crear tabla de horarios
CREATE TABLE horarios (
    id INT PRIMARY KEY AUTO_INCREMENT,
    dia_semana VARCHAR(10) NOT NULL,
    hora_inicio TIME NOT NULL,
    hora_final TIME NOT NULL
);

-- Crear tabla de clases
CREATE TABLE clases (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    profesor_id INT,
    horario_id INT,
    FOREIGN KEY (profesor_id) REFERENCES profesores(id),
    FOREIGN KEY (horario_id) REFERENCES horarios(id)
);

-- Crear tabla de calificaciones
CREATE TABLE calificaciones (
    id INT PRIMARY KEY AUTO_INCREMENT,
    estudiante_id INT,
    clase_id INT,
    nota DECIMAL(5, 2),
    fecha DATE NOT NULL,
    FOREIGN KEY (estudiante_id) REFERENCES estudiantes(id),
    FOREIGN KEY (clase_id) REFERENCES clases(id)
);

-- Crear tabla de reportes
CREATE TABLE reportes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    estudiante_id INT,
    calificaciones TEXT,
    observaciones TEXT,
    fecha_generacion DATE NOT NULL,
    FOREIGN KEY (estudiante_id) REFERENCES estudiantes(id)
);
