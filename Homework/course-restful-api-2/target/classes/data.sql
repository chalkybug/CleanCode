INSERT INTO users(id, name, email, password) VALUES
 (1, 'Alice', 'alice@gmail.com', '123456'),
 (2, 'Bob', 'bob@gmail.com', '123456'),
 (3, 'Hub', 'hub@gmail.com', '123456'),
 (4, 'Foo', 'foo@gmail.com', '123456');

INSERT INTO teachers(phone, experiences, id) VALUES
 ('0981023023', 10, 1),
 ('0967876545',5, 2);

 INSERT INTO students(year,id) VALUES
  (3, 3),
  (4,4);

INSERT INTO courses(id,name,description,location,opened,teacher_id) VALUES
 (1, 'SQL', 'Training SQL', 'HN','20201010',1),
 (2, 'PYTHON', 'Training Python', 'HCM','20210101',2),
 (3, 'SQL2', 'Training Python', 'HCM','20230101',1);
