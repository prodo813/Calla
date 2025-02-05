## Calla

> 해당 프로젝트는 spring으로 구현한 쇼핑몰사이트 입니다.
> <br>
> 쇼핑몰 + 중고거래 + 커뮤니티를 결합한 사이트를 구현하였습니다.
<br>

## 개발환경
  - OS : windows 10 64 bit
  - JAVA : Java JDK 11.0.2
  - DBMS : Oracle 11g
  - DB Client Tool : Oracle SQL Developer
  - WAS : Apache Tomcat 9.0v
  - IDE : Eclipse
  - Spring : STS 3.9.18
  - Build : Maven 3.8.1
    
<br>

## 개발환경 세팅
<details>
<summary>JAVA - 클릭!</summary>
1. <a href="https://jdk.java.net/archive/">JDK 11.0.2</a> 설치 및 압축 풀기<br/>
2. 환경 변수 설정 [내 pc] -> [속성] -> [고급 시스템 설정] -> [고급] -> [환경 변수] 탭 <br/> 
&nbsp;&nbsp;[사용자 변수] -> [새로 만들기] (변수 명: JAVA_HOME / 변수 값 : jdk-11.0.2 폴더가 존재하는 경로 ex) C:\Program Files\jdk-11.0.2) <br/>
&nbsp;&nbsp;[시스템 변수] -> [Path] -> [편집] -> [새로 만들기] -> [%JAVA_HOME%\bin\] -> [확인] <br/>
  * 설정확인 : [cmd](관리자 권한) -> java -version
</details>

<details>
<summary>DB</summary>
1. <a href="https://www.oracle.com/database/technologies/xe-prior-release-downloads.html">Oracle Database 11g Express Edition Release 11.2.0.2.0</a> 설치 및 exe 파일 실행 <br/>
2. 윈도우 시작창에서 Run SQL Command Line 선택 <br/>
&nbsp;&nbsp;● conn /as sysdba로 접속 <br/>
&nbsp;&nbsp;● CREATE scott IDENTIFIED BY tiger <br/>
&nbsp;&nbsp;● GRANT CONNECT, DBA, RESOURCE TO scott <br/>
3. <a href="https://www.oracle.com/tools/downloads/sqldev-downloads.html">SQL developer Windows 32-bit/64-bit</a> 설치 (자바 8이상 설치되어 있는 경우) 및 실행 <br/>
4. 호스트, 포트, SID를 다음과 같이 입력하고 접속 클릭 <br/>
   <img loading="lazy" src="https://github.com/superDDangKong/Calla/assets/140034486/61b774d8-123b-45fa-a35d-0d25efdd2645">
</details>

<details>
<summary>WAS</summary>
1. <a href="https://tomcat.apache.org/download-90.cgi">Apache Tomcat 9.0</a> 설치
</details>

<details>
<summary>eclipse</summary>
1. <a href="https://www.eclipse.org/downloads/">Eclipse IDE for Enterprise Java and Web Developers</a> 설치 및 압축 해제 <br/>
2. eclipse.isi 파일 열기 <br/>
&nbsp;&nbsp;● -vm [설치된 jdk 경로]\bin 변경<br/>
&nbsp;&nbsp;● -Dosgi.requiredJavaVersion = 11 변경<br/>
</details>

<details>
<summary>STS</summary>
1. <a href="https://github.com/spring-attic/toolsuite-distribution/wiki/Spring-Tool-Suite-3">STS 3.9.18 full distribution on Eclipse 4.21.zip</a> 설치 및 압축 해제 <br/>
2. sts.isi 파일 열기 <br/>
&nbsp;&nbsp;● -vm [설치된 jdk 경로]/bin/javaw.exe 변경<br/>
&nbsp;&nbsp;● -Dosgi.requiredJavaVersion = 11 변경<br/>
</details>

<details>
<summary>maven</summary>
1.<a href="https://maven.apache.org/download.cgi"> apache-maven-x.x.x.bin.zip</a> 설치 및 압축 해제 <br/>
2. apache-maven-x.x.x 폴더를 C:\Study 폴더로 복사(폴더 생성) <br/>
3. 환경 변수 설정 [내 pc] -> [속성] -> [고급 시스템 설정] -> [고급] -> [환경 변수] -> [시스템 변수] -> [path] -> <br/>
  ‘C:\Study\apache-maven-x.x.x\bin 경로 추가 <br/>
4. 오라클 설치된 경로 확인 ex) C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar <br/>
5. 아래 코드를 cmd 화면에서 실행하여 Oracle JDBC driver를 로컬 메이븐 저장소에 추가 <br/>
  
```
mvn install:install-file
-Dfile=C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar
-DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0
-Dpackaging=jar 
```
BUILD SUCCESS가 뜨면 설치 성공
</details>

<details>
<summary>Spring project 설정</summary>
1. Project → Properties → Project Facets → Dynamic Web Module Version 4.0 & Java Version 11로 변경 <br/>
2. Project → Properties → Server → 서버 선택 <br/>
&nbsp;&nbsp;Project → Properties → Targeted Runtimes → Apache Tomcat v9.0 선택<br/>
3. xml 설정 (현 프로젝트 코드 참고) <br/>
4. (Maven Update 수행)프로젝트 마우스 오른쪽 클릭 -> Maven -> Update Project <br/>

</details>

<br>

## 사용 기술

| 분류                 | Badge                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| -------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| **Front - end**      | <img src="https://img.shields.io/badge/HTML5-E34F26?style=flat-square&amp;logo=html5&amp;logoColor=white"> <img src="https://img.shields.io/badge/css3-1572B6?style=flat-square&logo=css3&logoColor=white"> <img src="https://img.shields.io/badge/javascript-F7DF1E?style=flat-square&logo=javascript&logoColor=white"> <img src="https://img.shields.io/badge/jQuery-0769AD?style=flat-square&amp;logo=jQuery&amp;logoColor=white"> <img src="https://img.shields.io/badge/bootstrap-7952B3?style=flat-square&logo=bootstrap&logoColor=white"> |
| **Back - end**       | <img src="https://img.shields.io/badge/Spring-6DB33F?style=flat-square&amp;logo=Spring&amp;logoColor=white">                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| **Version Control**  | <img src="https://img.shields.io/badge/git-F05032?style=flat-square&logo=git&logoColor=white">                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| **DB**               | <img src="https://img.shields.io/badge/ORACLE-F80000?style=flat-square&logo=oracle&logoColor=white">    

<br>

## 프로젝트 역할
 - 저는 이 프로젝트에서 중고거래 상품 관리를 담당 하였습니다.

<br>


## 웹 실행 모습
<details> 
  <summary> 중고상품 메인 - 클릭! </summary> 
  <br>
  <p>
    1. 중고상품의 전체 조회가 가능합니다.<br/>
    2. 상품검색 기능(카테고리, 상품이름)이 포함되어 있습니다.<br/>
    3. 상품별 네비게이션바가 있습니다.<br/>
    4. 상품 좋아요, 최신순 나열이 가능합니다.
  </p>
  <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/265e1976-55a6-4671-81bc-e6d208cdd88a" width="1000px">
  <br>
</details>

<details> 
  <summary> 검색 기능 </summary> 
  <br>
  <p>
    1. 검색창에 상품이름(keyword)으로 검색시 keyword가 포함된 모든 상품 조회 .<br/>
    2. 네비게이션 기능을 통해 카테고리 클릭시 해당 카테고리 상품만 조회.<br/>
    3. 신상품 나열시 등록된지 2일 이하인 상품만 조회.<br/>
    4. 좋아요 순 나열시 좋아요가 많은 순서대로 상품 조회.<br/>
  </p>
  - 검색예시 1
  <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/8d1ec6db-4b47-4386-9e39-e716bc5f5ec7" width="1000px">
  <br>
  - 검색예시 2
  <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/bc77120b-7203-48fb-9eaf-280dc99d8aed" width="1000px">
  <br>
</details>

<details>
  <summary> 물건 등록 </summary> 
  <br>
  <p>
    1. 중고거래 탭에서는 자신이 올리고 싶은 상품 직접 등록.<br/>
    2. Session에 로그인 정보가 없을 시 상품등록 버튼 안보임.<br/>
    3. 상품등록 버튼을 누를시 상품 정보를 기재하는 페이지로 이동.<br/>
    4. 주소 입력시 다음 주소 api를 이용하여 작성자 주소 상세 개입 가능.<br/>
    4. 상품의 이미지 삽입.<br/>
  </p>
  - 물건 등록 예시1
  <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/1acae338-05e7-4762-82c3-af9cdadf19ab" width="1000px">
  <br>
  - 물건 등록 예시2 
  <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/f22d126e-48dc-4ffb-b11b-9cb3abaebe71" width="1000px">
  <br>
</details>

<details>
  <summary> 상품 상세 페이지 </summary> 
  <br>
  <p>
    1. 상품의 상세 페이지에서는 상품의 정보를 확인 가능.<br/>
    2. 상품의 수정 삭제 가능(해당 상품 판매자만).<br/>
    3. 상품 댓글 달기.<br/>
    4. 상품 판매자와 대댓글을 통한 가격문의 가능.<br/>
    4. 상품 좋아요 기능.<br/>
    5. 추천 상품 보기(같은 카테고리).<br/>
  </p>
  - 상품 상세 페이지 예시1
  <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/2ea10af8-872c-4cea-93df-23e37177a4d5" width="1000px">
  <br>
  - 상품 상세 페이지 예시2
  <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/0a7bcce7-43e8-47e5-946e-64bce2ddd2a4" width="1000px">
  <br>
</details>

<details>
  <summary> 댓글 기능 </summary> 
  <br>
  <p>
    1. 로그인 하지 않았을시 댓글 입력 불가능.<br/>
    2. 댓글 입력, 수정 삭제 시 alert창.<br/>
    3. 비밋 댓글 체크시 해당 상품 판매자와 댓글 작성자만 댓글 읽기 가능 나머지는 비밀 댓글로 보임.<br/>
  </p>
  - 댓글 예시1
  <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/ccadc2e5-b933-43c5-b41a-07c5ee87d5c0" width="1000px">
  <br>
  - 댓글 예시2
  <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/d542775b-b6be-4627-90c4-b0ed5d4373d1" width="1000px">
  <br>
  - 댓글 예시3
  <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/f8482cd3-3c19-47c1-90e0-f4e6c5df741e" width="1000px">
  <br>
</details>

<details>
  <summary> 좋아요 기능 </summary> 
  <br>
  <p>
    1. 상품의 좋아요 기능 추가.<br/>
    2. 한 상품에 좋아요를 눌렀으면 좋아요 버튼이 좋아요 취소 버튼으로 변화.<br/>
    3. 해당 상품 아이디값과 현재 로그인세션에 있는 아이디가 uProductLikeid를 가지고 있지 않을때만 좋아요 버튼이 그렇지 않을시 좋아요 취소로 보이도록 구성 .<br/>
  </p>
  - 좋아요 예시1
  <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/f2958f0a-d7d8-4741-9ad9-75bb8acec75f" width="1000px">
  <br>
 
</details>

<details>
  <summary> 매물지도 기능 </summary> 
  <br>
  <p>
    1. 매물지도 탭 클릭시 현재 상품이 등록된 주소를 바탕으로 마커표시.<br/>
    2. 마커에는 현재 상품에 대한 정보가 담겨있음.<br/>
    3. 해당 상품의 주소를 바탕으로 검색어에 입력시 그 주소에 해당하는 상품만 지도에 표시 .<br/>
    3. 상품보기 클릭시 해당 상품으로 바로 연결.<br/>
  </p>
  - 매물지도 예시1
  <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/509d8df6-2af7-4915-b9d8-3a07ec104e3e" width="1000px">
  <br>
  - 매물지도 예시2
   <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/9ebe79a9-8fb8-4ff5-b16b-81705a174291" width="1000px">
  <br>
  - 매물지도 예시3
   <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/6e0e3a25-6bd4-4a4a-8577-98edfbd1ea12" width="1000px">
  <br>
 
</details>

<details>
  <summary> 내가올린상품 기능 </summary> 
  <br>
  <p>
    1. 내가올린상품 탭에서는 현재 자신이 팔고있는 물건들의 리스트를 볼수있음.<br/>
    2. 현재 탭에서는 자신의 올린상품의 예약기능과 거래기능이 구성.<br/>
  </p>
  
  - 내가올린상품 예시1
  <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/92bb5962-03da-4779-a1ff-91a270b9c805" width="1000px">
</details>

<details>
  <summary> 예약 기능 </summary> 
  <br>
  <p>
    1. 내가올린상품 탭에서 예약기능 클릭시 alert창과 함께 예약이 완료 되고 해당 상품이 거래가능에서 예약중으로 바뀜.<br/>
    2. 예약기능 버튼클릭시 해당 버튼은 예약취소 버튼으로 바뀌고 예약취소 버튼시 해당상품은 예약중에서 거래가능으로 바뀜.<br/>
  </p>
  
  - 예약기능 예시1
  <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/0200b7b5-88b4-45d6-b014-536bf1d75800" width="1000px">
  
</details>

<details>
  <summary> 거래 기능 </summary> 
  <br>
  <p>
    1. 내가올린상품 탭에서 거래완료 클릭시 팝업창이 열리며 상품에 댓글을 단 사용자들의 닉네임 목록이 리스트로 나옴.<br/>
    2. 자신이 거래한 사용자의 닉네임을 체크하고 등록을 누르면 해당상품은 상품탭에서 삭제되고 판매목록에 해당상품이 추가됨.<br/>
    3. 거래자는 구매목록에 해당상품이 추가됨.<br/>
  </p>

   - 거래기능 예시1
  <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/cf340825-64b4-4cdd-930b-969d10996833" width="1000px">
  <br>
  - 거래기능 예시2
   <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/83ff40b5-3148-49e6-84c3-893e1b2bc54c" width="1000px">
  <br> 
</details>

<details>
  <summary> 리뷰 기능 </summary> 
  <br>
  <p>
    1. 구매자는 구매목록에서 해당 상품에 리뷰를 남길 수 있음.<br/>
    2. 리뷰를 작성하고 해당 상품자의 매너온도를 올리거나 낮출 수 있는 버튼이 있음.<br/>
    3. 해당리뷰는 상품상세페이지에서 판매자의 닉네임을 클릭시 자신이 쓴 리뷰와 다른 사람들이 쓴 리뷰룰 볼 수 있음.<br/>
  </p>

   - 거래기능 예시1
  <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/2aac90f6-f8e0-4de8-b7db-c608223ad987" width="1000px">
  <br>
  - 거래기능 예시2
   <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/eb563b5d-19fe-446f-ac1a-b9a658181d03" width="1000px">
  <br>
  - 거래기능 예시2
   <img loading="lazy" src="https://github.com/prodo813/Calla/assets/66214385/ebb0334a-cdc6-45a6-a9ef-f0059bfc56b4" width="1000px">
  <br> 
</details>






## ERD - Diagram

![calla DB 모델링](https://github.com/superDDangKong/Calla/assets/140034486/f616b63f-72bd-493e-adb0-2a521e5c6aab)

## 제작인원 및 기간

- **총 제작인원:** <a href="https://github.com/superDDangKong">박진성</a>, <a href="https://github.com/cocobono1">강정묵</a> <a href="https://github.com/prodo813">김홍석</a> <a href="https://github.com/DongGun01">이동건</a> | 해당 링크를 누르면 깃허브 페이지로 이동합니다.
- **제작 기간:** 2023/10/20 ~ 2023/12/15

