<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
<%-- TODO : 외부 css 파일로 --%>
        <style>
            div {
                height: 40px;
            }
            div a {
                padding: 0 10px 0 5px;
                border-right: 1px solid #000;
            }
            div a:last-child {
                border: 0;
            }
            table {
                width: 100%;
            }

            table thead tr th {
                background-color: mediumseagreen;
                border-right: 1px solid #fff;
                color: #fff;
                padding: 10px 0;
            }
        </style>
        <title>와이파이 정보 구하기</title>
    </head>
    <body>
        <h1>와이파이 정보 구하기</h1>

        <div>
            <a href="#">홈</a>
            <a href="#">위치 히스토리 목록</a>
            <a href="#">Open API 와이파이 정보 가져오기</a>
        </div>

        <form>
            <label> LAT :
                <input type="text" placeholder="0.0">
            </label>
            <label> LNT :
                <input type="text" placeholder="0.0">
            </label>
            <button type="submit">내 위치 가져오기</button>
            <button type="button">근처 WIPI 정보 보기</button>
        </form>

        <table>
            <thead>
                <tr>
                    <th>거리(Km)</th>
                    <th>관리번호</th>
                    <th>자치구</th>
                    <th>와이파이명</th>
                    <th>도로명주소</th>
                    <th>상세주소</th>
                    <th>설치위치(층)</th>
                    <th>설치유형</th>
                    <th>설치기관</th>
                    <th>서비스구분</th>
                    <th>망종류</th>
                    <th>설치년도</th>
                    <th>실내외구분</th>
                    <th>WIFI접속환경</th>
                    <th>X좌표</th>
                    <th>Y좌표</th>
                    <th>작업일자</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>위치 정보를 입력한 후에 조회해 주세요.</td>
                </tr>
            </tbody>
        </table>

    </body>
</html>