CREATE TABLE IF NOT EXISTS Authors
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    age        INTEGER,
    book       VARCHAR(255)

);
CREATE TABLE IF NOT EXISTS Books
(
    id               SERIAL PRIMARY KEY,
    title            VARCHAR(255),
    publication_year INTEGER,
    Author_id        INTEGER,
    FOREIGN KEY (Author_id) REFERENCES Authors (id)


);