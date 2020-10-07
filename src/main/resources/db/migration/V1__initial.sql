CREATE TABLE "auto" (
    id_auto serial NOT NULL,
    marca character varying(100) NOT NULL,
    placa character varying(100) NOT NULL,
    num_licencia integer NOT NULL,
    foto character varying(200),
    modelo integer NOT NULL,
    descripcion character varying(200) NOT NULL,
    tipo_auto character varying(100) NOT NULL,
    estado_auto boolean NOT NULL,
    PRIMARY KEY (id_auto)
);

ALTER TABLE "auto"  OWNER to postgres;