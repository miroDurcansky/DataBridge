CREATE TABLE IF NOT EXISTS tag_descs_ab_as_ke (
    "id" SERIAL NOT NULL PRIMARY KEY,
    "name" varchar(64) NOT NULL DEFAULT 'noname',
    "description" varchar(256) NOT NULL DEFAULT 'NONE',
    "type" varchar(32) NOT NULL DEFAULT 'PHYSICAL',
    "physical_type" varchar(32) NOT NULL DEFAULT 'NUMERIC',
    "physical_decimals" int NOT NULL DEFAULT 0,
    "physical_unit" varchar(16) NOT NULL DEFAULT 'units',
    "physical_min" double precision NOT NULL DEFAULT 0,
    "physical_max" double precision NOT NULL DEFAULT 1,
    "physical_min_alarm" double precision NOT NULL DEFAULT 0,
    "physical_max_alarm" double precision NOT NULL DEFAULT 1,
    "physical_min_warn" double precision NOT NULL DEFAULT 0,
    "physical_max_warn" double precision NOT NULL DEFAULT 1
);

CREATE TABLE IF NOT EXISTS tag_vals_ab_as_ke (
    id serial,
    "value_time" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "value" DOUBLE PRECISION NOT NULL DEFAULT '0',
    "valid" BOOLEAN NOT NULL DEFAULT '0',
    "descs_id" INT NOT NULL,
    CONSTRAINT tag_vals_ab_as_ke_descs_id_fkey FOREIGN KEY (descs_id) REFERENCES tag_descs_ab_as_ke(id)
);

ALTER TABLE tag_vals_ab_as_ke ADD CONSTRAINT tag_vals_ab_as_ke_pkey PRIMARY KEY (id);
