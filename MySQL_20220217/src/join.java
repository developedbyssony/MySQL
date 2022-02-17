
-- [조인(JOIN)]
-- 테이블 2개를 합쳐주는 기능
-- 연관된 데이터를 여러 테이블에 나눠담았을 때
-- 그것을 다시 재조립해줍니다.
-- 조인 문법
-- SELECT 테이블1.컬럼1, 테이블1.컬럼2, 테이블2.컬럼1, 테이블2.컬럼2...
--    FROM 테이블1 조인구문 테이블2
--    ON 테이블1.공통컬럼 = 테이블2.공통컬럼;

USE ict_practice2;

-- userTbl과 buyTbl을 조회해보겠습니다.

SELECT * FROM userTbl;

-- 정규화로 인해 정해진 테이블을 다시 합쳐주는 것 = JOIN / 조인구문으로 테이블 2개를 합치기

SELECT * FROM buyTbl INNER JOIN userTbl ON buyTbl.user_id = userTbl.user_id; -- buyTbl과 userTbl을 합칠껀데 기준은 user_id이다.  

-- user_id 일치하면 join(정규화로 인해 데이터를 쪼갤 때 남기기로 한 최소한의 데이터를 찾아서 일치를 확인한 후 합침)
-- 지금 현재 구매자 정보를 조회하려고 하는데 필요한 정보는,
-- buyTbl의 구매 물품정보 전체에, 구매자 정보는 택배를 받기 위해서
-- 이름, 주소, 핸드폰 번호만 있으면 되는 상황입니다.
-- 조인 구문을 활용해 필요한 컬럼만 출력되게 수정해주세요.

select * from buyTbl;
select * from userTbl;

SELECT buyTbl.order_number, buyTbl.user_id, buyTbl.prod_name, buyTbl.group_name, buyTbl.price, buyTbl.amount, userTbl.user_name, userTbl.addr, userTbl.phone_number 
	FROM buyTbl INNER JOIN userTbl 
	ON buyTbl.user_id = userTbl.user_id; -- 정석적인 방법

SELECT buyTbl.order_number, buyTbl.user_id, buyTbl.prod_name, buyTbl.group_name, buyTbl.price, buyTbl.amount, user_name, addr, phone_number 
	FROM buyTbl INNER JOIN userTbl 
	ON buyTbl.user_id = userTbl.user_id; -- userTbl 컬럼의 경우 SELECT 뒤에서 컬럼명만 기입해도 ok

-- 위의 경우처럼 특정 테이블의 전체 데이터를 출력하는 경우는
-- 테이블명.*로 대체할 수 있습니다.

SELECT buyTbl.*,
  userTbl.user_name, userTbl.addr, userTbl.phone_number
  FROM buytbl INNER JOIN userTbl
  ON buyTbl.user_id = userTbl.user_id;

-- FROM구문에서 테이블명만 적는게 아니라, 테이블명 별명 형식으로 적는 경우는
-- 테이블명을 풀로 적지 않고 별명으로 대체해서 호출할 수 있습니다.
-- buyTbl은 b라는 별명을 붙이고 userTbl에는 u라는 별명을 붙이는 구문을
-- 아래와 같이 작성해 드리고, 아래에 제시된 구문을 수정해서
-- buyTbl의 구매 물품정보 전체에, 구매자 정보는 이름, 주소, 휴대폰 번호만
-- 조회되도록 만들어주세요.(단, buyTbl.*은 쓰지마세요.)

SELECT * FROM buyTbl b;
SELECT * FROM userTbl u;
SELECT b.order_number, b.user_id, b.prod_name, b.group_name, b.price, b.amount, u.user_name, u.addr, u.phone_number FROM buyTbl b INNER JOIN userTbl u ON b.user_id = u.user_id;

-- WHERE절 역시 JOIN문 뒤에 붙여서 쓸 수 있고, 필터링을 담당합니다.
-- 위의 구문에 구매물품 가격이 50000원 이상인 것만 남도록 처리해주세요.

SELECT b.order_number, b.user_id, b.prod_name, b.group_name, b.price, b.amount, u.user_name, u.addr, u.phone_number FROM buyTbl b INNER JOIN userTbl u ON b.user_id = u.user_id WHERE 50000 <= b.price;

-- 위쪽 JOIN구문을 활용하시되, 가격이 200000 이하인 품목만 남겨주시고
-- 그 남은 자료들을 가격순으로 내림차순 출력해주세요.

SELECT b.order_number, b.user_id, b.prod_name, b.group_name, b.price, b.amount, u.user_name, u.addr, u.phone_number FROM buyTbl b INNER JOIN userTbl u ON b.user_id = u.user_id WHERE 200000 >= b.price ORDER BY b.price DESC;

-- LEFT JOIN, RIGHT JOIN은 '공통데이터가 아닌 데이터'도 방향에 따라
-- 출력이 되기 때문에 공통데이터(INNER)가 아닌 데이터(OUTER)까지
-- 출력된다는 점을 이용해 OUTER JOIN이라고 부릅니다.
-- LEFT OUTER JOIN은 JOIN시 왼쪽 테이블의 자료는 모두 출력하고
-- 오른쪽 테이블 데이터는 왼쪽 기준 컬럼과 일치할 때만 출력합니다.

-- 반대로 RIGHT OUTER JOIN은 JOIN구문의 오른쪽 테이블의 자료는 전부 출력하고
-- 왼쪽 테이블 데이터는 오른쪽 테이블의 기준컬럼과 일치할 때만 출력합니다.

SELECT * FROM userTbl;
SELECT * FROM buyTbl;

-- LEFT JOIN 키워드를 쓰시되, userTbl을 왼쪽에, buyTbl을 오른쪽에 두고 작성해주세요.
-- 테이블 컬럼은 전체 출력으로 합니다.

SELECT * FROM userTbl u LEFT JOIN buyTbl b ON b.user_id = u.user_id; -- LEFT JOIN 기준으로 왼쪽에 있는 것은 전부 다 나와야함

-- RIGHT JOIN 키워드로도 똑같이 조인 시도를 한 번 해보세요.

SELECT * FROM userTbl u RIGHT JOIN buyTbl b On b.user_id = u.user_id; -- RIGHT JOIN 기준으로 오른쪽에 있는 것은 전부 다 나와야함

-- 이해를 돕기 위한 추가 테이블 추가

CREATE TABLE student(
user_name varchar(3) primary key,
user_addr char(2) not null
);

CREATE TABLE membership(
user_name varchar(3) primary key,
user_point int not null
);

INSERT INTO student VALUES('강건마', '서울');
INSERT INTO student VALUES('노영웅', '수원');
INSERT INTO student VALUES('이상용', '인천');
SELECT * FROM student;

INSERT INTO membership VALUES('강건마', 15000);
INSERT INTO membership VALUES('노영웅', 37000);
INSERT INTO membership VALUES('김철수', 2800);
SELECT * FROM membership;

-- user_name을 공통 컬럼으로 해서 INNER JOIN을 수행해보세요.
-- 출력컬럼은 전부 다입니다.

SELECT * FROM student s INNER JOIN membership m On s.user_name = m.user_name; -- 양쪽 모두에 있는 것만 살리겠다. 딱히 별명 안 붙여도 되는 상황 

-- user_name을 공통 컬럼으로 해서 LEFT JOIN을 수행해보겠습니다.

SELECT * FROM student s LEFT JOIN membership m ON s.user_name = m.user_name; -- left join = 왼쪽에 있는 것은 모두 살리겠다. (학생)
SELECT * FROM student s RIGHT JOIN membership m ON s.user_name = m.user_name; -- right join = 오른쪽에 있는 것은 모두 살리겠다. (멤버쉽)

-- MYSQL에서는 FULL OUTER JOIN(양쪽의 모든 데이터를 다 살림)이 안됩니다.
-- SELECT * FROM student s FULL JOIN membership m ON s.user_name = m.user_name; -- 실행 안됨
-- 2줄의 쿼리문 사이에 UNION 키워드를 배치해 하나로 연결해 실행하면 됩니다.

SELECT * FROM student s LEFT JOIN membership m 
    ON s.user_name = m.user_name 
    UNION 
    (SELECT * FROM student s RIGHT JOIN membership m 
    ON s.user_name = m.user_name);
