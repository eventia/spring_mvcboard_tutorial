[helloSpring]
1. Settings 
	1.1. pom.xml
	
2. DBTest
	2.1. JUnit Test Case
	











[sp16-oracle-01]
[�삤�씪�겢 DB �꽕�젙]
1. oracle 11g express db �꽕移�
2. Oracle SQL Developer �꽕移�
3. SQL �꽕�젙(�궗�슜�옄�깮�꽦, �뀒�씠釉붿깮�꽦)
4. �삤�씪�겢�슜 jdbc �뙆�씪 蹂듭궗 "C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6_g.jar" �쓣 "C:\Program Files\Java\jre1.8.0_172\lib\ext" �뵒�젆�넗由щ줈 蹂듭궗
5. �꽌踰꾩꽕�젙�닔�젙

view-list



[DOS & SQL紐낅졊]
MSDOS> sqlplus system/oracle
SQL> create user scott identified by tiger; 
SQL> grant connect, resource to scott;
SQL> exit
MSDOS>> sqlplus scott/tiger
SQL> CREATE SEQUENCE mvc_board_seq;

DROP TABLE mvc_board;
CREATE table mvc_board(
    bId NUMBER(4) PRIMARY KEY,
    bName VARCHAR2(20),
    bTitle VARCHAR2(100),
    bContent VARCHAR2(300),
    bDate DATE DEFAULT SYSDATE,
    bHit NUMBER(4) DEFAULT 0,
    bGroup NUMBER(4),
    bStep NUMBER(4),
    bIndent NUMBER(4)
    );
    
DROP SEQUENCE mvc_board_seq;
CREATE SEQUENCE mvc_board_seq;

INSERT INTO mvc_board (bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) 
    values (mvc_board_seq.nextval, 'abcd', 'is title', 'is content', 0, mvc_board_seq.currval, 0, 0);
INSERT INTO mvc_board (bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) 
    values (mvc_board_seq.nextval, 'joy', 'Happy man', '洹몃뒗 �빆�긽 �뻾蹂듯빀�땲�떎.', 0, mvc_board_seq.currval, 0, 0);


[server �꽕�젙]
1. Tomcat 7.0 �쓽 context.xml �꽕�젙

<Resource auth="Container"
	driverClassName = "oracle.jdbc.driver.OracleDriver"
	maxActive="50"
	maxWait="1000"
	name="jdbc/Oracle11g"
	username="scott"
	password="tiger"
	type="javax.sql.DataSource"
	url="jdbc:oracle:thin:@localhost:1521:xe"
/>
	