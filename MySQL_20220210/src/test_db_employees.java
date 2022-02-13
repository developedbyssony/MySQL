
-- 조회구문에 조건을 걸기 위해서 WHERE이라는 구문을 사용합니다.
-- SELECT 조회컬럼 FROM 테이블명 WHERE 컬럼명='조건에 맞는 값';
-- 이름이 김자바인 사람만 출력하기

SELECT * FROM users WHERE user_name ='김자바';

-- user_name 외의 다른 조건으로 필터링하기

SELECT * FROM users WHERE user_name ='쿼리문';
SELECT * FROM users WHERE id ='aaa123';
SELECT * FROM users WHERE pw ='bbbb';

-- 조건 여러개를 걸 경우 AND, OR키워드를 쓰시면 됩니다.
-- 아이디가 aaa123이거나 이름이 쿼리문인 것을 가져오기

SELECT * FROM users WHERE id='aaa123' OR user_name='쿼리문';

-- AND 키워드를 이용해서 특정 조건을 2개 만족하는 데이터를 하나 가져와보세요.
-- 아이디가 aaa123이면서 동시에 이름이 쿼리문인 자료 가져오기alter

SELECT * FROM users WHERE id='aaa123' AND user_name='쿼리문';

-- 데이터 수정하기
-- UPDATE 테이블명 SET 컬럼명1='값1', 컬럼명2='값2' ...;
-- 주의하실점은 WHERE을 걸지 않으면 해당 컬럼의 모든 값이 일괄적으로 바뀝니다.
-- users 테이블의 pw를 전부 'pppp'로 바꾸기
-- UPDATE users SET pw='pppp'; // 아래 구문 0으로 맞춰놓고 컴파일 후 실행해야 변경됩니다.

SET SQL_SAFE_UPDATES=0; -- 0이면 안전모드 비활성화, 1이면 다시 활성화
SELECT *  FROM users;

-- WHERE 구문을 이용해 pw컬럼에 있는 6개의 값을 전부 다르게 바꿔주세요.

UPDATE users SET pw='1111' WHERE id='aaa123';
UPDATE users SET pw='3333' WHERE id='abc1234';
UPDATE users SET pw='4444' WHERE id='bbb123';
UPDATE users SET pw='5555' WHERE id='bbb126';
UPDATE users SET pw='6666' WHERE id='ccc123';
UPDATE users SET pw='7777' WHERE id='qwer123';

-- 마지막 하나는 이름과 비밀번호를 함께 바꿔주세요.

UPDATE users SET user_name='음', pw='5' WHERE id='aaa123'; 

-- 데이터 삭제
-- DELETE FROM 테이블명; 을 할 경우 테이블 전체 데이터가 싹 날아갑니다.
-- DELETE 구문도 역시 일반적으로 WHERE과 조합해서 사용합니다.
-- 제일 위쪽에 있는(aaa123) 회원정보를 삭제해보겠습니다.

DELETE FROM users WHERE id='aaa123';

SELECT *  FROM users;

-- 도서관 테이블 구성하기 // 코드 실행 후 스케마 새로고침할 것.
-- drop table 테이블명 // 삭제 코드

CREATE TABLE library(
book_name varchar(30) primary key,
book_price int(7) not null,
book_pub varchar(20) not null,
book_writer varchar(10) not null,
book_page int(5) not null
);

-- INSERT INTO 구문을 이용해 책을 6권 넣어보겠습니다.

INSERT INTO library  values ('수학의정석일권',15000,'블랙박스','김영호',303);
INSERT INTO library values ('수학의정석이권', 16000, '블랙박스', '김영호', 305);
INSERT INTO library values ('아프니까청춘이다', 12000, '민음사', '김난도', 130);
INSERT INTO library values ('어쩌다한국인', 13000, '중앙북스', '허태균', 120);
INSERT INTO library values ('인터랙션 디자인의 본질', '14000', 'ux writer', '앨런 쿠퍼', 400);
INSERT INTO library values ('호밀밭의파수꾼', 10000, '창작과비평', '데이비드샐린저', 210);

SELECT *  FROM library; 

-- 테이블을 일괄적으로 날려버리는 명령어

drop table library;

-- employees를 사용 스키마로 지정해주세요.(명령어로)

use employees;

-- employees 스키마 내부의 employees 테이블을 조회

SELECT * FROM employees;

-- 원래 테이블을 조회할 때는 스키마명.테이블명으로 모두 표기해야 합니다.

SELECT * FROM employees.employees;

-- 스키마명. 테이블명으로 조회할때는 use중이지 않은 스키마의 테이블도 조회할 수 있습니다.

SELECT * FROM ict_practice2.users; 
SELECT * FROM ict_practice2.library; 

-- 컬럼을 전체가 아닌 임의로 가져올때는 컬럼명을 ,로 구분합니다.
-- 이 경우 모든 컬럼이 아닌 일부 컬럼만 조회할 수도 있으며
-- 심지어 한 개의 컬럼만 조회하는 등 개수조절도 가능합니다.

SELECT gender, first_name, last_name FROM employees;
SELECT gender FROM employees;

-- CMD환경에서는 좌측 스키마처럼 스키마 목록을 보여주는 창이 없으므로
-- 아래 명령어를 이용해 SCEMA 목록을 확인할 수 있습니다.
-- CMD환경 로그인 명령어 -> mysql -u 계정명 -p

SHOW databases; 

-- 현재 DB 정보를 조회하기 위해서는
SHOW TABLE STATUS;

-- 특정 테이블의 컬럼 정보를 보고 싶다면 아래 명령어를 씁니다.
-- DESCRIBE 테이블명 혹은 DESC 테이블명;

DESCRIBE employees;
DESC employees;

-- ict_practice2를 디폴트 스키마로 잡아주세요.

use ict_practice2;

-- 테이블을 생성합니다.
-- 테이블 생성 시 찍힌 제약조건과 컬럼명을 이용해 만들어주세요.

CREATE TABLE userTbl (
user_id varchar(8) primary key,
user_name varchar(10) not null,
birth_year int(4) not null,
addr varchar(4) not null,
phone_number varchar(11),
height int(3),
reg_date date
);

SELECT * FROM userTbl; 
