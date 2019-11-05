CREATE TABLE IF NOT EXISTS `product` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `image_url` varchar(50) DEFAULT NULL,
  `category_id` int(10) NOT NULL,
  `product_unit_id` int(10) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint(20) NOT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_by` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `inventory` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `product_id` int(10) NOT NULL,
  `total_quantity` int(10) DEFAULT NULL,
  `unit_price` float(8,2) DEFAULT NULL,
  `is_active` tinyint(1) DEFAULT '1',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint(20) NOT NULL,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_by` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS category
(
    id            INT(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    category_name VARCHAR(30) NOT NULL,
    description   VARCHAR(200),
    created_at    timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_by    bigint(20)  NOT NULL,
    updated_at    timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_by    bigint(20)  NOT NULL
);

CREATE TABLE IF NOT EXISTS product_units
(
    id            INT(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    unit_type     VARCHAR(30) NOT NULL,
    unit_quantity INT(10)     NOT NULL,
    created_at    timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_by    bigint(20)  NOT NULL,
    updated_at    timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_by    bigint(20)  NOT NULL
);

/************************************************************************/
/* ACCOUNTS TABLE */
/************************************************************************/
CREATE TABLE IF NOT EXISTS account
(
    id         INT(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name  VARCHAR(50) NOT NULL,
    email      VARCHAR(50) NOT NULL,
    phone      VARCHAR(15) NOT NULL,
    created_at timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_by bigint(20)  NOT NULL,
    updated_at timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_by bigint(20)  NOT NULL
);

CREATE TABLE IF NOT EXISTS account_cred
(
    id               INT(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    account_id       INT(10) NOT NULL,
    encrypt_password VARCHAR(30) NOT NULL,
    created_at       timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_by       bigint(20)  NOT NULL,
    updated_at       timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_by       bigint(20)  NOT NULL
);

CREATE TABLE IF NOT EXISTS account_addresses
(
    id          INT(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    account_id  INT(10) NOT NULL,
    address_line_1 VARCHAR(30) NOT NULL,
    address_line_2 VARCHAR(30) NOT NULL,
    city        VARCHAR(30) NOT NULL,
    state       VARCHAR(30) NOT NULL,
    pincode     INT(7) NOT NULL,
    created_at  timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_by  bigint(20)  NOT NULL,
    updated_at  timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_by  bigint(20)  NOT NULL
);

/************************************************************************/
/************************************************************************/
CREATE TABLE IF NOT EXISTS orders
(
    id           INT(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    account_id   INT(10) NOT NULL,
    address_id   INT(10) NOT NULL,
    total_amount FLOAT(8,2),
    order_date   timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_at   timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_by   bigint(20)  NOT NULL,
    updated_at   timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_by   bigint(20)  NOT NULL
);

CREATE TABLE IF NOT EXISTS order_details
(
    id         INT(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    order_id   INT(10) NOT NULL,
    product_id INT(10) NOT NULL,
    units      INT(10),
    unit_price FLOAT(8,2),
    order_date timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_at timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_by bigint(20)  NOT NULL,
    updated_at timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_by bigint(20)  NOT NULL
);
