DROP TABLE IF EXISTS word;

CREATE TABLE word (
    id SERIAL NOT NULL,
    text character varying NOT NULL,
    palindrome boolean,
    firstChar character varying ,
    runtime timestamp,
    CONSTRAINT id_pk PRIMARY KEY (id)
);