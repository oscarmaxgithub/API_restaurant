DROP TABLE IF EXISTS restaurant;

CREATE TABLE restaurant (
                               id INT AUTO_INCREMENT  PRIMARY KEY,
                               name VARCHAR(250) NOT NULL,
                               longitud decimal NOT NULL,
                               latitud decimal DEFAULT NULL,
                               score numeric DEFAULT NULL
);