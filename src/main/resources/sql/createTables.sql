CREATE TABLE users
(
    user_id       SERIAL PRIMARY KEY,
    username      VARCHAR(50) UNIQUE  NOT NULL,
    email         VARCHAR(100) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL
);

CREATE TABLE categories
(
    category_id SERIAL PRIMARY KEY,
    name        VARCHAR(50) NOT NULL
);

CREATE TABLE products
(
    product_id  SERIAL PRIMARY KEY,
    name        VARCHAR(100) NOT NULL,
    description TEXT,
    price       DECIMAL(10, 2),
    link        TEXT,
    category_id INTEGER REFERENCES categories (category_id)
);

CREATE TABLE videos
(
    video_id    SERIAL PRIMARY KEY,
    title       VARCHAR(100) NOT NULL,
    description TEXT,
    url         VARCHAR(255) NOT NULL
);


CREATE TABLE reviews
(
    review_id  SERIAL PRIMARY KEY,
    user_id    INTEGER REFERENCES users (user_id),
    product_id INTEGER REFERENCES products (product_id),
    video_id   INTEGER REFERENCES videos (video_id),
    rating     INTEGER,
    comment    TEXT
);