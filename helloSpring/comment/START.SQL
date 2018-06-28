DROP TABLE IF EXISTS member;
CREATE table `member`(
    `user_id` VARCHAR(45) NOT NULL,
    `user_pw` VARCHAR(45) NULL,
    `user_name` VARCHAR(45) NULL,
    `user_email` VARCHAR(45) NULL,
	primary key (user_id)
) engine=InnoDB character set = utf8;
    

INSERT INTO member (user_id, user_pw, user_name, user_email) values ('A001', '1111', 'KIM', 'kim@abc.com');
INSERT INTO member (user_id, user_pw, user_name, user_email) values ('A002', '1111', 'LEE', 'lee@abc.com');
INSERT INTO member (user_id, user_pw, user_name, user_email) values ('A003', '1111', 'BAE', 'bae@abc.com');
INSERT INTO member (user_id, user_pw, user_name, user_email) values ('B001', '1111', 'È«±æµ¿', 'hong@abc.com');
INSERT INTO member (user_id, user_pw, user_name, user_email) values ('B002', '1111', '°¡³ª', 'gana@abc.com');


SELECT * FROM test1.member;


