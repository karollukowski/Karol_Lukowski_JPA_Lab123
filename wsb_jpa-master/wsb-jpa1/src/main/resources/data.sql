insert into address (id, address_line1, address_line2, city, postal_code)
values (1, 'xx', 'yy', 'city', '62-030'),
       (2, 'aa', 'bb', 'city', '63-030'),
       (3, 'm', 'c', 'city', '77-030'),
       (4, 'gfd', 'aa', 'coo', '12-030'),
       (5, 'ad', 'ad2', 'cit2', '62-111'),
       (6, 'x712', 'fs', 'castle', '52-030');

insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id)
values (1, 'name', 'last', 'num', 'email', '1', '1999-01-01', 1),
       (2, 'name2', 'last2', 'num2', 'email2', '2', '2000-01-02', 2),
       (3, 'name3', 'last3', 'num3', 'email3', '3', '2000-01-03', 3);

insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
values (1, 'name', 'last', 'num', 'email', '1', 'DERMATOLOGIST', 1),
       (2, 'name2', 'last2', 'num2', 'email2', '2', 'DERMATOLOGIST', 2),
       (3, 'name3', 'last3', 'num3', 'email3', '3', 'DERMATOLOGIST', 3);

insert into visit (id, description, time, doctor_id, patient_id)
values (1, 'description', '2000-01-01T05:23:43', 1, 1),
       (2, 'description2', '2000-01-02T23:50:59', 1, 1);

insert into medical_treatment (id, description, type, visit_id)
values (1, 'description', 'EKG', 1),
       (2, 'description2', 'EKG', 2);