
-- AUTO_INCREMENT(자동증가)
-- INT(정수) 자료형이 붙은 컬럼에만 붙일 수 있고, 이게 붙은 컬럼은 자동으로 1씩 증가하는 숫자를 배정받습니다.
-- 시작은 1입니다.
-- INSERT INTO 구문이 실행될 때 마다 해당 컬럼에 들어갈 숫자를 자동으로 배정해줍니다.
-- 한 번 사용된 숫자는 다시는 사용되지 않습니다.

-- FORETION KEY(외래 키)
-- 쇼핑몰의 구매자는 반드시 회원이어야 합니다.
-- 특정 테이블에 존재하는 값만 해당 컬럼에 들여올 수 있도록 거는 제약조건
-- FOREIGN KEY를 거는 컬럼의 자료형과 크기는 참조하는 쪽과 원본 모두 같아야 합니다.
-- 참조컬럼에 있는 값만(userTbl의 user_id에 존재하는 값만) buyTbl의 user_id에 올 수 있습니다.

CREATE TABLE buyTbl (
order_number INT AUTO_INCREMENT PRIMARY KEY,
user_id VARCHAR(8) NOT NULL,
prod_name VARCHAR(6) NOT NULL,
group_name VARCHAR(4),
price INT(7) NOT NULL,
amount INT(3) NOT NULL
-- FOREIGN KEY(user_id) REFERENCES userTbl(user_id) -- userTbl의 user_id 중에서 골라서 buyTbl의 user_id에 넣을 수 있다. (회원만 구매할 수 있는 쇼핑몰이라고 가정)
);

INSERT INTO userTbl VALUES('CJH','채종훈', 2000, '경기', '011111111', '175', '2020-3-5');
INSERT INTO userTbl VALUES('SHM','손흥민', 1993, '영국', '010111111', '180', '2021-3-5');
INSERT INTO userTbl VALUES('EM','엘론머스크', 1971, '화성', '38483992', '171', '2021-12-6');

-- 가입한 회원이 물건을 산 이력이 남도록 하겠습니다.

INSERT INTO buyTbl VALUES(1, 'CJH', '기계식키보드', '주변기기', 200000, 1); -- buyTbl의 user_id는 userTbl(회원리스트)의 user_id에 적재되어있는 데이터만 들어올 수 있다. 

-- order_number 컬럼은 값을 안 주면(null을 주면) AUTO_INCREMENT에 의해 자동으로
-- 1씩 증가된 숫자를 배정받습니다.

INSERT INTO buyTbl VALUE(null,'CJH', '듀얼모니터',  '전자기기', 200000, 1);

-- userTbl에 없는 회원 아이디를 insert했을 경우

INSERT INTO buyTbl VALUE(null,'SYH', '듀얼모니터',  '전자기기', 200000, 1); -- a foreign key constraint fails, 테이블에 적재되지는 않으나 order_number는 outo_increment가 적용되어 숫자가 매겨짐
INSERT INTO buyTbl VALUES(null, 'SHM', '축구공', '운동용품', 100000, 1); -- order_num이 'userTbl에 없는 회원 아이디를 insert했을 경우' 이후로 책정됨
INSERT INTO buyTbl VALUES(null, 'EM', '풍산개', '애완동물', 500000, 1);

INSERT INTO userTbl VALUES('SYH','소윤희', 1992, '서울', '01045032245', 170, '2022-02-11');
INSERT INTO userTbl VALUES('CYE','최영은', 1993, '서울', '01011111111', 160, '2021-02-11');

INSERT INTO buyTbl VALUES(null, 'SYH', '아메리카노', '식품', 2000, 1);
INSERT INTO buyTbl (user_id, prod_name, group_name, price, amount) VALUES ('CYE', '아이스라떼', '식품', 3000, 2);

-- 여태까지의 SELECT 구문은 조건 없이 모든 데이터를 다 조회했습니다.
-- 극단적인 경우 employees 테이블의 모든 row를 다 조회하는(cmd환경) 경우
-- 조회시간이 말도 안되게 오래 잡히는 경우가 발생합니다.
-- 따라서 조건에 맞도록 필터링 하기 위해 WHERE 구문을 사용합니다.
-- SELECT 컬럼명1, 컬럼명2... FROM 테이블명 WHERE 컬럼명=조건식;

SELECT * FROM employees.employees; -- workbench는 기본적으로 11000까지만 노출 (300024 rows in set )

SELECT * FROM userTbl WHERE user_name='손흥민';
SELECT * FROM userTbl WHERE addr='서울';

-- 관계연산자를 이용해서 대소비교를 하거나 
-- AND, OR을 이용해 조건 여러개를 연결할 수 있습니다. 
-- 키가 180이상인 사람을 조회해주세요.

SELECT * FROM userTbl WHERE height >= 180; -- 키가 180 이상인 사람 조회 
SELECT * FROM userTbl WHERE height > 180 OR height = 180; -- 키가 180 초과인 사람이나 키가 180인 사람 조회 (키 180인 사람)
SELECT * FROM userTbl WHERE 1990 < birth_year AND birth_year < 2000; -- 1991 ~ 1999년생까지 조회 
SELECT * FROM userTbl WHERE 1991 <= birth_year AND birth_year <= 1999; -- 1991 ~ 1999년생까지 조회 
SELECT * FROM userTbl WHERE height > 160; -- 키가 160 초과인 사람 조회 
SELECT * FROM userTbl WHERE height > 160 AND addr='경기'; -- 키가 160보다 크고 경기도에 사는 사람 조회

-- BETWEEN ~ AND 구문을 이용한 birth_year을 한번만 적고도
-- 해당 범위의 조회가 가능합니다.
-- 적은 두 개의 숫자는 포함합니다.

SELECT * FROM userTbl WHERE birth_year BETWEEN 1991 AND 1999; -- 1991과 1999 포함
SELECT * FROM userTbl WHERE birth_year BETWEEN 1970 AND 2000; -- 1970과 2000 포함

-- 위와 같이 숫자는 연속된 범위를 갖기 때문에 범위연산자로 처리가 가능하지만
-- addr같은 자료는 서울이 더 크다던가 영국이 더 적다던가 하는 연산적 처리가 불가능합니다.
-- 먼저 지역이 서울이거나 화성인 사람의 정보를 WHERE로 조회해주세요.

SELECT * FROM userTbl WHERE addr='서울' OR addr='화성';
SELECT * FROM userTbl WHERE height=180 OR height=160; 

-- in키워드를 사용하면 집합명 in (데이터 1,2,3,4 ...);
-- 특정 컬럼에 괄호에 담긴 데이터가 포함되는 경우를 전부 출력합니다.
-- 경기, 화성, 영국에 있는 사람들만 in 키워드로 조회해주세요.

SELECT * FROM userTbl WHERE addr in ('경기', '화성', '서울');
SELECT * FROM userTbl WHERE addr in ('서울', '경기');

-- LIKE 연산자는 일종의 표현 양식을 만들어줍니다.
-- LIKE 연산자를 이용하면 %라고 불리는 와일드 카드나 혹은 _라고 불리는
-- 와일드 카드 문자를 이용해 매칭되는 문자나 문자열을 찾습니다.

-- 채씨를 찾는 케이스(%는 몇 글자가 오더라도 상관없음)
-- 아래 구문은 채로 시작하는 모든 요소를 다 가져옵니다. 

SELECT * FROM userTbl WHERE user_name like '채%';  -- user_name이 채로 시작하는 모든 데이터를 조회, '채' 한글자도 포함
SELECT * FROM userTbl WHERE phone_number like '01%'; -- phone_number가 01로 시작하는 모든 데이터 조회, 01도 포함

-- 두 글자인 경우만 찾는 케이스(_는 하나의 한 글자임)

SELECT * FROM userTbl WHERE user_name like '__'; -- user_name이 두 글자인 모든 데이터를 조회
SELECT * FROM userTbl WHERE user_id like '___' AND user_id like '%H'; -- user_id가 3글자이면서 H로 끝나는 사람만 조회하는 쿼리문 1
SELECT * FROM userTbl WHERE user_id like '__H'; -- user_id가 3글자이면서 H로 끝나는 사람만 조회하는 쿼리문 2

-- 서브쿼리(하위쿼리)란 1차적 결과를 얻어놓고,
-- 거기서 다시 조회구문을 중첩해서 날리는 것을 의미합니다.
-- 채종훈보다 키가 큰 사람을 조회하는 예시를 보겠습니다.

-- 원시적인 방법으로 얻는 경우
-- 1. 채종훈의 키를 WHERE절을 이용해 확인한다.

SELECT height FROM userTbl WHERE user_name= '채종훈'; 

-- 2. 확인한 채종훈의 키를 쿼리문에 넣는다.
-- 175보다 큰 사람의 이름과 키만 조회해보겠습니다.

SELECT user_name, height FROM userTbl WHERE height >= '175';

-- 위의 경우에 1에서 값을 확인한 후, 코드를 한번 더 써야해서 시간이 걸린다. 또, 1의 user_name이 바뀔 때마다 이후 쓰는 코드의 값을 고쳐줘야하는 문제가 있다.
-- 이와 같은 문제는 아래의 코드로 개선할 수 있다. 서브 쿼리로 작성하여 두 줄에 걸쳐서 작성하지 않으며, 코드 보수 시 소괄호 안의 값만 고쳐주면 정상 실행되는 코드로 개선하였다.
-- 서브쿼리문의 실행 순서는 우선 소괄호 안의 쿼리문을 먼저 실행한 후, 바깥의 쿼리문이 실행되는 순서이다.

SELECT user_name, height FROM userTbl WHERE height > (SELECT height FROM userTbl WHERE user_name='채종훈');

-- 서브쿼리를 이용해 '특정 인물'보다 먼저 태어난 사람들만 골라내보세요.
-- 생년월일(날짜나 연도)도 대소비교가 가능합니다. 큰 쪽이 더 최근, 작은 쪽이 더 이전

SELECT user_name, birth_year FROM userTbl WHERE birth_year < (SELECT birth_year FROM userTbl WHERE user_name='최영은');

-- 최대값은 내장함수 max()로 구합니다.
-- 현재 userTbl 테이블에서 가장 나이가 적은 사람의 생년 조회

SELECT max(birth_year) FROM userTbl;

-- 최소값은 내장함수 min()로 구합니다.
-- 현재 userTbl 테이블에서 가장 나이가 많은 사람의 생년 조회

SELECT min(birth_year) FROM userTbl;

-- user_id에 M이 포함된 사람들 중 키가 제일 작은 사람보다
-- 키가 더 큰 사람을 구하시오. 

UPDATE userTbl SET user_id='MQQ' WHERE user_id='SYH';

SET SQL_SAFE_UPDATES=0;

SELECT user_id,user_name, height FROM userTbl WHERE height > (SELECT min(height) FROM userTbl WHERE user_id like '%M%'); -- 아이디에 M이 포함된 사람 중 170보다 키가 더 큰 사람 조회
SELECT user_id, height FROM userTbl WHERE user_id like '%M%'; -- user_id = EM, height = 171 / MQQ,170 / SHM,180이므로 최소값은 170

-- 2021년 가입자 중 가입일이 제일 빠른 사람보다 키가 큰 사람을 조회해주세요.
-- 날짜도 부등호로 조회 가능합니다. (작다 : 이전날짜, 크다 : 이후날짜)

-- 1. 2021년 가입자 중 가입일이 제일 빠른 사람의 가입일자 구하기

SELECT min(reg_date) FROM userTbl WHERE reg_date > '2021-01-01';

-- 2. 1의 쿼리문을 조건으로 해서 가입일이 제일 빠른 사람의 키 구하기 

SELECT height FROM userTbl WHERE reg_date = (SELECT min(reg_date) FROM userTbl WHERE reg_date > '2021-01-01');

-- 3. 2에서 구한 키를 조건으로 해서 최종적인 명단을 얻어냄

SELECT * FROM userTbl WHERE height = (SELECT height FROM userTbl WHERE reg_date = (SELECT min(reg_date) FROM userTbl WHERE reg_date > '2021-01-01'));
c
SELECT height FROM userTbl WHERE height > (SELECT min(reg_date) FROM userTbl);

SELECT * FROM  buyTbl; 
SELECT * FROM  userTbl;  
